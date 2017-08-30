package java0830_inheritance;

/*
 * 오버라이딩(overriding)
 * 1 조상클래스의 메소드를 자손클래스에서 재정의(메소드 구현부)하는 기능이다.
 * 2 메소드의 선언부는 그대로 사용한다.(리턴데이터타입, 메소드명, 매개변수)
 *   단, 접근제어자는 같거나 크면된다.
 *   private < default < protected < public
 * 3 오버라이딩은 상속을 받은 후 할 수 있다.
 * 
 *  super
 *  1. 자손클래스에서 조상클래스를 호출할 때 사용한다.
 *  2. super.멤버변수
 *     super.메소드 ( )
 *     super( ) => 생성자
 *    
 *  단일클래스                    상속관계의 자손클래스
 *   overloading  vs  overriding
 *   this         vs  super   
 * 
 */

class First {
	int a = 10;

	void prn() {
		System.out.println("a= " + a);
	}
}

class Second extends First {
	int b = 20;

	// 상속을 받은 후 오버라이딩을 할 수 있다.
	@Override
	public void prn() {
		System.out.println("b= " + b);
	}

	public static void display() {
		System.out.println("display");
	}

	// static이 선언되어 있는 메서드에서는 super, this 키워드를 사용할 수 없다.
	public static void call() {
		// static은 객체가 생성되기 전에 생성된다.
		// super.prn();
		// this.prn();
		display();
	}

}

public class Java096_inheritance {

	public static void main(String[] args) {
		Second sd = new Second();
		// sd.prn();
		sd.call();
	}

}
