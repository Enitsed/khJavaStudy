package java0823_statement;

/* [출력 결과]
 * int = 1 , sum = 1
 * int = 2 , sum = 3
 * int = 3 , sum = 6
 * int = 4 , sum = 10
 * int = 5 , sum = 15
 */

public class Java030_for {

	public static void main(String[] args) {
		int sum = 0; // 누적을 저장할 변수
		int i;

		for (i = 1;; i++) {
			sum = sum + i;
			System.out.printf("i=%d, sum=%d\n", i, sum);
			if (sum >= 15) {
				break; // 현재 수행중인 반복문을 빠져나옴
			}
		}

	}

}
