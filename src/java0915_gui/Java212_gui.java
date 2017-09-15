package java0915_gui;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Win2 extends Frame {
	public Win2() {
		// 윈도우창 크기 가로 300, 세로 400 픽셀단위
		setSize(300, 400);

		// 윈도우창을 화면에 표시
		setVisible(true);

		/*
		 * Exit2 exit = new Exit2(); this.addWindowListener(exit);
		 */

		// 익명클래스 이용
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
}

class Exit2 extends WindowAdapter { // 리스너를 상속받은 클래스는 전부 Adapter로 끝난다.
	@Override
	public void windowClosing(WindowEvent e) {
		// 시스템 종료
		System.exit(0);
	}
}

public class Java212_gui {

	public static void main(String[] args) {
		new Win2();
	}

}