package java0914_inner;

abstract class InnerAnonymous {
	abstract void prn();
}

class Test extends InnerAnonymous {

	@Override
	void prn() {
		System.out.println(10);
	}

}

class OuterAnonymous {
	private int x;

	public void call() {
		/*
		 * InnerAnonymous tt = new InnerAnonymous() {
		 * 
		 * @Override void prn() { x = 5; System.out.println(x); } };
		 * 
		 * tt.prn();
		 */

		new InnerAnonymous() { // 이벤트처리할때 사용됨
			@Override
			void prn() {
				x = 5;
				System.out.println(x);
			}
		}.prn();

	}

}

public class Java205_inner {

	public static void main(String[] args) {
		Test t1 = new Test();
		t1.prn();

		Test t2 = new Test();
		t2.prn();

		OuterAnonymous t3 = new OuterAnonymous();
		t3.call();
	}

}
