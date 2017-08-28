package java0828_class;

/*
 * [사각형 도형]
 * 가로	세로		넓이를 구한다	둘레를 구한다
 * 5	3		15			16
 * 7	4		28			22
 */

/*
 * [객체 모델링과정]
 * 객체의 특징 : 가로, 세로
 * 객체의 기능 : 넓이를 구한다, 둘레를 구한다. 
 */
/*[출력결과]
	[가로5,	세로3의 사각형]
	넓이: 15
	둘레: 16
	=========================
	[가로7,	세로4의 사각형]
	넓이: 28
	둘레: 22
*/
class Rect {
	int width;
	int height;

	int area() {
		return width * height;
	}

	int grith() {
		return width * 2 + height * 2;
	}

	void prn() {
		System.out.printf("[가로%d,	세로%d의 사각형]\n", width, height);
		System.out.println("넓이: " + area());
		System.out.println("둘레: " + grith());
	}
}

public class Java067_class {

	public static void main(String[] args) {
		Rect t1 = new Rect();
		t1.width = 5;
		t1.height = 3;

		t1.prn();

		System.out.println("=========================");

		Rect t2 = new Rect();
		t2.width = 7;
		t2.height = 4;

		t2.prn();

	}

}
