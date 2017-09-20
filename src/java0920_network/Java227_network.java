package java0920_network;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class Java227_network {

	public static void main(String[] args) {
		Scanner sc = null;
		try {
			URL url = new URL("https://www.daum.net");
			URLConnection conn = url.openConnection();
			sc = new Scanner(conn.getInputStream());
			while (sc.hasNextLine())
				System.out.println(sc.nextLine());

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			sc.close();
		}

	}

}
