package java0912_collection;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;

/* [프로그램 출력결과]
		 kim   56  78   12  146
		 hong   46  100  97  243
		 park   96  56   88  240
*/
class Sawon {
	String name;
	int one;
	int two;
	int three;

	public Sawon() {

	}

	public Sawon(String name, int one, int two, int three) {
		super();
		this.name = name;
		this.one = one;
		this.two = two;
		this.three = three;
	}

	private int count() {
		return one + two + three;
	}

	@Override
	public String toString() {
		return name + " " + one + " " + two + " " + three + " " + count();
	}

}// end Sawon

public class Java181_Vector {

	public static void main(String[] args) {

		String sn = "./src/java0912_collection/score.txt";
		Vector<Sawon> vt = lines(sn);
		prnDisplay(vt);

	}

	private static Vector<Sawon> lines(String strName) {
		// strName 매개변수의 값을 이용해서 Vector에 데이터를 저장한후
		// 리턴하는 프로그램을 구현하시오.

		
		// 스캐너와 생성자를 이용
		/*		
		Scanner sc = null;
		File file = new File(strName);
		Vector<Sawon> v = new Vector<Sawon>();

		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				String[] line = sc.nextLine().split("[/:]");
				Sawon sn = new Sawon(line[0], Integer.parseInt(line[1]), Integer.parseInt(line[2]),
						Integer.parseInt(line[3]));
				v.add(sn);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		return v;
		*/

		File file = new File(strName);
		FileReader fr = null;
		BufferedReader br = null;
		Sawon sawon = null;
		String data = null;
		String[] arr = null;
		Vector<Sawon> vt2 = new Vector<Sawon>();
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			while ((data = br.readLine()) != null) {
				arr = data.split(":");

				sawon = new Sawon();

				sawon.name = arr[0];

				arr = arr[1].split("/");

				sawon.one = Integer.parseInt(arr[0]);
				sawon.two = Integer.parseInt(arr[1]);
				sawon.three = Integer.parseInt(arr[2]);
				vt2.add(sawon);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		return vt2;

	}

	private static void prnDisplay(Vector<Sawon> vt) {
		// vt에 저장된 객체들을 출력결과와 같이 프로그램을 구현하시오.
		for (Sawon vt1 : vt)
			System.out.println(vt1.toString());
	}

}
