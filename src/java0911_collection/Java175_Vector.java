package java0911_collection;

import java.util.Vector;

public class Java175_Vector {

	public static void main(String[] args) {
		Vector v = new Vector();
		// Integer -> Object : up-casting
		v.add(new Integer(10));
		v.add(new Integer(20));
		v.add(new Integer(30));
		v.add(40);
		// auto boxing -> upcasting 으로 Integer 가 Object 로 저장.

		for (int i = 0; i < v.size(); i++) {
			// Object -> Integer : down-casting
			Integer it = (Integer) v.get(i);
			System.out.println(it);

		}

	}

}
