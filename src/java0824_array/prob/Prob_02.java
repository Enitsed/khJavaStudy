package java0824_array.prob;
/*
 * 4행 4열 data배열에 가로 세로 합계를 구하는 프로그램을 구현하시오.
 * [출력결과]
 *  1   2   3   6
 *  4   5   6  15
 *  7   8   9  24
 * 12  15  18  45
 */

public class Prob_02 {

	public static void main(String[] args) {
		int[][] data = new int[4][4];
		int cnt = 1;

		// 여기를 구현하시오.
		for (int row = 0; row < data.length - 1; row++) {
			for (int col = 0; col < data[row].length - 1; col++) {
				data[row][col] = cnt++;
			}
		}

		for (int r = 0; r < data.length - 1; r++) {
			for (int c = 0; c < data[r].length - 1; c++) {
				data[r][data.length - 1] += data[r][c];
				data[data.length - 1][r] += data[c][r];
			}
			data[data.length - 1][data[r].length - 1] += data[r][data.length - 1];
		}

		for (int r = 0; r < data.length; r++) {
			for (int c = 0; c < data[r].length; c++) {
				System.out.printf("%4d", data[r][c]);
			}
			System.out.println();
		}

	}// end main()

}// end class
