package java0912_collection.answ;

import java.util.ArrayList;

public class BookManager {
	public static int getRentalPrice(ArrayList<BookDTO> bookList, String kind) {
		// 구현하세요.

		/*
		 * [문제]문제 개요 : 책 목록(bookList) 에서 특정 종류에 해당하는 책들만을 추출하여 가격의 총합을 리턴하는
		 * getRentalPrice() 메소드를 BookManager 클래스에 구현하시오. getRentalPrice() 메소드의 첫 번째
		 * 매개변수는 여러 BookDTO 객체가 저장되어 있는 ArrayList 이며, 두 번째 매개변수는 가격을 누적할 책 종류(kind) 이다.
		 * 
		 * [프로그램 실행결과] 컴퓨터책 대여수입 ---> 10300 소설책 대여수입 ---> 7200 만화책 대여수입 ---> 2000
		 * 
		 */
		ArrayList<BookDTO> aList = new ArrayList<BookDTO>(bookList);
		int totalPrice = 0;

		for (int i = 0; i < aList.size(); i++) {
			if (kind.equals(aList.get(i).getKind())) {
				totalPrice += aList.get(i).getRentalPrice();
			}
		}

		return totalPrice;
	}// end getRentalPrice()
}// end class
