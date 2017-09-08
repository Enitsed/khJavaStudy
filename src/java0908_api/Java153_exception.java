package java0908_api;

public class Java153_exception {

	public static void main(String[] args) {
		StringBuffer sb = null;
		try {
			sb.reverse();
		} catch (NullPointerException ex) {
			sb = new StringBuffer("java");
			System.out.println(sb.reverse());
		}
		System.out.println("program end");

	}

}
