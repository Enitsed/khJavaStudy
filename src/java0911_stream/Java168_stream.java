package java0911_stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Java168_stream {

	public static void main(String[] args) {
		File file = new File("src/java0911_stream/song.txt");
		RandomAccessFile raf = null;
		String stn = new String("\r\nMaron 5 - Daylight, Sunday Morning\r\n");

		try {
			raf = new RandomAccessFile(file, "rw");

			// song.txt 파일의 총 길이를 리턴한다.
			long size = raf.length();
			// 파일의 끝으로 포인터를 이동한다.
			raf.seek(size);
			raf.writeBytes(stn);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				raf.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
