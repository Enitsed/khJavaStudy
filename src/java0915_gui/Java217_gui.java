package java0915_gui;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class TextInput extends Frame {
	public TextInput() {

		setSize(300, 200);
		setVisible(true);

		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
}

public class Java217_gui {

	public static void main(String[] args) {
		new TextInput();
	}

}
