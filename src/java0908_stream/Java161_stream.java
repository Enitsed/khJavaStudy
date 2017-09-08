package java0908_stream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Java161_stream {

	public static void main(String[] args) {
		System.out.println("데이터 입력:");
		// 바이트 스트림
		InputStream is = System.in;
		// 바이트 스트림과 문자스트림 연결
		InputStreamReader ir = new InputStreamReader(is); // InputStream 과 BufferedReader 를 연결해주는 중개 클래스.
		// 문자 스트림
		BufferedReader br = new BufferedReader(ir);

		try {
			String line = br.readLine();
			System.out.println(line);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
