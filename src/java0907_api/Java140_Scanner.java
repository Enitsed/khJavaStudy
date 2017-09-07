package java0907_api;

import java.util.Scanner;

public class Java140_Scanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// System.out.println("부서:");
		String dept = sc.next(); // nextLine과 다른점은 nextLine은 공백을 문자로 인식하지만 next는 공백을 enter로 인식한다.
		// System.out.println("연봉:");
		int salary = sc.nextInt();
		// System.out.println("평균:");
		double avg = sc.nextDouble();

		System.out.printf("%s %d %.1f\n", dept, salary, avg);
		sc.close();

	}

}
