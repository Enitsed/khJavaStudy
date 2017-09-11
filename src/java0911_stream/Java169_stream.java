package java0911_stream;

import java.io.File;

public class Java169_stream {

	public static void main(String[] args) {
		File file = new File("src/java0911_stream/temp");
		if (!file.isDirectory())
			// temp 폴더를 생성
			file.mkdirs();
		System.out.println(file.isDirectory());

		file = new File("src/java0911_stream/sample.txt");
		System.out.println(file.exists());

		file = new File("src/java0911_stream");
		String[] list = file.list();
		for (String sn : list)
			System.out.println(sn);

		File[] listFile = file.listFiles();
		for (File fe : listFile)
			System.out.println(fe.getName());

		file = new File("src/java0911_stream/source.txt");
		if (file.exists()) {
			file.delete();
			System.out.println("파일 삭제");
		} else {
			System.out.println("파일 없음");
		}

	}

}
