package java0914_inner;

class OuterStatic {
	private int x;
	static private int y;

	static void call() {
		y = 9;
		System.out.println(y);
	}

	static class InnerStatic {
		int z;

		void prn() {
			// 비 static외부 자원을 static 내부 클래스에서 참조할 수 없다.
			// x = 40;

			y = 20;
			z = 30;

			System.out.printf("%d %d\n", y, z);

		}
	}

}

public class Java203_inner {

	public static void main(String[] args) {
		OuterStatic.call();
		OuterStatic.InnerStatic inner = new OuterStatic.InnerStatic(); // Inner 클래스가 스태틱으로 선언되어 있기 때문에 Outer 클래스의 객체는
																		// 생성하지 않아도 된다.
		inner.prn();
	}

}
