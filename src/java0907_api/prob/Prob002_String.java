package java0907_api.prob;

/*
 * javac Prob002_String.java
 * java Prob001_String JAva Test
 */
/*1 프로그램 실행할때  "JAva Test" 문자열을 args배열에서 값을 받아 출력결과에 같이
 *  나오도록 프로그램을 구현하시오.
 *  java Prob002_String JAva Test
 *   * 
 * 2 출력결과
 *   source : JAva Test 
 *   convert: jaVA tEST
 *   length: 9
 *   reverse : tseT avAJ
 */

public class Prob002_String {

	public static void main(String[] args) {
		String source = args[0];
		String convert = null;
		int length = source.length();
		String reverse = null;

		char[] srcArr = new char[source.length()];

		for (int i = 0; i < source.length(); i++) {
			if (Character.isUpperCase(source.charAt(i))) {
				srcArr[i] = Character.toLowerCase(source.charAt(i));
			} else {
				srcArr[i] = Character.toUpperCase(source.charAt(i));
			}
		}
		convert = String.valueOf(srcArr);

		StringBuffer sb = new StringBuffer(source).reverse();
		reverse = sb.toString();

		System.out.println("source : " + source);
		System.out.println("convert : " + convert);
		System.out.println(length);
		System.out.println("reverse : " + reverse);

	}

}// end class
