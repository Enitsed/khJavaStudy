package java0920_network;

import java.net.MalformedURLException;
import java.net.URL;

public class Java229_network {

	public static void main(String[] args) {
		try {
			URL url = new URL("http://magazine2.movie.daum.net/movie/46133");
			System.out.printf("getHost() : %s\n", url.getHost());
			System.out.printf("getPort() : %s\n", url.getPort());
			System.out.printf("getProtocol() : %s\n", url.getProtocol());
			System.out.printf("getPath() : %s\n", url.getPath());

		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

}
