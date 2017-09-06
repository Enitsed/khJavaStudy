package java0905_api;

public class Java130_StringBuffer {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("java test");

		// 4인덱스에 ",jsp 문자열을 삽입한다.
		sb.insert(4, ",jsp"); // java, jsp test

		System.out.println(sb);

		// 4인덱스부터 8인덱스 미만 사이의 문자열을 삭제한다.
		sb.delete(4, 8); // java test

		System.out.println(sb);

		// 0인덱스의 문자를 삭제한다
		sb.deleteCharAt(0); // ava test

		System.out.println(sb);

		// 문자열을 반대로 변경해서 리턴한다.
		sb.reverse(); // tset ava

		System.out.println(sb);

		System.out.println("================================");

		String data = "mybatis orm";
		StringBuffer sf = new StringBuffer(data);
		sf.reverse();

		System.out.println(sf); // mro sitabym

		System.out.println("================================");

		char[] arr = new char[] { 'k', 'o', 'r', 'e', 'a' };
		StringBuffer se = new StringBuffer(String.valueOf(arr));
		se.reverse();

		System.out.println(se);

		System.out.println("////////////////////////////////");

		StringBuffer sa = new StringBuffer();
		sa.append(arr);
		sa.reverse();

		System.out.println(sa);

		System.out.println("////////////////////////////////");

		display(String.valueOf(arr));

	}

	public static void display(String sg) {
		StringBuffer sn = new StringBuffer(sg);
		sn.reverse();
		System.out.println(sn);
	}

}
