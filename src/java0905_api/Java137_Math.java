package java0905_api;

/*
 * num배열에 1부터 10까지의 값을 저장하는 프로그램을 구현
 */

public class Java137_Math {

	public static void main(String[] args) {
		int[] num = new int[5];

		for (int i = 0; i < num.length; i++) {
			// 난수발생
			num[i] = (int) (Math.floor(Math.random() * 10)) + 1;
			// 중복체크
			for (int j = 0; j < i; j++) {
				if (num[i] == num[j]) {
					i--;
					break;
				}
			}
		}

		for (int i : num) {
			System.out.println(i);
		}

	}

}
