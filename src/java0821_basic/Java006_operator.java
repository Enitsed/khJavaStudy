package java0821_basic;

public class Java006_operator {

	public static void main(String[] args) {
		int a = 10;
		int b = 3;

		System.out.println(a / b); // int / int (몫) => 3
		System.out.println(a % b); // int % int (나머지) => 1
		System.out.println((double) (a / b)); // 3.0 a/b 를 먼저 계산후 double 형으로 변환
		System.out.println((double) a / b); // 3.333333 a를 먼저 double 형으로 변환 후 계산
	}

}