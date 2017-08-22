package java0822_basic.prob;

/*
 * 동전 교환 프로그램
 * 1. 가장 적은 동전으로 교환할 수 있는 프로그램 작성하시오.
 * 2. [출력결과]
 * 	500원 : 15개
 * 	100원 : 2개
 * 	 50원 : 1개
 * 	 10원 : 2개
 * 	  1원 : 7개
 */

public class Prob08 {

	public static void main(String[] args) {
		int money = 7777;
		int coin500 = 500;
		int coin100 = 100;
		int coin50 = 50;
		int coin10 = 10;
		int coin1 = 1;
		int amountOfCoin500;
		int amountOfCoin100;
		int amountOfCoin50;
		int amountOfCoin10;
		int amountOfCoin1;

		amountOfCoin500 = money / coin500;
		amountOfCoin100 = (money % coin500) / coin100;
		amountOfCoin50 = (money % coin100) / coin50;
		amountOfCoin10 = (money % coin50) / coin10;
		amountOfCoin1 = (money % coin10) / coin1;

		System.out.printf("500 원 = %d개, 100원 =  %d개, 50원 = %d개, 10원 = %d개, 1원 = %d개 ", amountOfCoin500, amountOfCoin100,
				amountOfCoin50, amountOfCoin10, amountOfCoin1);

	}

}
