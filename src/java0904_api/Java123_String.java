package java0904_api;

/*
 * [출력결과]
 *  홍길동님은 남성입니다.
 *  응삼이님은 여성입니다.
 *  잘못입력하셨습니다.
 */
public class Java123_String {

	public static void main(String[] args) {
		String p1 = "홍길동,561203-1597650";
		String p2 = "응삼이,030628-4056892";
		String p3 = "갑동이,900824-8052582";
		display(p1);
		display(p2);
		display(p3);
	}// end main( )

	public static void display(String str) {
		// 여기를 구현하세요.
		String[] temp = str.split(",");
		String[] num = temp[1].split("-");

		if (num[1].startsWith("1") || num[1].startsWith("3")) {
			System.out.println(temp[0] + "님은 남성입니다.");
		} else if (num[1].startsWith("2") || num[1].startsWith("4")) {
			System.out.println(temp[0] + "님은 여성입니다.");
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}

	}// end display()

}// end class
