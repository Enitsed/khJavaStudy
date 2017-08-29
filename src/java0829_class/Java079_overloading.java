package java0829_class;

/*
 * 오버로딩(overloading)
 * 1. 하나의 클래스에 같은 이름의 메서드를 여러개 정하는 것을 오버로딩이라 한다.
 * 2. 오버로딩의 조건
 * 		1) 메서드의 이름이 같아야한다.
 * 		2) 매개변수의 갯수 또는 데이터 타입이 달라야한다.
 * 		3) 매개변수는 같고 리턴타입이 다른 경우는 오버로딩이 성립되지 않는다.
 * 			(즉 리턴 타입은 오버로딩을 구현하는데 아무런 영향을 주지 않는다.)
 */

class Calculator {
	void addValue(int x, int y) {
		System.out.println(x + y);
	}

	void addValue(int x, int y, int z) {
		System.out.println(x + y + z);
	}

	void addValue(double x, double y) {
		System.out.println(x + y);
	}

/*	double addValue(double x, double y) {
		System.out.println(x + y);
	}*/ // 리턴타입과 매개변수 이름은 오버로딩 구현에 상관이 없다.

}

public class Java079_overloading {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.addValue(4, 8);
		c.addValue(2, 7, 5);
		c.addValue(1.0, 2.0);

	}

}
