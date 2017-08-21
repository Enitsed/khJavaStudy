package java0821_basic;

public class Java012_operator {

	public static void main(String[] args) {
		int a = 3;
		int b = 5;
		int c = 7;

		boolean res = (++a > b) && (++b < c); // && 연산자는 좌변이 false 이면 우변은 실행시키지 않는다. 따라서 b의 값은 5이다.
		// & 연산자는 좌변이 false 이어도 우변을 실행시킨다. 따라서 &&를 &로 치환 시 b의 값은 6이 된다.
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("res = " + res);

		int x = 4;
		int y = 8;
		int z = 10;

		res = (z > ++y) || (++x > y); // || 연산자는 좌변이 true 이면 우변을 실행시키지 않는다. 따라서 x의 값은 4이다.
		// | 연산자는 좌변이 true 이어도 우변을 실행시킨다. 따라서 ||를 |로 치환시 x의 값은 5가 된다.
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("res = " + res);

	}

}