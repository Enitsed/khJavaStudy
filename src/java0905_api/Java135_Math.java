package java0905_api;

import static java.lang.Math.*;

public class Java135_Math {

	public static void main(String[] args) {
		// 0.0부터 1.0미만 사이의 난수 발생
		double ran = random();
		System.out.println(ran);

		// 0.0~10.0 미만 사이의 난수 발생
		ran = ran * 10;
		System.out.println(ran);

		// 소수 이하는 버리고 0~10미만을 리턴한다.
		int num = (int) floor(ran);
		System.out.println(num);

		System.out.println((int) -7.8);
		System.out.println(floor(-7.8)); // 가장 작은 값으로 반환

		System.out.println((int) 7.8);
		System.out.println(floor(7.8));

	}

}
