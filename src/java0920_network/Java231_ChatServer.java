package java0920_network;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Java231_ChatServer {

	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(7777);
			while (true) {
				Socket client = server.accept();
				System.out.println("client가 " + client.getInetAddress().getHostAddress() + "로 접속");
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
