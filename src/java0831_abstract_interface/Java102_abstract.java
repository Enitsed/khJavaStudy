package java0831_abstract_interface;

/*
 * 클래스 종류 : 클래스 , 추상클래스 , 인터페이스
 * 메소드 정의 : 메소드선언부 + 메소드구현부
 * 	public void prn() + {	}
 * 
 * 추상메소드 : 선언부만 정의되어 있는 메소드이다.
 *	abstract public void prn();
 * 
 * 추상클래스 : 추상메소드를 가지고 있는 클래스이다.
 * 	abstract class Test{}
 * 
 * 추상클래스 제공 목적 : 추상메소드를 강제적으로 오버라이딩하고
 * 	객체생성을 할 수 없도록 하기 위해서
 */

/*
 * Car : 속도, 색상, 움직인다. 속도를 높인다. 멈춘다. work();
 * Senda : 속도, 색상, 움직인다. 속도를 높인다. 멈춘다. 사람을 태운다.
 * Truck : 속도, 색상, 움직인다. 속도를 높인다. 멈춘다. 짐을 싣는다.
 */

abstract class CarAbs {
	int speed;
	String color;

	void upSpeed(int speed) {
		this.speed = speed;
	}

	abstract void work();

}

class Truck extends CarAbs {

	@Override
	void work() {
		// TODO Auto-generated method stub
		System.out.println("트럭에 짐을 싣고 있다.");
	}

}

class SendaAbs extends CarAbs {

	@Override
	void work() {
		// TODO Auto-generated method stub
		System.out.println("승용차가 사람을 태우고 있습니다.");
	}

}

public class Java102_abstract {

	public static void main(String[] args) {
		// CarAbs a = new CarAbs(); // 추상클래스는 객체 생성을 할 수 없다.
		Truck truck = new Truck();
		truck.work();

		SendaAbs senda = new SendaAbs();
		senda.work();

	}

}
