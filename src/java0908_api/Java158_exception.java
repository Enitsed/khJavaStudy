package java0908_api;

class UserException extends Exception {
	public UserException(String message) {
		super(message);
	}
}

public class Java158_exception {

	public static void main(String[] args) {
		int num = 5;
		process(num);
		System.out.println("korea");

	}

	public static void process(int data) {

		try {
			if (data < 10)
				throw new UserException("10이상만 입력하세요.");
			System.out.println(data);
		} catch (UserException e) {
			System.out.println(e.toString());
		}

	}

}
