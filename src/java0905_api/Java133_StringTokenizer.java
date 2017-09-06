package java0905_api;

import java.util.StringTokenizer;

public class Java133_StringTokenizer {

	public static void main(String[] args) {
		// 구분자가 연속적으로 입력되어 있으면 두번째 구분자부터는 무시를 한다.
		StringTokenizer st = new StringTokenizer("java,,jsp/spring", ",/");
		System.out.println(st.countTokens());

		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}

		System.out.println("//////////////////////////////");

		String[] data = "java,,jsp/spring".split("[,/]");
		System.out.println(data.length);
		for (String ss : data)
			System.out.println(ss);

	}

}
