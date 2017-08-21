package java0821_basic;

/*
 * 리터럴(Literal) : 그 자체의 값(1,2,3,...,'a','b','c',...,true,false(논리값)..).
 * 변수(Variables) : 하나의 값을 저장하기 위한 메모리 공간
 * 데이타 타입(data type) : 값의 종류와 메모리 크기를 결정
 * 자바에서 제공하는 데이터 타입
 * 1. 기본 데이터 타입(primitive data type)
 * 	byte(1), short(2), int(4), long(8) => 정수
 * 	float(4), double(8) => 실수
 * 	char(2) => 문자
 * 	boolean(1) => 논리형 (참 or 거짓)
 * *위의 괄호 안의 숫자는 데이터 크기를 의미함.(단위 : byte)
 * 2. 참조 데이터 타입(reference data type)
 * 	배열(array), 클래스(class), 인터페이스(interface)
 * 
 * 시스템에서 인식하는 데이터 타입 크기
 * byte < short, char < int < long < float < double
 * 
 * 자바에서는 int가 정수의 기본 자료형이기 때문에 long의 데이타 값을 저장하기 위해서는 숫자 뒤에 l을 붙여야함.
 *  ex) long num = 10; (X) => long num = 10l; (O)
 * 자바에서는 double이 실수의 기본 자료형이기 때문에 float의 데이타 값을 저장하기 위해서는 숫자 뒤에 f를 붙여야함.
 *  ex) float num = 3.5; 여기서 3.5는 Double형 (X) => float num = 3.5f (O)
 * 
 */

public class Java003_dataType {

	public static void main(String[] args) {

		// int : 정수 값을 저장할 수 있는 4바이트 메모리를 생성한다. 키워드 (예약어) 데이터 타입.
		// data : 메모리를 관리한다. (변수 이름)
		// 3을 메모리를 관리하는 변수 data에 저장한다.
		int data = 3;

		System.out.println(data);

		// data 변수의 값을 10으로 수정한다.
		data = 10;

		System.out.println(data);

		int num; // 변수 선언 (메모리 할당)
		num = 10; // 변수에 값 할당(저장)

		// num 변수에 저장 된 값을 호출하여 출력한다.
		System.out.println(num);

		// num 이라는 문자열을 출력한다.
		System.out.println("num");

	} // end main()

}// end class
