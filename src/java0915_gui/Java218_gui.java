package java0915_gui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/*
 * AWT				Swing
 * Frame		->	JFame
 * TextField	->	JTextField
 * Button		->	JButton
 */

//JButton -> click -> ActionEvent -> ActionListener
//JTextField -> Enter -> ActionEvent -> ActionListener
class TextInput2 extends JFrame implements ActionListener {
	JTextField inputTxt;
	JButton clickBtn;
	JTextArea multiTra;
	JPanel pn;

	public TextInput2() {
		inputTxt = new JTextField(10);
		clickBtn = new JButton("input");
		pn = new JPanel();
		pn.add(inputTxt);
		pn.add(clickBtn);

		multiTra = new JTextArea(10, 10);

		// TextArea에서 편집 불가능
		multiTra.setEditable(false);

		this.add(pn, BorderLayout.NORTH);
		this.add(multiTra, BorderLayout.CENTER);

		// Button에 ActionListener 연결
		clickBtn.addActionListener(this);
		// TextField에 ActionListener 연결
		inputTxt.addActionListener(this);

		setSize(300, 200);
		setVisible(true);

		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TextField에 입력된 문자열을 리턴한다.
		String stn = inputTxt.getText();
		if (stn.length() == 0) {
			inputTxt.requestFocus();
			return;
		}
		// TextArea에 TextField에 입력된 문자열을 추가한다.
		multiTra.append(stn + "\r\n");
		// TextField를 초기화한다.
		inputTxt.setText("");
		// TextField로 포커스를 이동한다.
		inputTxt.requestFocus();
	}
}

public class Java218_gui {

	public static void main(String[] args) {
		new TextInput2();

	}

}
