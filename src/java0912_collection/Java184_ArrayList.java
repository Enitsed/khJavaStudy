package java0912_collection;

import java.util.ArrayList;

public class Java184_ArrayList {

	public static void main(String[] args) {
		ArrayList<String> aList = new ArrayList<String>();
		aList.add(new String("oracle"));
		aList.add(new String("mysql"));
		aList.add(new String("mssql"));
		String[] arr = display(aList);
		for (String data : arr) {
			System.out.println(data);
		}

	}

	public static String[] display(ArrayList<String> aList) {
		// ArrayList -> String[]
		/*
		 * String[] stn = new String[aList.size()]; for (int i = 0; i < stn.length; i++)
		 * { stn[i] = aList.get(i); } return stn;
		 */

		/*
		 * Object[] obj = aList.toArray(); String[] sg = new String[obj.length]; for
		 * (int i = 0; i < sg.length; i++) { sg[i] = (String) obj[i]; } return sg;
		 */

		/*
		 * String[] arr = new String[aList.size()]; String[] line = aList.toArray(arr);
		 * // Object의 값들을 String 배열로 넣는다 return line;
		 */

		return aList.toArray(new String[aList.size()]);

	}

}
