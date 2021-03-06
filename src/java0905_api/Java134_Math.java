package java0905_api;

import static java.lang.Math.E;
import static java.lang.Math.sqrt;
import static java.lang.Math.*;

/*
 * 클래스에서 static키워드가 선언된 멤버변수, 메소드를 호출할때
 * import static을 선언하면 클래스명 없이 바로 멤버변수, 메소드를 호출 할 수 있다.
 */

public class Java134_Math {

	public static void main(String[] args) {
		System.out.println(Math.PI); // 원주율
		System.out.println(Math.max(10, 20)); // 최대값
		System.out.println(Math.min(10, 20)); // 최소값
		System.out.println(E);
		System.out.println(sqrt(25));
		System.out.println(pow(2, 3));

	}

}
