package java0822_basic.prob;

/*
 * 1 . 사과를 담는데 필요한 바구니의 수를 구하는 코드이다. 
 * 2 . 만일 사과의 수가 123개이고 하나의 바구니에는 10개의 사과를 담을 수 있다면, 13개의 바구니가 필요하다.
 * [ 실행 결과 ] 
 * 필요한 바구니의 수  : 13
 */

public class Prob04 {

	public static void main(String[] args) {
		// 여기에 작성하시오.
		int apple = 123; // 총 사과 개수
		int basket = 10; // 하나의 바구니에 담을 수 있는 사과 수
		int neededBasket = 0; // 필요한 바구니 수

		neededBasket = apple % basket == 0 ? apple / basket : apple / basket + 1;

		System.out.printf("필요한 바구니의 수 : %d", neededBasket);

	}

}
