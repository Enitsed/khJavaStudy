package java0831_abstract_interface;

/*
 * final
 * 1. 변수 : 상수
 * 	int num = 20;
 * 	num = 30;
 * 
 * 	final int DATA = 5; (O) // final 선언되어 있는 변수는 반드시 초기값이 할당되어 있어야 한다.
 * 	final int DATA; (X)
 * 	DATA = 15; (X)
 * 
 * 2. 메소드 : 오버라이딩을 할 수 없다. (추상메소드에는 final 키워드가 붙을 수 없다. ex) 인터페이스 메소드)
 * 	final void prn(){};
 * 
 * 3. 클래스 : 상속을 할 수 없다.(완벽해서 확장이 필요없는 클래스는 final 키워드 사용)
 * 	final class Test{};
 */
class FinalTest {
	final int CODE = 1;

	void display() {
		// 상수는 새로운 값을 할당 할 수 없다.
		// CODE = 10;
	}

	final void process() {
		System.out.println("process");
	}

	void call() {
		System.out.println("call");
	}
}

class UserFinal extends FinalTest {

	@Override
	void call() {
		System.out.println("user call");
	}

	// final 키워드가 붙은 메소드는 오버라이딩이 불가능하다.
	/*
	 * @Override void process() {}
	 */
}

final class Base {

}

// Final 선언된 클래스는 상속 할 수 없다
/*
 * class Expand extends Base{}
 */

public class Java108_final {

	public static void main(String[] args) {
		FinalTest ft = new FinalTest();
	}

}
