package java0828_class;

/*
 * 생성자(constructor)
 * 1. 멤버변수를 초기화하기위한 목적으로 사용한다.(한번만 호출)
 * 2. 클래스명과 같다.
 * 3. 클래스는 한개 이상의 생성자는 갖는다.
 * 4. 생성자는 리턴타입이 없다.
 * 5. 클래스에 생성자가 정의되어 있지 않으면 JVM에서 기본 생성자를 제공한다.
 * 6. 기본생성자는 클래스의 접근 제어자를 그대로 사용한다.
 */

class HandPhone {
	// 멤버변수
	String name;
	String number;

	// 자바 가상머신(JVM)에서 제공하는 기본 생성자
	// 클래스에 생성자가 1개 이상 정의되어 있으면 JVM에서 기본생성자를 제공하지 않는다.
	HandPhone() {

	}

	HandPhone(String a, String b) {
		name = a;
		number = b;
	}

	// 메소드
	void prn() {
		System.out.printf("%s %s\n", name, number);
	}
}

public class Java070_constructor {

	public static void main(String[] args) {
		HandPhone ph = new HandPhone(); // 멤버 변수에 값을 할당 하지 않음. ph.name = Null , ph.number = Null
		ph.name = "홍길동";
		ph.number = "010-2563-9029";
		ph.prn();

		HandPhone ne = new HandPhone("이영희", "010-9725-8253"); // 객체 생성과 동시에 값을 할당
		ne.prn();
	}

}
