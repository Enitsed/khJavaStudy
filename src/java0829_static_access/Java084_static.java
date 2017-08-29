package java0829_static_access;

/*
 * class 클래스명{
 * 	멤버변수
 * 	static{}
 * 	생성자(){}
 * 	메소드(){}
 * 	내부클래스
 * }
 */

class OrderStatic {
	static {
		System.out.println("Static");
	}

	public OrderStatic() {
		System.out.println("Constructor");
	}

	public void prn() {
		System.out.println("prn");
	}
}

public class Java084_static {

	public static void main(String[] args) {
		OrderStatic os = new OrderStatic();
		os.prn();
	}

}
