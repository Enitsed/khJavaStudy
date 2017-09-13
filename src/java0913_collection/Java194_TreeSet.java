package java0913_collection;

import java.util.Iterator;
import java.util.TreeSet;

public class Java194_TreeSet {

	public static void main(String[] args) {

		// tree는 정렬을 시켜준다는 의미.
		TreeSet<Integer> tree = new TreeSet<Integer>();
		tree.add(new Integer(10));
		tree.add(new Integer(40));
		tree.add(new Integer(20));
		tree.add(new Integer(30));

		// tree.add(new Integer(20));
		// set 은 중복 값 허용이 안된다. 추가 하는 순서대로 유지가 안된다.

		System.out.println("오름차순");
		Iterator<Integer> ite = tree.iterator();
		while (ite.hasNext()) {
			System.out.println(ite.next());
		}

		System.out.println("내림차순");
		ite = tree.descendingIterator();
		while (ite.hasNext()) {
			System.out.println(ite.next());
		}

	}

}
