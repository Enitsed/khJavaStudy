package java0920_network;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Java230_ClientSocket {

	public static void main(String[] args) {
		try {
			// 3 클라이언트 요청 : 서버 주소, 포트 번호
			Socket socket = new Socket("127.0.0.1", 7777);

			// 4 입출력 스트림 연결
			InputStream is = socket.getInputStream();
			OutputStream os = socket.getOutputStream();
			OutputStreamWriter ow = new OutputStreamWriter(os);

			// 5 서버에 정보를 보냄
			ow.write("클라이언트 정보 보냄");
			ow.close();
			socket.close();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
