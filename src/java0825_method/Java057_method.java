package java0825_method;

/*
 *  자바에서 제공하는 데이터 타입(data type)
 * 1. 기본 데이터 타입(primitive data type)
 * 	byte, short, int, long
 * 	float, double, char, boolean
 * 2. 참조 데이터 타입(reference data type)
 * 	배열(array), 클래스(class), 인터페이스(interface)
 * [인자(매개변수) 전달방식]
 * 1. call by value : 값 복사
 * 	인자값을 전달할때 기본 데이터 타입을 넘겨주는 형식이다.
 * 2. all by reference : 주소 복사
 * 	인자값을 전달할때 참조 데이터 타입을 넘겨주는 형식이다.
 */

public class Java057_method {

	public static void main(String[] args) {
		int a = 10, b = 20;
		callByValue(a, b);
		System.out.printf("a=%d, b=%d", a, b);

		System.out.println("///////////////////////////////");

		int[] arr = new int[] { 2, 5 };
		callByReference(arr);
		System.out.printf("arr[0]=%d, arr[1]=%d\n", arr[0], arr[1]);
	} // end main

	public static void callByValue(int x, int y) {
		int temp = x;
		x = y;
		y = temp;
	} // end callByValue()

	public static void callByReference(int[] data) {
		int temp = data[0];
		data[0] = data[1];
		data[1] = temp;
		System.out.printf("data[0]=%d, data[1]=%d\n", data[0], data[1]);
	} // end callByReference()

}
