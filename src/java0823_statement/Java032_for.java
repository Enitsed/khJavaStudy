package java0823_statement;

public class Java032_for {

	public static void main(String[] args) {
		int sum = 0; // 누적을 저장할 변수

		for (int i = 1; i <= 10; i++) {
			sum = sum + i;
		}
		System.out.println("sum=" + sum);
	}

}
