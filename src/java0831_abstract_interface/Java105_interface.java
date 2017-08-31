package java0831_abstract_interface;

import java.io.Serializable;

/*
 * 				class		interface
 * 멤버변수		O			상수 (final 키워드)
 * 메소드			선언부+구현부	선언부(추상 메소드)
 * 생성자			O			X
 * 초기화블록		O			X		(static 블록)
 * 내부클래스		O			O
 * 
 * extends : 클래스에 클래스를 상속(단일 상속) , 인터페이스에 인터페이스 상속(다중 상속)
 * implements : 클래스에 인터페이스 상속(다중 상속)
 * 
 * 인터페이스(interface)
 * 1. 추상메소드와 상수를 가지고 있는 형태이다.
 * 2. 클래스 작성에 도움을 줄 목적으로 제공이 되는 표준 명세서이다.
 * 3. implments : 클래스에 인터페이스를 상속할 때 사용되는 키워드이다.
 * 4. 인터페이스는 접근제어자로 public만 제공한다.
 * 5. 인터페이스의 추상메소드에 abstract 키워드를 명시하지 않아도 된다.
 * 		자바가상머신에서 자동으로 처리하기 때문에..
 * 
 */

interface CarRun {
	int carCount = 5; // public static final 키워드가 자바가상머신에서 자동으로 부여된다.

	// CarRun(){} // 생성자 X
	/*
	 * static { System.out.println("dd"); }
	 */ // 스태틱 블록 X

	void prn(); // public abstract 자동 키워드
	/*
	 * void display() {};
	 */ // 메서드 구현부 X

	class Sun {
	} // 내부클래스
}

class TruckRun implements CarRun, Serializable {

	@Override
	public void prn() {
		// TODO Auto-generated method stub
		System.out.println("prn");
	}

}

public class Java105_interface {

	public static void main(String[] args) {
		System.out.println(CarRun.carCount); // 인터페이스 안의 멤버변수는 상수이므로 호출할 수 있다.

		TruckRun tr = new TruckRun();
		tr.prn();
	}

}
