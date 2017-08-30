package java0830_static_access;

class MeTest {
	private MeTest() {
		System.out.println("private");
	}

	MeTest(int a) {
		System.out.println(a);
	}
}

public class Java089_access {

	public static void main(String[] args) {
		// MeTest() 생성자의 접근제어자(access modifier)
		// private 선언되어 있기 때문에 외부클래스에서 호출할 수 없다.
		// MeTest mt = new MeTest();

		MeTest ts = new MeTest(10);

	}

}
