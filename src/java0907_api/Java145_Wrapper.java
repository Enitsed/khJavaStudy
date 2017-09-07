package java0907_api;

/*
 * sn변수에 저장된 문자열 중에서 숫자 갯수를 출력하는 프로그램을 구현하세요.
 * [출력결과]
 * 숫자갯수:3
 */

public class Java145_Wrapper {

	public static void main(String[] args) {
		String sn = "korea12 paran3";
		// char[] arr = sn.toCharArray();
		int cnt = 0;

		/*
		 * for (int i = 0; i < arr.length; i++) { if (Character.isDigit(arr[i])) {
		 * cnt++; } }
		 */

		for (int i = 0; i < sn.length(); i++) {
			if (Character.isDigit(sn.charAt(i))) {
				cnt++;
			}
		}

		System.out.println("숫자갯수:" + cnt);

	}

}
