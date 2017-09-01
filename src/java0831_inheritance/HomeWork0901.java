package java0831_inheritance;

/* 상속클래스를 이용하여 문제 만들기
 * 
 */

class Chicken {
	private int size;
	private String name;

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

interface Bornless {
	void sunsal();
}

class FriedChicken extends Chicken {

}

class ChickenBarbeque extends Chicken {

}

public class HomeWork0901 {
	public static void main(String[] args) {

	}
}
