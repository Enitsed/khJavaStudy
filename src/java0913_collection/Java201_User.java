package java0913_collection;

/*
 * 1. 와일드카드(?)를 제공하는 이유
 * 		: 컬렉션에 저장되는 요소들이 특정한 객체로 정해진 상태에서 다른 객체형은 저장할 수 없는 상태 였다. 하지만 때로는 기존과 같이 모든 객체들을 저장해야 할 때가 있다.
 * 2. 와일드 카드의 구성
 * 	<?> : 모든 객체자료형에 대한 배치를 의미한다.
 * 	<? super 객체자료형> : 명시된 객체자료형이나 객체자료형의 상위 객체들의 배치를 의미한다.
 * 	<? extends 객체자료형> : 명시된 객체자료형이나 객체자료형으로 부터 상속받은 하위 객체들의 배치를 의미한다.
 */

class Seoul {
	public void showYou() {
		System.out.println("seoul");
	}
}

class Fruit extends Seoul {
	public void showYou() {
		System.out.println("fruit");
	}
}

class Apple extends Fruit {
	@Override
	public void showYou() {
		System.out.println("apple");
	}
}

class Orange extends Fruit {
	@Override
	public void showYou() {
		System.out.println("orange");
	}
}

class FruitBox<T> {
	T item;

	public void store(T item) {
		this.item = item;
	}

	public T pullout() {
		return item;
	}
}

public class Java201_User {

	public static void main(String[] args) {
		FruitBox<Apple> fApple = new FruitBox<Apple>();
		fApple.store(new Apple());
		openAndFruitBox(fApple);

		FruitBox<Seoul> fSeoul = new FruitBox<Seoul>();
		fSeoul.store(new Seoul());
		// openAndFruitBox(fSeoul); // Fruit 클래스를 상속받지 않아서 사용할 수 없다.

		openAndSeoul(fSeoul);

	}

	public static void openAndFruitBox(FruitBox<? extends Fruit> param) { // Fruit과 Fruit을 상속받은 자손 객체만 사용할 수 있따.
		param.pullout().showYou();
	}

	public static void openAndSeoul(FruitBox<? super Seoul> param) { // Seoul이나 Seoul 상위의 부모객체만 사용할 수 있다.
		((Seoul) param.pullout()).showYou();
	}
}
