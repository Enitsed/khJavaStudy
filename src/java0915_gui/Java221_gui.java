package java0915_gui;

import java.awt.BorderLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

class MessageTest extends JFrame {
	JButton btn;

	public MessageTest() {
		btn = new JButton("click");
		add(btn, BorderLayout.CENTER);

		setSize(300, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				exit();
			}
		});
	}

	public void exit() {
		// 알림창을 띄우기 위해서 JOptionPane을 사용한다.
		// JOptionPane.showMessageDialog(this, "정말로 종료하시겠습니까?");
		// showMessageDialog() : 단순히 알림창만 뜨게한다.
		int chk = JOptionPane.showConfirmDialog(this, "정말로 종료하시겠습니까?", "종료", JOptionPane.YES_NO_OPTION);
		if (chk == JOptionPane.YES_OPTION) {
			System.exit(0);
		} else if (chk == JOptionPane.NO_OPTION) {

		}
	}
}

public class Java221_gui {

	public static void main(String[] args) {
		new MessageTest();

	}

}
