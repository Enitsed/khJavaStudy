package java0821_basic;

public class Java009_operator {

	public static void main(String[] args) {
		int i = 5;
		int j = 0;

		// 전위형 : 값이 참조되기 전에 증가시킨다.
		// i 변수의 값을 1 증가하고 j 변수에 대입한다.
		j = ++i;

		System.out.println("j = " + j); // 6
		System.out.println("i = " + i); // 6

		i = 5;

		// 후위형 : 값이 참조된 후에 증가시킨다.
		// i 변수의 값을 j 변수에 대입한 후 i 변수를 1 증가한다.
		j = i++;

		System.out.println("j = " + j); // 5
		System.out.println("i = " + i); // 6

	}

}