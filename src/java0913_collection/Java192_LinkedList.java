package java0913_collection;

import java.util.LinkedList;

/*
 * stack (스택)
 * 1. LIFO(Last In First Out) : 마지막에 저장된 요소를 먼저 꺼낸다.
 * 2. 수색계산, 수식괄호 검사, undo/redo, 뒤로/앞으로
 * push : 넣는다 , pop : 꺼낸다.
 */

public class Java192_LinkedList {

	public static void main(String[] args) {
		LinkedList<String> nStack = new LinkedList<String>();
		// 추가
		nStack.push(new String("java"));
		nStack.push(new String("jsp"));
		nStack.push(new String("spring"));

		System.out.println("size:" + nStack.size()); // 3
		// 꺼내기
		while (!nStack.isEmpty()) {
			System.out.println(nStack.pop());
		}

		System.out.println("size:" + nStack.size()); // 0

	}

}
