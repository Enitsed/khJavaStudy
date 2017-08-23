package java0823_statement;

/*
 * 1 2 3 4 5
 * 1 2 3 4 5
 * 1 2 3 4 5
 * 1 2 3 4 5
 */

public class Java036_for {

	public static void main(String[] args) {
		int cnt;

		for (int row = 1; row <= 4; row++) {
			cnt = 1;
			for (int col = 1; col <= 5; col++) {
				// System.out.printf("%2d", col);
				System.out.printf("%4d", cnt++);
			}
			System.out.println();
		}

	}

}