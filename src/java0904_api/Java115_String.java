package java0904_api;

class StringTest {
	private char[] arr;

	public StringTest() {

	}

	public StringTest(char[] arr) {
		this.arr = arr;
	}

	public int length() {
		return arr.length;
	}

	public char charAt(int index) {
		return arr[index];
	}

}

public class Java115_String {

	public static void main(String[] args) {
		StringTest st = new StringTest(new char[] { 'j', 'a', 'v', 'a' });
		System.out.println(st.length()); // 4
		System.out.println(st.charAt(2)); // v

	}

}
