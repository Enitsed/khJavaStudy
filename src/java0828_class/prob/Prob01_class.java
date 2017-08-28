package java0828_class.prob;

/*피자의 반지름을 10, 도넛의 반지름은 2로 한다.
 * 
 * [실행결과]
 * 자바피자의 면적은 314.0
 * 자바도넛의 면적은 12.56
 */

class Circle {
	int radius; // 원의 반지름을 저장하는 멤버 변수
	String name; // 원의 이름을 저장하는 멤버 변수

	public double getArea() { // 멤버 메소드
		return 3.14 * radius * radius;
	}

}// end class////////////////////////

public class Prob01_class {

	public static void main(String[] args) {
		// 여기를 구현하세요.////////////////////
		Circle pizza = new Circle();
		pizza.radius = 10;
		pizza.name = "자바피자";
		System.out.printf("%s의 면적은 %.1f\n", pizza.name, pizza.getArea());
		Circle donut = new Circle();
		donut.radius = 2;
		donut.name = "자바도넛";
		System.out.printf("%s의 면적은 %.2f\n", donut.name, donut.getArea());

	}// end main()

}// end class
