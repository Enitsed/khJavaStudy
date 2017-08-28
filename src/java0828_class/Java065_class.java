package java0828_class;

// 홍길동 30 M
// 갑동이 25 F

// 사용자가 정의한 데이터 타입
class Person {
	// 멤버변수
	String name;
	int age;
	char gen;

	// 메소드
	void eat() {
		System.out.println("Eat");
	}

	void run() {
		System.out.println("Run");
	}
}

public class Java065_class {

	public static void main(String[] args) {
		Person ps; // 객체참조변수 선언
		ps = new Person(); // 객체 생성

		// Person ps = new Person();

		// 객체참조변수.멤버변수;
		ps.name = "홍길동";
		ps.age = 30;
		ps.gen = '남';

		System.out.printf("%s %d %c\n", ps.name, ps.age, ps.gen);
		// 객체참조변수.메소드();
		ps.eat();
		ps.run();

		Person pn = new Person();

		pn.name = "이영희";
		pn.age = 25;
		pn.gen = '여';

		System.out.printf("%s %d %c\n", pn.name, pn.age, pn.gen);
		pn.eat();
		pn.run();

	}

}
