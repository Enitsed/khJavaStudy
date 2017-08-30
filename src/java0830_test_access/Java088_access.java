package java0830_test_access;

import java0830_static_access.Java087_access;

public class Java088_access extends Java087_access {

	public static void main(String[] args) {

		Java088_access p = new Java088_access();
		// System.out.printf("var_private = %d\n", p.var_private);
		// System.out.printf("var_default = %d\n", p.var_default);
		// protected가 선언된 자원은 상속관계인 자손클래스에서 사용할 수 있다.
		System.out.printf("var_protected = %d\n", p.var_protected);
		System.out.printf("var_public = %d\n", p.var_public);

	}

}
