package java0913_collection.prob;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

/*
 * LinkedList
 * 1 List : 순서적으로 데이터를 저장
 * 2 Stack : LIFO
 * 3 Queue : FIFO
 */

public class Prob001_LinkedList {

	public static void main(String[] args) {
		/*
		 * booklist.txt파일의 데이터를 Stack으로 처리하여 출력되도록 프로그램을 구현하시오.
		 */
		// Java Programming/JavaBest/Kim kava/25000
		// SQL Fundmental/SQLBest/Na SQL/47000
		// JDBC Programming/JDBCBest/NaDo SQL/30000
		// Servlet Programming/WeBBest/GoodName/20000
		// JSP Programming/JSPPub/JSPExpert/21000
		Scanner sc = null;
		String[] data = null;
		LinkedList<Book> bList = new LinkedList<Book>();

		try {
			sc = new Scanner(new File("src/java0913_collection/prob/booklist.txt"));
			while (sc.hasNextLine()) {
				data = sc.nextLine().split("/");
				Book b = new Book(data[0], data[1], data[2], data[3]);
				bList.push(b);

				while (!bList.isEmpty()) {
					b = bList.pop();
					System.out.printf("%s/%s/%s/%s\n", b.getTitle(), b.getPublisher(), b.getWriter(), b.getPrice());
				}
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			sc.close();
		}

	}// end main()

}// end class
