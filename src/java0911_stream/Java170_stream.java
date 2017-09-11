package java0911_stream;

import java.io.File;

public class Java170_stream {

	public static void main(String[] args) {
		File file = new File("src/java0911_stream/");
		File[] fileList = file.listFiles();

		System.out.println("디렉토리 출력");
		for (File fe : fileList) {
			if (fe.isDirectory())
				System.out.println(fe.getName());
		}

		System.out.println("파일 리스트 출력");
		for (File fe : fileList) {
			if (fe.isFile())
				System.out.println(fe.getName());
		}

	}

}
