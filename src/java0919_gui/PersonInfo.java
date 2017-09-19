package java0919_gui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

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

		add(BorderLayout.CENTER, main);
		add(BorderLayout.NORTH, tool);

		main.registerB.addActionListener(this);
		main.modifyB.addActionListener(this);
		main.deleteB.addActionListener(this);
		main.clearB.addActionListener(this);
		main.table.addMouseListener(this);

		menu = new PersonMenu();

		setJMenuBar(menu);

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
			setRegister();
		} else if (obj == main.modifyB) {
			setModify();
		} else if (obj == main.deleteB) {

		} else if (obj == main.clearB) {

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
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
