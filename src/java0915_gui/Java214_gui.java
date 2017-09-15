package java0915_gui;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class FlowLayoutTest extends Frame {
	Button oneBtn, twoBtn, threeBtn;
	Panel pn;
	TextArea ta;

	public FlowLayoutTest() {
		oneBtn = new Button("one");
		twoBtn = new Button("two");
		threeBtn = new Button("three");

		// Panel 의 기본 레이아웃은 FlowLayout이다.
		// FlowLayout에 컴포넌트를 연결할 때는 add 해준 순서대로 왼쪽에서부터 오른쪽으로 연결 된다.
		pn = new Panel(); // Panel은 Frame과 다르게 혼자서 창을 띄울 수 없다.

		pn.add(oneBtn);
		pn.add(twoBtn);
		pn.add(threeBtn);

		ta = new TextArea(10, 20);

		this.add(BorderLayout.NORTH, pn);
		this.add(BorderLayout.CENTER, ta);

		setSize(500, 400);
		setVisible(true);
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
}

public class Java214_gui {

	public static void main(String[] args) {
		new FlowLayoutTest();
	}

}
