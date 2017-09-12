package java0912_collection;

import java.util.LinkedList;

/*
 * 1. 배열 구조로 데이터 관리 : Vector, ArrayList -추가- (순차적으로 처리할때 사용한다.)
 * 2. 링크로 데이터 관리 : LinkedList -삽입,삭제- (비순차적으로 처리할때 사용한다.)
 * 3. List을 구현해놓은 컬렉션
 * 		Vector, ArrayList, LinkedList는 add( )해준 순서대로 데이터 관리를 해준다.
 */

public class Java190_LinkedList {

	public static void main(String[] args) {
		LinkedList<String> aNode = new LinkedList<String>();
		// 추가
		aNode.add(new String("java"));
		aNode.add(new String("jsp"));
		aNode.add(new String("spring"));

		System.out.println(aNode);

		// 삽입
		aNode.add(1, new String("ajax"));
		System.out.println(aNode);

		// 삭제
		aNode.remove(2);
		System.out.println(aNode);

	}

}
