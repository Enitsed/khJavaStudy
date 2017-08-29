package java0829_static_access;

/*
 * static이 선언된 메소드에서는 비-static자원(멤버변수, 메소드)를 호출 할 수 없다.
 */

public class Java085_static {

	public static void main(String[] args) {
		display();
		Java085_static js = new Java085_static(); // static 이 아닌 메서드를 실행시키기 위해서는 객체 생성이 필요하다.
		js.process();
	}

	public static void display() {
		System.out.println("display");
	}

	public void process() {
		System.out.println("process");
	}
}
