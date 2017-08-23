package java0823_statement;
/*
 * int = 1
 * int = 2
 * int = 3
 * int = 4
 * int = 5
 * sum = 15
*/

public class Java031_for {

	public static void main(String[] args) {
		int sum = 0; // 누적을 저장할 변수
		int i;

		for (i = 1;; i++) {
			sum = sum + i;
			System.out.printf("i=%d\n", i);
			if (sum >= 15) {
				break; // 현재 수행중인 반복문을 빠져나옴
			}
		}
		System.out.println("sum=" + sum);
	}
}
