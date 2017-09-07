package java0907_api;

import java.util.Scanner;

/*
 * 이름, 학점을 입력하는 프로그램을 구현하시오.
 * 입력 : 홍길동,80,93
 * 
 * [출력 결과]
	입력 : 홍길동,80,93
	
	이름: 홍길동
	국어: 80
	영어: 93
	평균: 86.5
 */

public class Java146_Wrapper {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");

		String info = sc.next();
		String[] infos = info.split(",");

		if (infos.length != 3) {
			System.out.println("이름,국어,영어로 입력하세요.");
			return;
		}

		String name = infos[0];
		int kor = Integer.parseInt(infos[1]);
		int eng = Integer.parseInt(infos[2]);

		double avg = (double) (kor + eng) / 2;

		System.out.println();
		System.out.println("이름: " + name);
		System.out.println("국어: " + kor);
		System.out.println("영어: " + eng);
		System.out.println("평균: " + avg);

	}

}
