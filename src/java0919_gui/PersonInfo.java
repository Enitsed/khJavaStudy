package java0919_gui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class PersonInfo extends JFrame implements ActionListener, MouseListener {
	PersonMain main;
	PersonMenu menu;
	PersonToolbar tool;

	private int crow = -1;

	public PersonInfo() {
		main = new PersonMain();
		tool = new PersonToolbar();

		menu = new PersonMenu();
		setJMenuBar(menu);

		add(BorderLayout.CENTER, main);
		add(BorderLayout.NORTH, tool);

		main.registerB.addActionListener(this);
		main.modifyB.addActionListener(this);
		main.deleteB.addActionListener(this);
		main.clearB.addActionListener(this);

		menu.fsave.addActionListener(this);
		tool.saveB.addActionListener(this);
		menu.fopen.addActionListener(this);
		tool.openB.addActionListener(this);

		main.table.addMouseListener(this);
		main.registerB.addMouseListener(this);
		main.modifyB.addMouseListener(this);
		main.deleteB.addMouseListener(this);
		main.clearB.addMouseListener(this);

		setSize(520, 550);
		setVisible(true);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				String title = "종료";
				String message = "정말로 종료하시겠습니까?";
				if (getConfirmMessage(title, message) == JOptionPane.YES_OPTION)
					System.exit(0);
			}
		});

	}

	public static void main(String[] args) {
		new PersonInfo();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();

		if (obj == main.registerB) {
			setRegister(); // 등록
		} else if (obj == main.modifyB) {
			setModify(); // 수정
		} else if (obj == main.deleteB) {
			delete(); // 삭제
		} else if (obj == main.clearB) {
			init(); // 초기화
		} else if (obj == menu.fsave || obj == tool.saveB) {
			fileSave();
		}

	}

	public int getCrow() {
		return crow;
	}

	public void setCrow(int crow) {
		this.crow = crow;
	}

	// 데이터 등록
	private void setRegister() {

		if (getCrow() > -1) {
			setMessage("수정버튼을 누르세요");
			return;
		}

		// trim() : 불필요한 공백 제거
		String name = main.nameF.getText().trim();
		String sex = main.manR.isSelected() ? "남" : "여";
		String tel1 = (String) main.telC.getSelectedItem(); // .toString();
		String tel2 = main.tel1F.getText().trim();
		String tel3 = main.tel2F.getText().trim();
		String email = main.emailF.getText().trim();

		// 모든 항목을 입력하지 않았을 때 경고...
		if (name.length() < 1 || tel2.length() < 1 || tel3.length() < 1 || email.length() < 1) {
			setMessage("모든 항목을 입력하십시오.");

			return;
		}
		for (int i = 0; i < main.table.getRowCount(); i++) {
			if (main.tableModel.getValueAt(i, 0) == null) {
				main.tableModel.setValueAt(Integer.toString(1 + i), i, 0);
				main.tableModel.setValueAt(name, i, 1);
				main.tableModel.setValueAt(sex, i, 2);
				main.tableModel.setValueAt(tel1 + "-" + tel2 + "-" + tel3, i, 3);
				main.tableModel.setValueAt(email, i, 4);
				break;
			}
		}
		setClear();
	}

	private void setModify() {
		String name = main.nameF.getText().trim();
		String sex = main.manR.isSelected() ? "남" : "여";
		String tel1 = (String) main.telC.getSelectedItem(); // .toString();
		String tel2 = main.tel1F.getText().trim();
		String tel3 = main.tel2F.getText().trim();
		String email = main.emailF.getText().trim();

		// 모든 항목을 입력하지 않았을 때 경고...
		if (name.length() < 1 || tel2.length() < 1 || tel3.length() < 1 || email.length() < 1) {
			setMessage("모든 항목을 입력하십시오.");
			return;
		}

		main.tableModel.setValueAt(name, getCrow(), 1);
		main.tableModel.setValueAt(sex, getCrow(), 2);
		main.tableModel.setValueAt(tel1 + "-" + tel2 + "-" + tel3, getCrow(), 3);
		main.tableModel.setValueAt(email, getCrow(), 4);
		setClear();
		setCrow(-1);
	}

	private void delete() {
		int row = main.table.getSelectedRow();
		if (getCrow() < 0 || main.table.getValueAt(row, 0) == null) {
			setMessage("삭제할 레코드를 확인하세요");
			return;
		}

		String message = "선택한 레코드를 삭제하시겠습니가?";
		String title = "삭제";
		if (getConfirmMessage(title, message) == JOptionPane.NO_OPTION) {
			setMessage("취소되었습니다.");
			return;
		}

		main.tableModel.removeRow(row);
		setMessage("삭제되었습니다.");

		if (main.table.getRowCount() < 50) {
			main.tableModel.setRowCount(50);
		}

		// 새로운 번호 생성
		for (int i = 0; i < main.table.getRowCount(); i++) {
			if (main.table.getValueAt(i, 0) == null) {
				break;
			}
			main.table.setValueAt(Integer.toString(i + 1), i, 0);
		}

	}

	private void init() {
		setClear();
		setTableClear();
	}

	// 테이블 레코드 초기화 및 생성
	private void setTableClear() {
		main.tableModel.setRowCount(0); // 테이블 레코드 삭제
		main.tableModel.setRowCount(50); // 테이블 레코드 생성
	}

	private void setMessage(String message) {
		JOptionPane.showMessageDialog(this, message);
	}

	// 입력된 항목 초기화
	private void setClear() {
		main.nameF.setText("");
		main.tel1F.setText("");
		main.tel2F.setText("");
		main.emailF.setText("");
		main.telC.setSelectedIndex(0);
		main.manR.setSelected(true);
		// 커서위치
		main.nameF.requestFocus();

	}

	private int getConfirmMessage(String title, String message) {
		return JOptionPane.showConfirmDialog(this, message, title, JOptionPane.YES_NO_OPTION);
	}

	private void setInputRecord() {
		// 더블클릭한 테이블의 행의 번호를 리턴
		int row = main.table.getSelectedRow();

		if (row < 0 || main.table.getValueAt(row, 0) == null) {
			setMessage("빈 레코드를 선택하셨습니다.");
			return;
		}

		setCrow(row);

		String name = String.valueOf(main.table.getValueAt(row, 1));
		main.nameF.setText(name);

		if (main.table.getValueAt(row, 2) == "남") {
			main.manR.setSelected(true);
		} else {
			main.womanR.setSelected(true);
		}

		String[] tel = String.valueOf(main.table.getValueAt(row, 3)).split("-");
		main.telC.setSelectedItem(tel[0]);
		main.tel1F.setText(tel[1]);
		main.tel2F.setText(tel[2]);

		String email = String.valueOf(main.table.getValueAt(row, 4));
		main.emailF.setText(email);

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
			main.registerB.setText("Register");
		} else if (obj == main.modifyB) {
			main.modifyB.setText("Modify");
		} else if (obj == main.deleteB) {
			main.deleteB.setText("Delete");
		} else if (obj == main.clearB) {
			main.clearB.setText("Clear");
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
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	private void fileSave() {
		JFileChooser chooser = new JFileChooser();
		if (chooser.showSaveDialog(this) == JFileChooser.CANCEL_OPTION) {
			return;
		}
		File file = chooser.getSelectedFile();
		FileWriter fw = null;
		try {
			fw = new FileWriter(file);
			for (int i = 0; i < main.table.getRowCount(); i++) {
				if (main.table.getValueAt(i, 0) == null) {
					break;
				}

				String num = main.table.getValueAt(i, 0).toString();
				String name = main.table.getValueAt(i, 1).toString();
				String sex = main.table.getValueAt(i, 2).toString();
				String tel = main.table.getValueAt(i, 3).toString();
				String email = main.table.getValueAt(i, 4).toString();
				fw.write(num + "/" + name + "/" + sex + "/" + tel + "/" + email + "\r\n");
			}
			fw.flush();
			setMessage("저장되었습니다.");
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

}
