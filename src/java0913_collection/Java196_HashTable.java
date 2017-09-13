package java0913_collection;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

/*
 * HashTable
 * 1. Map 인터페이스를 구현해놓은 클래스
 * 2. Map 인터페이스를 구현해놓은 클래스들은 key, value 쌍으로 저장한다.
 * 3. value를 구분해주는 것은 key이므로 key는 중복을 허용하지 않는다.
 */

public class Java196_HashTable {

	public static void main(String[] args) {
		Hashtable<Integer, String> table = new Hashtable<Integer, String>();

		table.put(10, "java");
		table.put(20, "jsp");
		table.put(30, "spring");

		System.out.println(table.get(20));

		System.out.println("///////////////////Enueration/////////////////////");
		Enumeration<Integer> enu = table.keys();
		while (enu.hasMoreElements()) {
			Integer key = enu.nextElement();
			System.out.printf("%d:%s\n", key, table.get(key));
		}

		System.out.println("////////////////////Iterator///////////////////////");
		Set<Integer> set = table.keySet();
		Iterator<Integer> ite = set.iterator();
		while (ite.hasNext()) {
			Integer key = ite.next();
			System.out.printf("%d:%s\n", key, table.get(key));
		}

	}

}
