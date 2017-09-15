package java0915_gui;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class UserLayout extends Frame {
	Button northBtn, centerBtn, southBtn, eastBtn, westBtn;

	public UserLayout() {
		northBtn = new Button("north");
		centerBtn = new Button("center");
		southBtn = new Button("south");
		eastBtn = new Button("east");
		westBtn = new Button("west");

		setLayout(new GridLayout(2, 3));
		this.add(northBtn);
		this.add(centerBtn);
		this.add(southBtn);
		this.add(eastBtn);
		this.add(westBtn);

		northBtn.setForeground(new Color(0, 255, 0)); // RGB값 0~255
		northBtn.setBackground(new Color(255, 0, 0)); // RED GREEN BLUE

		setBackground(Color.cyan); // 색깔 상수는 대소문자구별을 하지 않는다.

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

public class Java216_gui {

	public static void main(String[] args) {
		new UserLayout();
	}

}
