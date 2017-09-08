package java0908_api;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Java155_exception {

	public static void main(String[] args) {
		File file = new File("sample.txt");
		FileReader fr = null;

		try {
			// FileNotFoundException은 checked exception이다.
			// 반드시 try~catch~finally(예외처리)를 한다.
			fr = new FileReader(file);
			System.out.println(fr.read());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
