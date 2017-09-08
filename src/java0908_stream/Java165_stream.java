package java0908_stream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Java165_stream {

	public static void main(String[] args) {
		File file = new File("sample.txt");
		System.out.println(file.exists());
		System.out.println(file.isFile());
		System.out.println(file.length());
		System.out.println(file.canRead());

		FileWriter fw = null;

		try {
			// 두번째 인자인 true는 append 기능을 하고 false 일 때 update(overwrite)기능을 한다.(기본값:false)
			fw = new FileWriter(file, true);
			// write() : 데이터를 buffer에 담는다.
			fw.write("java\r\n");
			// flush() : 대상 파일에 buffer의 내용을 보내고 buffer를 clear한다.
			fw.flush();
			fw.write("jsp\r\n");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				// close() : flush + 연결종료
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
