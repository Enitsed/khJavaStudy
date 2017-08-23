package java0823_statement.prob;

/*
1+1+2+1+2+3+1+2+3+4+1+2+3+4+5=??

[출력결과]
sum=35
*/
public class Prob_03 {

	public static void main(String[] args) {
		int res = 0;
		for (int i = 1; i <= 5; i++) {
			for (int j = 0; j <= i; j++) {
				res += j;
			}
		}
		System.out.println("sum = " + res);
	}// end main()

}// end class
