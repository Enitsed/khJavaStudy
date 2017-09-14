package java0914_inner;

class OuterLocal {
	private int x;
	static int y;
	final private int z = 10;

	public void call(int a) {
		final int b = 20;
		int c = 30;
		// a = 200;
		// System.out.println("a=" + a);

		// 클래스의 메소드 내에 정의된 클래스를 local 클래스, 지역 클래스라고 한다.
		class InnerLocal {
			void prn() {
				x = 5;
				y = 150;
				// outer클래스의 메소드에 정의된 매개변수, 지역변수를 지역 내부클래스에서 새로운 값을 할당할 수 없다.
				// a = 30;
				// c = 40; // 내부클래스에서는 외부클래스의 메소드에 정의된 매개변수나 지역변수의 값을 변경할 수 없다. (호출이나 참조는 가능)
				System.out.println("x=" + x);
				System.out.println("y=" + y);
				System.out.println("z=" + z);
				System.out.println("a=" + a); // 버전 업데이트 이후 메소드에 있는 매개변수에 final 키워드가 붙지 않아도 사용이 가능하다.
				System.out.println("b=" + b);
				System.out.println("c=" + c);

			}
		}
		// 지역 클래스를 사용하기 위해서는 객체생성을 해야한다.
		InnerLocal inner = new InnerLocal();
		inner.prn();
	}
}

public class Java204_inner {

	public static void main(String[] args) {
		OuterLocal outer = new OuterLocal();
		outer.call(100);

	}

}
