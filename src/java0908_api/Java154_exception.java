package java0908_api;

public class Java154_exception {

	public static void main(String[] args) {
		String data1 = "12";
		String data2 = "0";

		try {
			int x = Integer.parseInt(data1);
			int y = Integer.parseInt(data2);
			int res = x / y;
			System.out.println(res);
		} catch (NumberFormatException ex) {
			System.out.println("숫자를 입력하세요.");
		} catch (ArithmeticException e) {
			System.out.println("분모는 0보다 큰 수를 입력하세요.");
		} catch (RuntimeException e) {
			System.out.println(e.toString());
		} catch (Exception e) {
			System.out.println(e.toString());
		}

		System.out.println("program end");

	}

}

/*	상속 관계
 * 
 * catch 처리할때 가장 작은것 부터 큰 순으로 해야한다. ex) NumberFormatException -> .. -> Exception
 * 
 * 						Exception
 * 			
 *			 			RuntimeException
 * 
 * NumberFormatException			ArithmeticException
 * 
 * 
 * */
 