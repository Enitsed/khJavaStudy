package java0904_api.prob;

/*
 * 1. 문자열(String)을 입력 받아, 해당 문자열을 
 *    문자 순서를 뒤집어서 char[]로 반환하는 메소드를 만들고,
 *    char[]을 입력 받아 출력하는 메소드를 만드시오. 
 * 2. 출력결과
 *    dlroW olleH
 *    !gnimmargorP avaJ
 */
public class Prob002_String {

	public static void main(String[] args) {
		char[] array1 = reverse("Hello World");
		printCharArray(array1);

		char[] array2 = reverse("Java Programming!");
		printCharArray(array2);
	}// end main()

	public static char[] reverse(String str) {
		// 여기를 구현하세요.
		/*
		 * char[] try1 = str.toCharArray(); char[] temp = new char[try1.length];
		 * 
		 * for (int i = 0; i < str.length(); i++) temp[i] = try1[str.length() - i - 1];
		 * 
		 * return temp;
		 */

		char[] data = new char[str.length()];

		for (int i = 0; i < data.length; i++) {
			data[i] = str.charAt(data.length - i - 1);
		}
		return data;

	}// end reverse()

	public static void printCharArray(char[] array) {
		System.out.println(array);
	}// end printCharArray()

}
