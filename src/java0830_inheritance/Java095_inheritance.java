package java0830_inheritance;

class Parent {
	String name;
	int age;

	public Parent() {

	}

	public Parent(String name, int age) { // 5
		this.name = name; // 6
		this.age = age; // 7
	}

}

class Sun extends Parent {
	String dept;

	public Sun() {

	}

	public Sun(String name, int age, String dept) { // 3
		super(name, age); // 4
		this.dept = dept; // 8
	}

	public void prn() {
		System.out.printf("%s %d %s\n", name, age, dept); // 10
	}

}

public class Java095_inheritance {

	public static void main(String[] args) { // 1
		Sun s = new Sun("홍길동", 50, "기획부"); // 2
		s.prn(); // 9

	}

}
