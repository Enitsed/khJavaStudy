package java0908_api;

public class Java157_exception {

	public static void main(String[] args) {
		int num = 5;
		process(num);
		System.out.println("korea");

	}

	public static void process(int data) {

		try {
			if (data < 10)
				throw new ArithmeticException("10이상만 입력하세요.");
			System.out.println(data);
		} catch (ArithmeticException e) {
			System.out.println(e.toString());
		}

	}

}
