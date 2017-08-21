package java0821_basic;

/*
 * 3+2=5 (수학)
 * 5=3+2 (프로그램)
 */

public class Java004_casting {

	public static void main(String[] args) {
		int x = 3;
		double y = 4.5;

		// double 형의 변수에 int 값을 저장. double > int
		y = /* (double) */ 5; // 묵시적 형 변환 : 작은 데이터 타입을 큰 데이터 타입으로 변환할 때 발생 (캐스팅 타입을 명시하지 않아도 됨)
		System.out.println(y);

		// int 형의 변수에 double 값을 저장. int < double
		x = (int) 2.6; // 명시적 형 변환 : 큰 데이터 타입을 작은 데이터 타입으로 변환할 때 발생 (캐스팅 타입을 반드시 명시해야 함)
		System.out.println(x); // 큰 데이터 타입의 값을 작은 데이터 타입에 저장하므로써 데이터 손실 발생. 2.6 => 2

		/*
		 * 컴퓨터 : 0, 1 (컴퓨터는 이진법을 사용) 숫자 int data = 5 : 101 문자 'A' : 65(유니코드) 'A' => 65
		 * 'a' => 97 '0' => 48
		 * 
		 * 자바에서는 유니코드 값을 사용한다. 아스키코드는 영문자와 특수문자밖에 없기때문에 자바에서는 한글입력이 되는 유니코드를 사용한다.
		 * 아스키코드의 값은 그대로 사용되고 있다.
		 */

		char data = 'a';
		System.out.println(data);
		// char 형의 변수에 int 값을 저장
		data = 65; // char 형에 정수값을 대입하면 해당 숫자 순서의 아스키 코드가 저장된다.
		// 'A' 의 아스키 코드 값은 65 이다.
		System.out.println(data); // 문자 'A' 출력

		char alpa = 'a';
		System.out.println(alpa - 32); // 연산 시 자동으로 int로 형변환 되어서 출력시 정수값 65로 출력됨.

		// int 형의 변수에 char 값을 저장
		x = '0';
		System.out.println(x); // 48 출력 (묵시적 형변환)

		int a = 20;
		// short 형의 변수에 int 형의 데이타 저장은 불가능 short < int
		short b = (short) a; // 명시적 형변환을 해주어야 한다. (casting)
		System.out.println(b);

		// byte 형에 byte 형 데이타 저장
		byte c = 40; // 뒤의 40은 byte로 인식된다.
		// short 형에 short 형 데이타 저장
		short d = 50; // 뒤의 50은 short로 인식된다.
		// short 형에 int 형 데이타 저장 short < int
		d = (short) a; // 명시적 형변환 필요.

	} // end main()

} // end class
