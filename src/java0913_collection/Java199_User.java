package java0913_collection;

class Box<T> {
	private T data;

	public Box() {

	}

	public Box(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

}

public class Java199_User {

	public static void main(String[] args) {
		Box<Integer> box = new Box<Integer>();
		box.setData(new Integer(10));

		System.out.println(box.getData());

		Box<String> box1 = new Box<String>("java");

		System.out.println(box1.getData());

	}

}
