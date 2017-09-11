package java0911_collection;

import java.util.Vector;

/*
 * 홍길동 30
 * 이영희 25
 */

class Person {
	String name;
	int age;

	public Person() {
		super();
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return name + " " + age;
	}
}

public class Java178_Vector {

	public static void main(String[] args) {
		/*
		 * Person arr[] = new Person[2]; arr[0] = new Person("홍길동", 30); arr[1] = new
		 * Person("이영희", 25);
		 * 
		 * for (Person ps : arr) { System.out.printf("%s \n", ps.toString()); }
		 */

		Vector<Person> vt = new Vector<Person>();
		vt.add(new Person("홍길동", 30));
		vt.add(new Person("이영희", 25));

		for (Person ps : vt) {
			System.out.println(ps.toString());
		}

	}

}
