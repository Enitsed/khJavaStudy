package java0911_stream;

import java.io.File;
import java.io.IOException;

public class Java171_stream {

	public static void main(String[] args) {
		File file = new File("src/java0911_stream/prob.txt");
		if (!file.exists()) {

			try {
				// 파일 생성
				file.createNewFile(); // createNewFile() 메서드가 Throws 선언되어있기 때문에 호출하는 main 메서드에서 예외처리를 해줘야한다.
				System.out.println("파일 생성");
			} catch (IOException e) {
				e.printStackTrace();
			}

		} else {
			System.out.println("파일 존재");
		}

	}

}
