package java0824_array;

public class Java045_array {

	public static void main(String[] args) {
		int[] data1 = new int[3]; // 0 기본값.
		long[] data2 = new long[3]; // 0L
		float[] data3 = new float[3]; // 0.0f
		double[] data4 = new double[3]; // 0.0
		char[] data5 = new char[3]; // \u0000(공백)
		boolean[] data6 = new boolean[3]; // false
		String[] data7 = new String[3]; // null
		// 배열 자료형에 따라 기본값의 데이터 값과 자료형이 다르다.

		for (int i = 0; i < data7.length; i++) {
			System.out.println(data7[i]);
		}

	}

}
