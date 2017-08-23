package java0823_statement;

/*
 * 1부터 10까지 짝수, 홀수 누적을 계산하는 프로그램을 구현하세요.
 * [출력결과]
 * 짝수누적: 30
 * 홀수누적: 25
 */
public class Java033_for {

	public static void main(String[] args) {
		int odd = 0; // 홀수누적
		int even = 0; // 짝수누적

		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				even += i;
			} else {
				odd += i;
			}
		}

		System.out.println("짝수누적: " + even);
		System.out.println("홀수누적: " + odd);

	}

}