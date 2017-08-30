package java0830_static_access;

import java0830_static_access.Java087_access;

public class Java088_access {

	public static void main(String[] args) {

		Java087_access p = new Java087_access();
		// System.out.printf("var_private = %d\n", p.var_private);
		System.out.printf("var_default = %d\n", p.var_default);
		System.out.printf("var_protected = %d\n", p.var_protected);
		System.out.printf("var_public = %d\n", p.var_public);

	}

}
