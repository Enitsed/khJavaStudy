package java0907_api;

import java.util.Calendar;

public class Java148_Calendar {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);

		// Calendar.Month는 1월일 때 0을 리턴한다.
		int month = c.get(Calendar.MONTH) + 1;

		int date = c.get(Calendar.DATE);

		// int hour = c.get(Calendar.HOUR); // 12시간 단위
		int hour = c.get(Calendar.HOUR_OF_DAY); // 24시간 단위
		int minute = c.getMaximum(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);

		System.out.printf("%d-%d-%d %d:%d:%d\n", year, month, date, hour, minute, second);

		// 이번달의 마지막날 리턴
		System.out.println(c.getActualMaximum(Calendar.DATE));

		// 오늘의 요일 리턴(일요일 -> 1)
		System.out.println(c.get(Calendar.DAY_OF_WEEK));

		// 오늘을 기준으로 5일 전의 날짜로 설정
		c.add(Calendar.DATE, -5);
		System.out.println(c.get(Calendar.DATE));

		// 2017-3-1
		c.set(2017, 2, 1);
		System.out.printf("%d-%d-%d\n", c.get(Calendar.YEAR), c.get(Calendar.MONTH) + 1, c.get(Calendar.DATE));

	}

}
