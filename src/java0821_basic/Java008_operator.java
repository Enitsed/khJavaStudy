package java0821_basic;

public class Java008_operator {

	public static void main(String[] args) {
		int x = 3;

		// 증가 연산자 : 변수의 값을 1 증가한다.
		++x; // x = x + 1;
		System.out.println("x = " + x);

		int y = 5;

		// 감소 연산자 : 변수의 값을 1 감소한다.
		--y; // y = y - 1;
		System.out.println("y = " + y);

		// literal 에는 증감연산자를 사용 할 수 없다.
		// ex) System.out.println(++10); (X)

		// keyword(예약어) : 프로그램에서 어떤 의미를 부여하여 정의 해놓은 단어
		final int DATA = 5; // final 키워드는 "상수" 예약어로 데이터 값의 변경을 불가능하게 한다. 상수명은 무조건 대문자.

		// 상수에는 증가연산자, 감소연산자를 사용할 수 없다.
		// DATA++;

	}

}
