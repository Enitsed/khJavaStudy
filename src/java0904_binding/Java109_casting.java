package java0904_binding;

/*
 * 데이터 타입
 * 1. 기본데이터 타입 : byte , short , int, long, float, double, boolean, char
 * 2. 참조데이터 타입 : array, class, interface
 * 
 * 인자전달방식
 * 1. call by value - 값 복사 - 기본데이터 타입
 * 	void add(int a, int b){ }
 * 	add(10, 20);
 * 2. call by reference - 주소복사 - 참조데이터 타입
 * 	void process(int[] arr){ }
 * 	process(new int[]{1,2,3});
 * 
 * 형변환(casting)-기본데이터 타입
 * 1. 묵시적 형변환 : 작 -> 큰
 * 2. 명시적 형변환 : 큰 -> 작
 * 	int num=3;
 * 	double data=num; // 묵시적 형변환
 * 	short val=(short)num; // 명시적 형변환
 * 
 * 객체형변환-참조데이터 타입
 * 1. 상속관계일때 형변환이 가능하다. (is a 관계)
 * 2. 업캐스팅 발생된 후 다운캐스팅을 할 수 있다.
 * 
 * 업캐스팅(up-casting) : 부모객체로 자식객체를 참조하도록 형변환하는 기술
 * 다운캐스팅(down-casting) : 업캐스팅을 다시 원상복귀 해주는 형변환하는 기술
 * 
 * 다형성(polymorphism)
 * 1. 사전적 의미는 '여러가지 형태를 가질 수 있는 능력'을 의미한다.
 * 2. 자바에서는 한 타입의 참조변수로 여러타입의 객체를 참조하는 기술이다.
 * 		예를 들면, 조상클래스 타입의 참조변수로 자손클래스의 인스턴스를 참조할 수 있도록 할 수 있다는 것이다.
 * 
 * 바인딩(binding) : 메소드 호출을 실제 메소드의 몸체와 연결하는 기술이다.
 * 1. 정적 바인딩(static binding) : 컴파일 단계에서 어떤 클래스의 어떤 메소드가 호출되는지 연결하는 기술
 * 2. 동적 바인딩(dynamic binding) : 실행단계에서 어떤 클래스의 어떤 메소드가 호출되는지 연결하는 기술
 * 
 */
class Parent {
	void process() {
		System.out.println("Parent");
	}
}

class Child extends Parent {
	void call() {
		System.out.println("Child");
	}

	@Override
	void process() {
		System.out.println("Child process()");
	}
}

class Sun extends Parent {
	void prn() {
		System.out.println("Sun");
	}

	@Override
	void process() {
		System.out.println("Sun process()");
	}

}

class Outer {
	void prn() {
		System.out.println("Outer");
	}
}

public class Java109_casting {

	public static void main(String[] args) {
		Parent p = new Parent();
		Outer t = new Outer();
		// 독립적인 참조데이터 타입(객체)은 형변환이 안된다.
		// p= t;

		Child c = new Child();
		// 업캐스팅(up-casting) : 부모객체로 자식객체를 참조하도록 하는 형변환 기술
		p = c;
		p.process();
		// p.call();

		// 객체생성 및 업캐스팅
		Parent pt = new Child();

		// 다운캐스팅(down-casting) : 업캐스팅을 다시 원상복귀해주는 형변환하는 기술
		Child cn = (Child) pt;
		cn.process();
		cn.call();

		Parent pe = new Sun();
		pe.process();

	}

}
