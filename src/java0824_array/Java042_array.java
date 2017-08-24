package java0824_array;

public class Java042_array {

	public static void main(String[] args) {
		// 배열을 생성할 때 초기값을 할당하면 배열의 크기를 지정할 수 없다.
		int[] jumsu = new int[] { 90, 80, 40 };

		/*
		 * System.out.println(jumsu[0]); System.out.println(jumsu[1]);
		 * System.out.println(jumsu[2]);
		 */

		for (int i = 0; i < jumsu.length; i++) {
			System.out.println(jumsu[i]);
		}

		System.out.println("==============================");

		/*
		 * System.out.println(jumsu[2]); System.out.println(jumsu[1]);
		 * System.out.println(jumsu[0]);
		 */

		for (int i = jumsu.length - 1; i >= 0; i--) {
			System.out.println(jumsu[i]);
		}

	}

}