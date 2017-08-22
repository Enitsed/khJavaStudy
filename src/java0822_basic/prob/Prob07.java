package java0822_basic.prob;

/*
 * 1. jumsu 변수에 저장된 값에 따라 상, 중, 하를 출력하는 프로그램을 작성하시오.
 * jumsu 변수의 값이 80점 이상이면 "상", 80미만 65이상이면 "중", 65미만이면 "하"로 출력
 * [출력 결과]
 * 상
 * 
 * 식1 ? 참1 : 거짓1
 * 식1 ? (식2 ? 참2 : 거짓2) : 거짓1
 * 식1 ? 참1 : (식2 ? 참2 : 거짓2)
 * 식1 ? (식2 ? 참2: 거짓2) : (식3 ? 참3 :거짓3)
 */

public class Prob07 {

	public static void main(String[] args) {
		int jumsu = 80;

		// 여기에 작성 하시오.
		// char grade = jumsu >= 80 ? '상' : jumsu >= 65 ? '중' : '하';
		char grade = jumsu >= 65 ? (jumsu >= 80 ? '상' : '중') : '하';

		System.out.printf("%c", grade);
	}

}
