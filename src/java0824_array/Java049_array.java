package java0824_array;

/*
 * [데이타]
 * 홍길동		90	85	40
 * 갑동이		100	35	70
 * 
 * [출력결과]
 * 홍길동	  90  85  40 215 71.7
 * 갑동이	 100  35  75 210 70.0
 */

public class Java049_array {

	public static void main(String[] args) {
		String[] name = new String[] { "홍길동", "갑동이" };
		int[][] jumsu = new int[][] { { 90, 85, 40 }, { 100, 35, 75 } };
		int[] sum = new int[jumsu.length];
		double[] avg = new double[jumsu.length];

		for (int row = 0; row < jumsu.length; row++) {
			System.out.printf("%s\t", name[row]);
			for (int col = 0; col < jumsu[row].length; col++) {
				System.out.printf("%4d", jumsu[row][col]);
				sum[row] += jumsu[row][col];
			}
			avg[row] = sum[row] / (double) jumsu[row].length;
			System.out.printf("%4d %4.1f\n", sum[row], avg[row]);
		}

	}

}
