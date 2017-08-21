package java0821_basic;

/*
 * 연산자 (operator)
 * : 어떠한 기능을 수행하는 기호(+,-,*,/,%,/,>,<, == 같다, != 다르다)
 * 
 * 피연산자(operand)
 * : 연산자의 작업 대상(변수, 상수, 리터럴, 수식)
 * 
 * 연산자 종류
 * 1. 산술연산자 : +,-,*,/,%
 * 2. 비교연산자 : >, <, >=, <=, ==, !=
 * 3. 논리연산자 : &&(and) , ||(or), !(not)
 * 4. 삼항연산자 (조건연산자) : 조건식 ? 참 : 거짓
 * 5. 대입연산자 : = , += , -=, *=, /=
 * 6. 단항연산자 : ++(1씩 증가), --(1씩 감소)
 * 비트연산자, 쉬프트연산자 는 제외
 */

public class Java005_operator {

	public static void main(String[] args) {
		int kor = 10;
		int eng = 20;

		// int = int + int
		int result = kor + eng; // int 형끼리의 값의 연산은 결과 값도 int 이다.
		System.out.println(result); // Sysout 타입 후 Ctrl + Space 키 입력하면 자동으로 메소드 입력된다.

		double avg = 4.5;
		// 서로 다른 자료형 연산 double = int + double
		double result2 = kor + avg; // 자동으로 int 형의 자료형은 double 형으로 변환 되어진다.
		// 작은 데이터형과 큰 데이터형의 연산 시 작은 데이터 형은 큰 데이터 형으로 변환된다.
		System.out.println(result2);

		short a = 3;
		short b = 4;
		// short c = a + b; short 형끼리의 합은 자동으로 int 형으로 변환 되어진다.
		// int 보다 작은 데이터 형의 연산은 무조건 자동으로 int 형으로 변환 되어진다.
		// int = short + short;
		int c = a + b;
		System.out.println(c);
		// int = byte + short
		// int = char + short
		// int = byte + int
		// int = byte + byte

		// short = (short)(byte+short)

		char data = 'a';
		System.out.println((char) (data - 32));
		// 연산으로 인해 정수 형으로 변환된 값을 다시 문자형으로 타입캐스팅 함으로써 문자 'A' 출력

	} // end main()

} // end class
