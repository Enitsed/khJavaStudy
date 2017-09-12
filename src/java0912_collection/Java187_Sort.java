package java0912_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.ListIterator;

// 오름차순
class Ascending implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		System.out.println((o1 + "/ " + o2 + " ") + o1.compareTo(o2));
		return o1.compareTo(o2);
	}

}

// 내림차순
class Descending implements Comparator<Integer> {
	@Override
	public int compare(Integer o1, Integer o2) {
		return o2.compareTo(o1);
	}
}

public class Java187_Sort {

	public static void main(String[] args) {
		Integer[] arr = new Integer[] { 1, 3, 5, 2, 4 };
		ArrayList<Integer> aList = new ArrayList<Integer>(Arrays.asList(arr));

		// 오름차순
		aList.sort(new Ascending());
		System.out.println(aList);

		// 내림차순
		aList.sort(new Descending());
		System.out.println(aList);

		System.out.println("//////////////////");
		Collections.sort(aList);
		System.out.println(aList);

		Collections.sort(aList, new Descending());
		System.out.println(aList);

		System.out.println("///////////////////");
		ListIterator<Integer> ite = aList.listIterator();
		while (ite.hasNext()) {
			System.out.println(ite.next());
		}

		System.out.println("===================");
		while (ite.hasPrevious()) {
			System.out.println(ite.previous());
		}

	}

}
