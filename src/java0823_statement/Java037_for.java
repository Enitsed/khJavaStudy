package java0823_statement;

/*
 * 반복문에서 특정 위치로 이동(continue)을 하거나 빠져나올때 (break)
 * 반복문은 label명을 선언하고 호출하면 된다.
 */
public class Java037_for {

	public static void main(String[] args) {
		move: // label 선언
		for (int i = 1; i <= 3; i++) {
			for (int j = 0; j <= 2; j++) {
				System.out.printf("j=%d\t", j);
				// continue move; // label 호출 => i++ 증감식으로 이동.
				break move;
			}
			System.out.printf("i=%1d\n", i);
		}
		System.out.println("program end");

	}

}
