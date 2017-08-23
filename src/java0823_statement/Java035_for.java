package java0823_statement;

/*
 * 3행 X 4열
 * 1  2  3  4
 * 5  6  7  8
 * 9 10 11 12
 */
public class Java035_for {

	public static void main(String[] args) {

		/*for (int i = 1; i < 13; i++) {
			System.out.printf("%4d", i);
			if (i % 4 == 0) {
				System.out.println();
			}
		}*/
		
		int cnt = 1;
		
		for (int row = 1; row <= 3; row ++) {
			for (int col = 1; col <=4; col++) {
				System.out.printf("%4d", cnt++);
			}
			System.out.println();
		}
		
	}

}
