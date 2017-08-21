package java0821_basic;

public class Java007_operator {

	public static void main(String[] args) {
		int a = 3;
		int b = 4;
		System.out.println(a + b); // +는 산술 연산자
		System.out.println(a + "는(은) 삼입니다."); // +는 문자열 연결로 사용됨
		System.out.println("a = " + a); // 문자열 연결

		// 결과 = 7
		System.out.println("결과 = " + a + b); // a의 값 3이 String으로 자동 형변환이 됨. 그래서 출력값이 34가 된다.
		System.out.println("결과 = " + (a + b)); // 원하는 값을 얻으려면 형변환이 되기전에 연산이 되어야함.

	} // end main()

} // end class
