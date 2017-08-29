package java0829_class;

/*
 * variable arguments (가변 매개변수)
 * 1. 5.0이전 버전에서는 특정 메소드를 정의할 때 인자의 타입과 수를 정해놓고
 * 	  호출 할 때 일치하지 않으면 오류가 발생했다.
 * 2. 이를 유연하게 처리할 수 있도록  variable argument 기능을 제공해 주고 있다.
 * 3. 리턴타입 메소드명(데이터타입...매개변수){	}
 */

class CountVarg {
	void addValue(int... arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++)
			sum += arr[i];
		System.out.println(sum);
	}

	// 고정 매개변수와 가변 매개변수를 같이 사용될 때는
	// 고정 매개변수는 항상 앞에, 가변매개변수는 항상 뒤에 와야 한다.
	void sumValue(String name, int... arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.printf("name= %s sum=%d\n", name, sum);
	}

}

public class Java080_varg {

	public static void main(String[] args) {
		CountVarg cv = new CountVarg();
		cv.addValue(4, 8);
		cv.addValue(2, 3, 9);
		cv.addValue(1, 5, 2, 4, 6);

		cv.sumValue("홍길동", 70, 80, 65);
		cv.sumValue("길동무", 90, 70);
	}

}
