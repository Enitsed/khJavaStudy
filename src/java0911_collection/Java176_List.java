package java0911_collection;

/*
 * 선형리스트(Linear List)
 * 1 순서리스트(Ordered List)
 * 2 자료들 간에 순서를 갖는 리스트
 * 3 선형 리스트에서 원소를 나열한 순서는 원소들의 순서가 된다.
 */

class UserList {

	int sale[] = new int[3];
	int point = 0;

	public void add(int data) {
		int[] arr;

		sale[point++] = data;
		if (sale.length == point) {
			arr = new int[sale.length * 2];
			System.arraycopy(sale, 0, arr, 0, sale.length);
			sale = arr;
		}
	}

	public void remove(int index) {

		for (int i = index; i < point; i++) {
			sale[i] = sale[i + 1];
		}
		point--;

	}

	public int get(int index) {
		return sale[index];
	}

	public int size() {
		return point;
	}
}

public class Java176_List {

	public static void main(String[] args) {
		/*
		 * sale[0] = 10; sale[1] = 20; sale[2] = 30;
		 */
		UserList ul = new UserList();

		ul.add(10);
		ul.add(20);
		ul.add(30);
		ul.add(40);
		ul.remove(1);

		for (int i = 0; i < ul.size(); i++)
			System.out.println(ul.get(i));

	}

}
