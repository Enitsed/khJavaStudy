package java0908_stream;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Java163_stream {

	public static void main(String[] args) {
		System.out.println("데이터 입력:");

		Scanner sc = new Scanner(System.in);

		int x, y;

		try {
			System.out.println("x:");
			x = sc.nextInt();
			System.out.println("y:");
			y = sc.nextInt();
			System.out.printf("%d + %d = %d\n", x, y, x + y);
		} catch (InputMismatchException e) {
			System.out.println(e.toString());
		} finally {
			sc.close();
		}

	}

}
