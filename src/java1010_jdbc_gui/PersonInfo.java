package java1010_jdbc_gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PersonInfo extends JFrame implements ActionListener, MouseListener {
	PersonMenu menu;
	PersonToolbar tool;
	PersonMain main;
	int crow = -1;

	public PersonInfo() {
		setTitle(" 개인정보관리");

		menu = new PersonMenu();
		setJMenuBar(menu);

		tool = new PersonToolbar();
		main = new PersonMain();
		add(tool, BorderLayout.NORTH);
		add(main, BorderLayout.CENTER);

		main.registerB.addActionListener(this);
		main.modifyB.addActionListener(this);
		main.deleteB.addActionListener(this);
		main.clearB.addActionListener(this);

		tool.saveB.addActionListener(this);

		main.table.addMouseListener(this);

		main.registerB.addMouseListener(this);
		main.deleteB.addMouseListener(this);
		main.modifyB.addMouseListener(this);
		main.clearB.addMouseListener(this);

		setSize(520, 550);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new PersonInfo();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if (obj == main.registerB) {
			setRegister(); // [등록]
			setClear();
		} else if (obj == main.modifyB) {
			setModify(); // [수정]
		} else if (obj == main.deleteB) {
			delete(); // [삭제]
		} else if (obj == main.clearB) {
			allClear(); // [초기화] 텍스트박스 , 테이블 모두 초기화
		}

		if (obj == tool.saveB) {
			saveFile();
		}
	}

	// 테이블의 데이터 파일에 저장
	public void saveFile() {
		JFileChooser chooser = new JFileChooser();
		if (chooser.showOpenDialog(this) == JFileChooser.CANCEL_OPTION)
			return;
		File file = chooser.getSelectedFile();
		FileWriter fw = null;

		try {
			fw = new FileWriter(file);
			for (int row = 0; row < main.tableModel.getRowCount(); row++) {
				if (main.table.getValueAt(row, 0) == null) {
					return;
				} else {
					fw.write(main.tableModel.getValueAt(row, 0).toString() + "/"
							+ main.tableModel.getValueAt(row, 1).toString() + "/"
							+ main.tableModel.getValueAt(row, 2).toString() + "/"
							+ main.tableModel.getValueAt(row, 3).toString() + "/"
							+ main.tableModel.getValueAt(row, 4).toString() + "\r\n");
				}
			}

			fw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	// 모두 초기화
	public void allClear() {
		if (JOptionPane.showConfirmDialog(this, "정말 초기화 하시겠습니까?", "초기화", 0) == 1) {
			return;
		}

		setClear();
		tableClear();
	}

	// 테이블 모두 초기화
	public void tableClear() {
		main.tableModel.setRowCount(0);
		main.tableModel.setRowCount(50);
	}

	// 테이블에서 선택된 레코드 삭제
	private void delete() {
		int row = main.table.getSelectedRow();
		if (main.table.getValueAt(row, 0) == null) {
			setMessage("데이터가 입력된 레코드를 선택하세요.");
			return;
		}

		// 0 : yes, 1 : no
		if (getConfirmMessage("정말로 삭제하시겠습니까?") == 1) {
			return;
		}

		main.tableModel.removeRow(row);

		if (main.table.getRowCount() != 50) {
			main.tableModel.setNumRows(50);
		}

		createNumber();

		setClear();
	}

	// 테이블에 번호를 생성하는 메소드
	public void createNumber() {
		for (int i = 0; i < main.table.getRowCount(); i++) {
			if (main.table.getValueAt(i, 0) == null) {
				break;
			}

			main.table.setValueAt(Integer.toString(i + 1), i, 0); // i번째 행의 0번째 칼럼에 1부터 입력
		}
	}

	// 선택메세지
	int getConfirmMessage(String msg) {
		return JOptionPane.showConfirmDialog(this, msg, "삭제", JOptionPane.YES_NO_OPTION);
	}

	// 경고메세지
	public void setMessage(String msg) {
		JLabel label = new JLabel(msg);
		label.setFont(new Font("sansSerif", 0, 13));
		label.setForeground(Color.blue);
		JOptionPane.showMessageDialog(this, label);
	}

	// 등록
	private void setRegister() {
		if (crow >= 0) {
			setMessage("이미 등록된 레코드입니다.");
			return;
		}

		String name = main.nameF.getText().trim(); // trim() 불필요한 공백 제거
		String sex = main.manR.isSelected() ? "남" : "여";
		String tel1 = main.telC.getSelectedItem().toString();
		String tel2 = main.tel1F.getText().trim();
		String tel3 = main.tel2F.getText().trim();
		String email = main.emailF.getText().trim();

		// 모든 항목을 입력하지 않았을 때 경고.
		if (name.length() < 1 || tel2.length() < 1 || tel3.length() < 1 || email.length() < 1) {
			setMessage("모든 항목을 입력하십시오.");
			return;
		}

		// 항목 추가
		for (int i = 0; i < main.table.getRowCount(); i++) {
			if (main.table.getValueAt(i, 0) == null) {
				main.table.setValueAt(Integer.toString(1 + i), i, 0);
				main.table.setValueAt(name, i, 1);
				main.table.setValueAt(sex, i, 2);
				main.table.setValueAt(tel1 + "-" + tel2 + "-" + tel3, i, 3);
				main.table.setValueAt(email, i, 4);

				break;
			}
		}
	}

	// 수정
	private void setModify() {
		// 입력항목의 모든데이터를 얻음
		String name = main.nameF.getText().trim(); // trim() 불필요한 공백 제거
		String sex = main.manR.isSelected() ? "남" : "여";
		String tel1 = main.telC.getSelectedItem().toString();
		String tel2 = main.tel1F.getText().trim();
		String tel3 = main.tel2F.getText().trim();
		String email = main.emailF.getText().trim();

		if (name.length() < 1 || tel2.length() < 1 || tel3.length() < 1 || email.length() < 1) {
			setMessage("모든 항목을 입력하십시오.");
			return;
		}

		// 테이블에서 선택한 레코드(행)에 갱신함. -> crow가 값을 가지고 있음
		main.table.setValueAt(name, crow, 1);
		main.table.setValueAt(sex, crow, 2);
		main.table.setValueAt(tel1 + "-" + tel2 + "-" + tel3, crow, 3);
		main.table.setValueAt(email, crow, 4);

		setClear();

		// 현재 상태정보를 등록이 가능하도록 값을 변경함
		crow = -1;

	}

	// 입력창 초기화
	public void setClear() {
		main.nameF.setText("");
		main.tel1F.setText("");
		main.tel2F.setText("");
		main.emailF.setText("");
		main.telC.setSelectedIndex(0);
		main.manR.setSelected(true);
		// 커서위치
		main.nameF.requestFocus();
	}

	// 클릭한 레코드에 저장된 데이터를 입력창에 표시
	private void setInputRecord() {
		// 더블 클릭한 레코드의 행값을 얻는다.
		int row = main.table.getSelectedRow();

		if (row < 0 || main.table.getValueAt(row, 0) == null) {
			setMessage("데이터가 입력된 레코드를 선택하세요.");
			return;
		}

		crow = row;
		main.nameF.setText(main.table.getValueAt(row, 1).toString());

		// if (main.table.getValueAt(row, 2) == "남") {
		// main.manR.setSelected(true);
		// } else {
		// main.womanR.setSelected(true);
		// }

		String sex = main.table.getValueAt(row, 2).toString();
		if (sex.equals("남"))
			main.manR.setSelected(true);
		else
			main.womanR.setSelected(true);

		// String[] tel = main.table.getValueAt(row, 3).toString().split("-");
		// main.telC.setSelectedItem(tel[0]);
		// main.tel1F.setText(tel[1]);
		// main.tel2F.setText(tel[2]);

		String tel1 = main.table.getValueAt(row, 3).toString();
		StringTokenizer st = new StringTokenizer(tel1, "-");
		main.telC.setSelectedItem(st.nextToken());
		main.tel1F.setText(st.nextToken());
		main.tel2F.setText(st.nextToken());

		main.emailF.setText(main.table.getValueAt(row, 4).toString());

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		Object obj = e.getSource();
		if (obj == main.table && e.getClickCount() == 2) {
			setInputRecord();
		}

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		Object obj = e.getSource();
		if (obj == main.registerB) {
			main.registerB.setText("REGISTER");
		} else if (obj == main.modifyB) {
			main.modifyB.setText("MODIFY");
		} else if (obj == main.deleteB) {
			main.deleteB.setText("DELETE");
		} else if (obj == main.clearB) {
			main.clearB.setText("CLEAR");
		}

	}

	@Override
	public void mouseExited(MouseEvent e) {
		Object obj = e.getSource();
		if (obj == main.registerB) {
			main.registerB.setText("등록");
		} else if (obj == main.modifyB) {
			main.modifyB.setText("수정");
		} else if (obj == main.deleteB) {
			main.deleteB.setText("삭제");
		} else if (obj == main.clearB) {
			main.clearB.setText("초기화");
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {

	}

	@Override
	public void mouseReleased(MouseEvent e) {

	}

}
