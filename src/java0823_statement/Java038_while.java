package java0823_statement;

/*
 * while (조건식) {
 * 	수행할 문장;
 * }
 * 
 * while 문은 조건식을 생략할 수 없다.
 */

public class Java038_while {

	public static void main(String[] args) {
		/*
		 * for (int i = 1; i <= 5; i++) { System.out.println(i); }
		 */
		/*
		 * int i = 1; while (i <= 5) { System.out.println(i); i++; }
		 */
		/*
		 * int i = 0; while (++i <= 5) { System.out.println(i); }
		 */
		int i = 0;
		while (i++ < 5) {
			System.out.println(i);
		}

	}

}
