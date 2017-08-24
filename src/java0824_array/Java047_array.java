package java0824_array;

public class Java047_array {

	public static void main(String[] args) {
		// 3행 2열의 2차원 배열
		int[][] num = new int[3][2];

		num[0][0] = 1;
		num[0][1] = 2;
		num[1][0] = 3;
		num[1][1] = 4;
		num[2][0] = 5;
		num[2][1] = 6;

		/*
		 * System.out.printf("%4d", num[0][0]); System.out.printf("%4d\n", num[0][1]);
		 * System.out.printf("%4d", num[1][0]); System.out.printf("%4d\n", num[1][1]);
		 * System.out.printf("%4d", num[2][0]); System.out.printf("%4d\n", num[2][1]);
		 */

		// num.length : 2차원에서 행의 크기를 리턴
		for (int i = 0; i < num.length; i++) {
			// num[i].length : 2차원에서 열의 크기를 리턴
			for (int j = 0; j < num[i].length; j++) {
				System.out.printf("%4d", num[i][j]);
			}
			System.out.println();
		}

		System.out.println("///////////////////////////////");

		for (int row = 0; row < num[row].length; row++) {
			for (int col = 0; col < num.length; col++) {
				System.out.printf("num[%d][%d] = %d\t", col, row, num[col][row]);
			}
			System.out.println();
		}

	}

}
