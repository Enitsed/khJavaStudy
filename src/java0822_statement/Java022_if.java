package java0822_statement;

/*
 * check 변수의 값이 'n' 이면 main()메소드를 종료하고
 * 아니면 main() 메소드를 수행한다.
 */

public class Java022_if {

	public static void main(String[] args) {
		char check = 'n';
		if (check == 'n') {
			System.out.println("main 종료");
			return; // main() 메소드를 종료한다.
			// return : 현재 수행중인 메소드(main)를 완전히 빠져나올 때 사용 되는 '키워드'이다.
		}

		System.out.println(check);
		System.out.println("program end");
	}

}
