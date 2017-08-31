package java0831_abstract_interface;

/*
 * 피아노 연주하다.
 * 플룻 연주하다.
 */

abstract class Instrument {
	String name;

	public Instrument(String name) {
		this.name = name;
	}

	abstract void play();
}

class Piano extends Instrument {

	public Piano(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	void play() {
		// TODO Auto-generated method stub
		System.out.println("손가락으로 누른다.");
	}

}

class Flute extends Instrument {

	public Flute(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	void play() {
		// TODO Auto-generated method stub
		System.out.println("입으로 분다.");
	}

}

public class Java104_abstract {

	public static void main(String[] args) {

		Piano p = new Piano("Piano");
		System.out.println(p.name);
		p.play();

		Flute f = new Flute("Flute");
		System.out.println(f.name);
		f.play();

	}

}
