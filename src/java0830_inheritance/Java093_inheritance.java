package java0830_inheritance;

class MyGrand {
	public MyGrand() {
		System.out.println("MyGrand");
	}
}

class MyFather extends MyGrand {
	public MyFather() {
		System.out.println("MyFather");
	}
}

class MyChild extends MyFather {
	public MyChild() {
		// 자식생성자에서는 반드시 부모생성자를 호출해야한다.
		// 부모생성자 호출이 생략되어 있으면 JVM에서 super()로 호출한다,
		super();
		System.out.println("MyChild");
	}
}

public class Java093_inheritance {

	public static void main(String[] args) {
		MyChild mc = new MyChild();

	}

}
