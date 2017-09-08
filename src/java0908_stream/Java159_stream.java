package java0908_stream;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

public class Java159_stream {

	public static void main(String[] args) {
		System.out.println("데이터 입력");

		// 콘솔창 목적지에 InputStream으로 연결
		InputStream is = System.in;

		try {
			int line = is.read();
			System.out.println((char) line);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
