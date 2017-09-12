package java0912_collection;

public class Java188_Sort {

	public static void main(String[] args) {
		String a = "ABCqwer";
		String b = "ABC";
		String d = "ABC";
		String e = "ab";

		System.out.println(b.compareTo(d)); // 0

		// 'A'-'a' => 65-97 = -32
		System.out.println(d.compareTo(e)); // -32

		// 앞에 문자 같고 길이가 다르면 길이를 비교한다.
		System.out.println(a.compareTo(b)); // 4

	}

}
