package java0911_stream.prob;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * [문제]
 *  jumsu.txt 파일로부터 학생의 점수를 읽어들여 총점과 평균을 jumsu.txt 파일 끝에 덧붙여 출력하는 프로그램을 작성하시오.
    단, 평균점수는 소수점 첫 번째 자리까지만 남기고 나머지는 잘라낸다.(truncate) 
    
    [프로그램 실행결과]
    태연:65
	수영:97
	제시카:100
	티파니:86
	써니:88
	총점:436
	평균:87.2
 */
public class Prob02_stream {
	public static void main(String[] args) {
		// 프로그램을 구현하시오.
		File fr = new File(".\\src\\java0911_stream\\prob\\jumsu.txt");

		FileReader ffr = null;
		BufferedReader bf = null;
		String student = "";
		FileWriter fw = null;
		String[] data = null;
		int score = 0;
		String name = null;
		int sum = 0;
		double avg = 0f;
		int cnt = 0;
		try {
			ffr = new FileReader(fr);
			bf = new BufferedReader(ffr);
			while ((student = bf.readLine()) != null) {

				data = student.split(":");
				for (String a : data) {
					if (a.matches("[0-9]{1,3}")) {
						score = Integer.parseInt(a);
						sum += score;
						cnt++;
					} else {
						name = a;
					}
				}
				System.out.println(name + " : " + score);

			}

			fw = new FileWriter(fr, true);
			avg = (double) sum / (double) cnt;
			
			fw.append("총점 : " + String.valueOf(sum) + "\n");
			fw.append("평균 : " + String.valueOf(avg) + "\n");

			System.out.println("총점: " + sum);
			System.out.printf("평균: %.1f", avg);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				ffr.close();
				bf.close();
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}// end main()
}// end class
