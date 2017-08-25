package java0825_method;

/*
 * method(메소드) 정의
 * 1. 값을 계산하기 위해서 사용되는 기능이다.
 * 2. 객체의 동작을 처리하기 위한 기능이다.
 * 
 * method 구조 형태 : 메소드 선언부 + 메소드 구현부
 * 	리턴데이터타입 메소드명(데이터타입 매개변수) // 메소드 선언부
 * {
 * 		//	메소드 구현부
 * 			메소드가 처리해야할 로직 구현;
 * 		return 값;
 * }
 * 
 * 1. 리턴값이 없고 매개변수도 없다.
 * void add(){
 * 	int x= 10;
 * 	int y= 20;
 * 	System.out.println(x+y);
 * }
 * 
 * add(); // 메소드 호출
 * 
 * 2. 리턴값은 없지만 매개변수는 있다.
 * void plus(int x, int y){
 * 	System.out.println(x+y);
 * }
 * 
 * plus(10,20); // 메소드 호출
 * System.out.println(plus(10,20)); // (X)
 * 
 * 3. 리턴값은 있으나 매개변수가 없다.
 * double avg(){
 * 	int total = 15;
 * 	return total / 3.0;
 * }
 * 
 * double res = avg(); // 메소드 호출
 * System.out.println(avg()); // (O)
 * 
 * 4. 리턴값 있고 매개변수도 있다.
 * double avg(int x, int y){
 * 		return (x+y) / 2.0;
 * }
 * 
 * double res = avg(10,20); // 메소드 호출
 * System.out.println(avg(10,20)); // (O)
 */

public class Java052_method {
	// 프로그램을 실행하면 JVM(자바가상머신)에서 main스레드가
	// main() 메소드를 호출한다.
	public static void main(String[] args) { // main() 메소드 정의
		System.out.println("main start");
		makeTest(); // makeTest() 메소드 호출
		System.out.println("main end");
	} // end main()

	public static void makeTest() { // makeTest() 메소드 정의
		System.out.println("makeTest run");
	} // end makeTest()

} // end class
