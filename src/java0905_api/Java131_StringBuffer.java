package java0905_api;

public class Java131_StringBuffer {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("java test");
		// StringBuffer -> String
		String ss = sb.toString();

		// String -> char[]
		char[] ca = ss.toCharArray();

		display(ca);
		
		////////////////////////////////////////

		display(sb.toString().toCharArray());

	}

	public static void display(char[] data) {
		for (char cn : data)
			System.out.println(cn);
	}

}
