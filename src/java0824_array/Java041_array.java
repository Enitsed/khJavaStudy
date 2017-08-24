package java0824_array;

/*
 * 변수 : 하나의 값을 저장하기 위한 기억 공간이다.
 * 배열 :
 * 1. 같은 데이터 타입의 여러 변수를 하나의 묶음으로 다루는 것이다.
 * 2. 많은 양의 값(데이터)를 다룰 때 유용하다.
 * 3. 배열의 각 요소(element)는 서로 연속적이다.
 * 
 */

public class Java041_array {

	public static void main(String[] args) {
		/*
		 * int ko = 90; int en = 80; int jp = 40;
		 */

		// 배열 선언
		int[] jumsu; // int jumsu[];
		// 배열 생성
		jumsu = new int[3]; // new 라는 키워드로 메모리 확보 . int 형 데이타 3개 => 12바이트
		// 참조형 데이터의 값은 heap 영역에 저장된다. 참조형 데이터의 주소는 stack 영역에 저장된다.
		// 각 요소가 인덱스 0부터 생성된다. ex) 0 , 1 , 2
		// 배열 요소 출력
		for (int i = 0; i < jumsu.length; i++) {
			jumsu[i] = i;
			System.out.printf("jumsu[%d] = %d\n", i, jumsu[i]);
		}

	}

}
