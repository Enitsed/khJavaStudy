package java0920_network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Java230_ServerSocket {

	public static void main(String[] args) {
		try {
			// 1 포트번호를 지정해서 서버 생성
			ServerSocket server = new ServerSocket(7777);

			// 2 클라이언트 요청이 들어올 때 까지 대기
			System.out.println("대기:");
			Socket socket = server.accept();
			System.out.println(socket);

			// 4 입출력 스트림 연결
			InputStream is = socket.getInputStream();
			OutputStream os = socket.getOutputStream();
			InputStreamReader ir = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(ir);

			// 5 클라이언트에서 보낸 메시지 읽음
			System.out.println(br.readLine());
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
