package java0825_method;

/*
 * [출력 결과]
 * tset avaj
 * java test
 */

public class Java063_method {

	public static void main(String[] args) {
		char[] arr = { 'j', 'a', 'v', 'a', ' ', 't', 'e', 's', 't' };

		System.out.println(reverse(arr));
		System.out.println(arr);
	}

	public static char[] reverse(char[] data) {
		// data의 요소 앞 뒤를 바꿔서 리턴하는 프로그램을 구현하세요.
		char[] temp = new char[data.length];

		for (int i = 0; i < data.length; i++) {
			temp[data.length - i - 1] = data[i];
		}
		return temp;
	}

}
