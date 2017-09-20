package java0920_network;

import java.awt.BorderLayout;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Java231_ChatClient {
	String userName;
	String host;
	int port;
	private JFrame frm;
	private JPanel pan;
	private JTextArea taOutput;
	private JLabel lbName;
	private JTextField tfInput;
	private DataInputStream dataIn;
	private DataOutputStream dataOut;
	Thread th;

	public Java231_ChatClient() {

	}

	public Java231_ChatClient(String host, int port) {
		System.out.println("사용자 이름을 입력하세요: ");
		Scanner sc = null;
		sc = new Scanner(System.in);
		userName = sc.nextLine();
		if (userName.equals(""))
			userName = "guest";

		this.host = host;
		this.port = port;
		initComponent();

		sc.close();
	}

	private void initComponent() {
		frm = new JFrame("채팅프로그램 [" + host + ":" + port + "]");
		taOutput = new JTextArea();
		taOutput.setEditable(false);

		tfInput = new JTextField(10);
		pan = new JPanel();
		lbName = new JLabel("입력: ");

		pan.setLayout(new BorderLayout());
		pan.add(tfInput, BorderLayout.CENTER);
		pan.add(lbName, BorderLayout.WEST);

		JScrollPane scroll = new JScrollPane(taOutput);

		frm.add(BorderLayout.CENTER, scroll);
		frm.add(BorderLayout.SOUTH, pan);

		frm.setSize(500, 600);
		frm.setVisible(true);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		Java231_ChatClient client = new Java231_ChatClient("127.0.0.1", 7777);

	}

}
