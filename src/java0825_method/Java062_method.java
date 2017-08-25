package java0825_method;

/*
[출력결과]
입사총점:815점
입사결과:합격입니다.
*/

public class Java062_method {

	public static void main(String[] args) {
		int toeic = 750, it = 65;
		System.out.println("입사 총점 : " + total(toeic, it) + "점");
		System.out.println("입사 결과 : " + rs(total(toeic, it)) + "입니다");
	}

	public static int total(int toeic, int it) {
		// 두 매개변수의 합계를 계산하여 리턴한다.
		return toeic + it;
	}

	public static String rs(int tot) {
		// 총점이 800이상이면 합격 , 미만이면 불합격
		return tot >= 800 ? "합격" : "불합격";
	}

}
