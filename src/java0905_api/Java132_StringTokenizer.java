package java0905_api;

import java.util.StringTokenizer;

public class Java132_StringTokenizer {

	public static void main(String[] args) {
		// StringTokenizer(문자열, 구분자)
		// 문자열의 구분자가 공백일때는 2번째 인자값은 생략할 수 있다.
		StringTokenizer st = new StringTokenizer("java,jsp", ",");
		System.out.println("토큰갯수:" + st.countTokens());

		/*
		 * for (int i = 0; i < st.countTokens(); i++) {
		 * System.out.println(st.nextToken()); } // nextToken() 메소드 사용 시 메모리에서 완전히 제거된다.
		 * countTokens()의 개수가 줄어든다. jsp 출력 안됨
		 */

		// hasMoreTokens() : 메모리에 저장된 토큰이 있으면 true 없으면 false 리턴
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}

	}

}
