package java0907_api;

import java.util.GregorianCalendar;

public class Java150_GregorianCalendar {

	public static void main(String[] args) {
		int year = 2016;
		GregorianCalendar gre = new GregorianCalendar();

		// isLeapYear() : 윤년이면 true, 평년이면 false 리턴
		if (gre.isLeapYear(year)) {
			System.out.println(year + "년도는 윤년입니다.");
		} else {
			System.out.println(year + "년도는 평년입니다.");
		}

	}

}
