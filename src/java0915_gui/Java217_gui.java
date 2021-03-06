package java0915_gui;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

// Button -> click -> ActionEvent -> ActionListener
// TextField -> Enter -> ActionEvent -> ActionListener
class TextInput extends Frame implements ActionListener {
	TextField inputTxt;
	Button clickBtn;
	TextArea multiTra;
	Panel pn;

	public TextInput() {
		inputTxt = new TextField(20);
		clickBtn = new Button("input");
		pn = new Panel();
		pn.add(inputTxt);
		pn.add(clickBtn);

		multiTra = new TextArea(10, 10);

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

public class Java217_gui {

	public static void main(String[] args) {
		new TextInput();
	}

}
