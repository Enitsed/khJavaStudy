package java0828_class;

/*
 * 메뉴명		가격		갯수
 * 떡볶이		2000	3
 * 김말이		 500	2
 * 오뎅		 300	4
 */
/*
[출력결과]
	메뉴명 : 떡볶이
	가격 : 2000
	갯수 : 3
	메뉴 금액 : 6000
	메뉴명 : 김말이
	가격 : 500
	갯수 : 2
	메뉴 금액 : 1000
	메뉴명 : 오뎅
	가격 : 300
	갯수 : 4
	메뉴 금액 : 1200
	===============
	총 금액: 8200
*/
class MenuShop {
	String menu; // 메뉴명
	int price; // 가격
	int cnt; // 갯수

	// 주문메뉴 계산
	int count() {
		return price * cnt;
	}

	void prn() {
		System.out.println("메뉴명 : " + menu);
		System.out.println("가격 : " + price);
		System.out.println("갯수 : " + cnt);
		System.out.println("메뉴 금액 : " + count());
	}
}

public class Java068_class {

	public static void main(String[] args) {

		MenuShop ddeok = new MenuShop();
		ddeok.menu = "떡볶이";
		ddeok.price = 2000;
		ddeok.cnt = 3;
		ddeok.prn();

		MenuShop kim = new MenuShop();
		kim.menu = "김말이";
		kim.price = 500;
		kim.cnt = 2;
		kim.prn();

		MenuShop oden = new MenuShop();
		oden.menu = "오뎅";
		oden.price = 300;
		oden.cnt = 4;
		oden.prn();

		System.out.println("===============================");
		System.out.println("총 금액: " + (int) (ddeok.count() + kim.count() + oden.count()));

	}

}
