package java0904_binding;

/*
 * instanceof : 객체를 비교하기 위한 비교 연산자이다.
 * a instanceof A
 * 	: a객체가 A타입이면 true, 아니면 false 리턴한다.
 */

class ExamA {

}

class ExamB extends ExamA {

}

class ExamC extends ExamB {

}

public class Java113_instanceof {

	public static void main(String[] args) {
		ExamB bb = new ExamB();
		System.out.println(bb instanceof ExamA); // true

		ExamA aa = new ExamA();
		System.out.println(aa instanceof ExamB); // false

		ExamA ea = new ExamB();
		System.out.println(ea instanceof ExamA); // true
		System.out.println(ea instanceof ExamB); // true
		System.out.println(ea instanceof ExamC); // false

	}

}
