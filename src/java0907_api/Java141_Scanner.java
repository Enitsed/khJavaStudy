package java0907_api;

import java.util.Scanner;

/*
	단 입력:5
	5 X 1 = 5
	------------------------
	5 X 9 = 45
	계속하시겠습니까? (종료 : n, 계속: 아무키)a
	단 입력:3
	3 X 1 = 3
	-------------------------
	3 X 9 = 27
	계속하시겠습니까? (종료 : n, 계속: 아무키)n
	프로그램 종료
 */

public class Java141_Scanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean o = true;

		while (o) {
			System.out.print("단 입력:");
			int dan = sc.nextInt();

			danOp(dan);

			System.out.print("계속하시겠습니까? (종료 : n, 계속: 아무키)");
			String res = sc.next();

			if (res.equals("n")) {
				System.out.println("프로그램 종료");
				o = false;
			}
		}

		sc.close();

	}

	public static void danOp(int dan) {

		for (int i = 1; i < 10; i++) {
			System.out.printf("%d X %d = %d\n", dan, i, dan * i);
		}

	}

}
