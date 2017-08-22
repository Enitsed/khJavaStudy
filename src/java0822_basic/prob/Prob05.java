package java0822_basic.prob;

/*
 * 평년, 윤년을 구하는 프로그램을 구현하시오.
 * 1. 윤년의 조건 (두 조건 중 하나 만족할 경우)
 *  1) 년도를 4로 나눈 나머지가 0이고 100으로 나눈 나머지가 0이 아니다.
 *  2) 년도를 400으로 나눈 나머지가 0이다.
 * 
 * [ 출력 결과 ]
 * 	2012년도는 윤년입니다.
 * 	2013년도는 평년입니다.
 */

public class Prob05 {

	public static void main(String[] args) {
		int year = 2012;
		String leapYear = "";

		// 여기에 작성하시오.
		leapYear = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0 ? "윤년" : "평년";

		System.out.printf("%d 년도는 %s입니다.", year, leapYear);

	}

}
