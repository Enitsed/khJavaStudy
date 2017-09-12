package java0912_collection;

import java.util.Vector;

public class Java180_Vector {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		v.add(new Integer(10));
		v.add(new Integer(20));
		v.add(new Integer(30));

		// 1인덱스의 요소를 제거한다.
		v.remove(1);
		// 0인덱스에 40 요소를 삽입한다.
		v.add(0, new Integer(40));

		for (int i = 0; i < v.size(); i++) {
			System.out.printf("[%d] = %d\n", i, v.get(i));
		}

	}

}
