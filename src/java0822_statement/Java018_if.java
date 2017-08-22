package java0822_statement;

/*
 * 조건식을 만족할 때문 수행할 문장이 있는경우
 * if (조건식) {
 * 	수행할 문장;
 * }
 */

public class Java018_if {

	public static void main(String[] args) {
		int num = 10;

		if (num > 0) {
			System.out.printf("%d은 자연수입니다.\n", num);
		}

		System.out.println("Program end");

	}

}
