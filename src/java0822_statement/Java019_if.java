package java0822_statement;

/*
 * if안에 if
 * 
 * if (조건식1) {
 * 		if (조건식2) {		// 조건식 1과 조건식 2를 모두 만족할 때 수행.
 * 			수행할 문장;
 * 		} else {			// 조건식 1이 참이고 조건식 2가 거짓일 때 수행.
 * 			수행할 문장;
 * 		}
 * } else {					// 조건식 1이 거짓일 때 수행.
 * 		수행할 문장;
 * }
 */

public class Java019_if {

	public static void main(String[] args) {
		boolean member = true; // 회원 or 비회원
		String grade = "일반"; // 회원 등급
		// 회원이면 vip고객이면 30% 적립, 회원이면서 vip고객이 아닐 경우 10% 적립.

		if (member) {
			if (grade == "vip") {
				System.out.println("vip회원 30% 적립");
			} else {
				System.out.println("일반회원 10% 적립");
			}
		} else {
			System.out.println("비회원입니다.");
		}

		System.out.println("고객님 감사합니다.");

	}

}
