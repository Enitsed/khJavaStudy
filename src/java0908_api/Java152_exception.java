package java0908_api;

public class Java152_exception {

	public static void main(String[] args) {
		int[] num = new int[] { 10, 20, 30 };

		try {
			System.out.println(num[7]);
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("배열에 존재하지 않는 인덱스입니다.");
		} finally {
			System.out.println("program end");
		}

	}

}
