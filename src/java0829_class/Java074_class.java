package java0829_class;

/*
 * 아래를 참조하여 main() 메소드를 추가하는 로직을 구현하세요.
 * 
 * [실행결과]
	상품		가격		상품제고	팔린수량
Nikon            400000    30    50 
Sony             450000    20    35 
FujiFilm         350000    10    25 
 */

class Goods {
	String name; // 상품명
	int price; // 상품 가격
	int numberOfStock; // 상품 재고
	int sold; // 팔린 수량

	public Goods() {

	}

	public Goods(String name, int price, int numberOfStock, int sold) {
		this.name = name;
		this.price = price;
		this.numberOfStock = numberOfStock;
		this.sold = sold;
	}

	public void prn() {
		System.out.printf("%-14s %8d %5d %5d \n", name, price, numberOfStock, sold);
	}

	

}
public class Java074_class {
	
	public static void display(Goods[] goodArray) {
		for (int i = 0; i < goodArray.length; i++) {
			goodArray[i].prn();
		}
	}
	
	public static void main(String[] args) {

/*		Goods nc = new Goods("Nikon", 400000, 30, 50);
		Goods sc = new Goods("Sony", 450000, 20, 35);
		Goods fc = new Goods("FujiFilm", 350000, 10, 25);
		System.out.printf("%-14s\t%4s    %8s %5s \n", "상품", "가격", "상품 재고", "팔린 수량");
		nc.prn();
		sc.prn();
		fc.prn();
*/
		
		Goods[] goodArray = new Goods[3];
		goodArray[0] = new Goods("Nikon", 400000, 30, 50);
		goodArray[1] = new Goods("Sony", 450000, 20, 35);
		goodArray[2] = new Goods("FujiFilm", 350000, 10, 25);

/*		goodArray[0].prn();
		goodArray[1].prn();
		goodArray[2].prn();
*/		
/*		for (int i = 0; i < goodArray.length; i++) {
			goodArray[i].prn();
		}
*/		
		display(goodArray);
		
	}
	

}
