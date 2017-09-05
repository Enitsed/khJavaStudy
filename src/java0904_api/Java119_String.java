package java0904_api;

/*
 * [출력결과]
 * aerok
 * korea
 * 
 */
public class Java119_String {

	public static void main(String[] args) {
		String sn = "korea";
		char[] data = display(sn);
		System.out.println(data);
		System.out.println(sn);
	}

	public static char[] display(String alpha) {
		// alpha 매개변수에 저장된 문자열을 reverse 한 후 반환하는 프로그램을 구현하세요.

		char[] arr = new char[alpha.length()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = alpha.charAt(alpha.length() - i - 1);
		}

		/*
		 * char[] temp = alpha.toCharArray(); char[] rev = new char[temp.length]; for
		 * (int i = temp.length - 1; i >= 0; i--) { rev[temp.length - i - 1] = temp[i];
		 * }
		 */

		/*
		 * String rev = new StringBuffer(alpha).reverse().toString(); rev =
		 * rev.toCharArray();
		 */

		return arr;

	}

}
