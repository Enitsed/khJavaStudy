package java0907_api;

public class Java151_System {

	public static void main(String[] args) {
		int[] arr1 = { 1, 5, 2, 4 };
		int[] arr2 = { 6, 3, 9, 7, 8 };
		int[] arr4 = { 4, 2 };
		int[] arr3 = process(arr1, arr2, arr4);

		for (int data : arr3)
			System.out.printf("%3d", data);

	}

	public static int[] process(int[] arr1, int[] arr2, int[] arr4) {

		int[] data = new int[arr1.length + arr2.length + arr4.length];

		/*for (int i = 0; i < arr1.length; i++)
			data[i] = arr1[i];
		for (int i = 0; i < arr2.length; i++)
			data[arr1.length + i] = arr2[i];
		for (int i = 0; i < arr4.length; i++)
			data[arr1.length + arr2.length + i] = arr4[i];*/

		System.arraycopy(arr1, 0, data, 0, arr1.length);
		System.arraycopy(arr2, 0, data, arr1.length, arr2.length);
		System.arraycopy(arr4, 0, data, arr1.length + arr2.length, arr4.length);

		return data;

	}

}
