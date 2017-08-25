package java0825_method;

public class Java064_method {

	public static void main(String[] args) {
		char[] data = new char[] { 'a', 'b', 'c' };
		System.out.println(data); // abc // char 배열만 출력할때 문자열 값이 나옴**
		System.out.println("data= " + data); // data= [C@7d4991ad // 주소값
		System.out.printf("%s\n", data); // [C@7d4991ad // 주소값

		int[] num = new int[] { 1, 2, 3 };
		System.out.println(num); // [I@28d93b30 // 주소값

		String[] str = new String[] { "a", "b", "c" };
		System.out.println(str); // [Ljava.lang.String;@1b6d3586

	}

}
