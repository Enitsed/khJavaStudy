package java0828_class;

/* 키워드 this
 * this : 객체 자신을 의미한다.
 * this.멤버변수;
 * this.메소드();
 * this(); 생성자
 */

class Product {
	String code;
	String pname;
	int cnt;

	public Product() {

	}

	public Product(String code, String pname, int cnt) {
		// 멤버변수와 매개변수 이름이 같을 때 멤버변수에 this키워드를 명시한다.
		this.code = code;
		this.pname = pname;
		this.cnt = cnt;
	}

	public void prn() {
		System.out.printf("%s %s %d\n", code, pname, cnt);
	}

	public void call() {
		this.prn(); // 일반적으로 this는 붙이지 않는다.
		prn(); // this를 붙이지 않아도 작동한다.
	}

}

public class Java071_this {

	public static void main(String[] args) {
		Product pt = new Product("a001", "육류", 2);
		pt.prn();
	}

}
