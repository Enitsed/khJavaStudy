package java0823_statement;

public class Java039_while {

	public static void main(String[] args) {
		int cnt = 1;
		// While 문에서는 조건식을 생략할 수 없다.
		while (true) {
			System.out.println(cnt++);
			if (cnt == 6) {
				break;
			}
		}

	}

}
