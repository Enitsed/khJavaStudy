package java0823_statement;

/*
 * do {
 * 	수행할 문장;
 * } while (조건식);
 */

public class Java040_do_while {

	public static void main(String[] args) {
		char chk = 'y';

		do {
			System.out.println("주문하시겠습니까?(y/n)");
		} while (chk == 'z');

	}
}
