package java0908_api;

public class Java156_exception {

	public static void main(String[] args) {
		String data1 = "12";
		String data2 = "0";

		try {
			int x = Integer.parseInt(data1);
			int y = Integer.parseInt(data2);
			process(x, y);
		} catch (NumberFormatException ex) {
			System.out.println("숫자를 입력하세요.");
		} catch (ArithmeticException e) {
			System.out.println("분모는 0을 입력하지 마세요.");
		}

		System.out.println("program end");

	}

	public static void process(int x, int y) throws ArithmeticException { // 호출하는 메소드로 exception을 throws 함
		int res = x / y;
		System.out.println(res);

	}

}
