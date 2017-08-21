package java0821_basic;

public class Java016_print {

	public static void main(String[] args) {
		System.out.println("java");
		System.out.println("jsp"); // println 메소드는 출력 후 줄바꿈

		System.out.print("spring\t"); // 줄바꿈이 없음
		System.out.print("oracle\n");

		/*
		 * printf("출력형식", 값1, 값2...)
		 */
		// * 출력형식에 사용가능한 출력기호
		// * %d : 정수
		// * %f : 실수
		// * %c : 문자
		// * %s : 문자열
		// * %b : 논리
		// * %% : %
		// * \ : 키보드에서 지원하는 문자를 표기할 때 사용
		// * \t : tab
		// * \n : next line

		System.out.printf("%s\n", "mybatis");
		System.out.printf("%d\n", 50);
		System.out.printf("%f\n", 4.5);
		System.out.printf("%c %b %d\n", 'a', true, 10);

		System.out.printf("%.1f\n", 4.56); // %.1 : 소수점 첫째짜리까지만 출력(반올림) => 4.6
		System.out.printf("%5.1f\n", 34.56); // %5.1 : 5는 총 자리수.(소수점 포함) .1은 소수점 자리 수
		System.out.printf("%5.1f\n", 124.56);
		System.out.printf("%5.1f\n", 5124.56);

		System.out.printf("%5.2f\n", 4.56);
		System.out.printf("%5.2f\n", 4.5); // 소수점 자리수는 범위에 해당되는 자리수에 값이 없으면 0 으로 채운다.
		System.out.printf("%5.2f\n", 24.567);
		System.out.printf("%5.2f\n", 124.567);

		// -기호는 왼쪽 정렬
		System.out.printf("%-5.1f\n", 4.56);

		// 홍길동님의 평균은 95.0 이므로 A학점입니다.
		System.out.printf("%s님의 평균은 %.1f 이므로 %c학점입니다.\n", "홍길동", 95.0, 'A');

		// 3+2=5
		System.out.printf("%d+%d=%d\n", 3, 2, 3 + 2);

		// 3%2=1
		System.out.printf("%d%%%d=%d\n", 3, 2, 3 % 2);

		// 당신의 색깔은 "파랑"입니다.
		System.out.printf("당신의 색깔은 \"%s\"입니다.\n", "파랑");

		System.out.printf("안녕\thello\n"); // printf 메소드에 출력기호가 없어도 작동은 한다.
	}

}
