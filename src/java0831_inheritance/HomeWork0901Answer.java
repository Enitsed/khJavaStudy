package java0831_inheritance;

/* 상속클래스를 이용하여 문제 만들기
 * [출력 결과]
 * BOQ 순살치킨 입니다.
 * BOQ 치킨, 소 사이즈입니다.
 */

class Chicken {
	private String size;
	private String name;

	Chicken(String name, String size) {
		this.size = size;
		this.name = name;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
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

class FriedChicken extends Chicken implements Bornless {

	public FriedChicken(String name, String size) {
		super(name, size);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sunsal() {
		System.out.println(super.getName() + " 순살치킨 입니다.");
	}

}

class ChickenBarbeque extends Chicken implements Bornless {

	public ChickenBarbeque(String name, String size) {
		super(name, size);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sunsal() {
		System.out.println(super.getName() + " 순살치킨 입니다.");
	}

}

public class HomeWork0901Answer {
	public static void main(String[] args) {
		FriedChicken fc = new FriedChicken("BOQ", "소");
		fc.sunsal();
		System.out.printf("%s 치킨, %s 사이즈입니다.", fc.getName(), fc.getSize());
	}
}
