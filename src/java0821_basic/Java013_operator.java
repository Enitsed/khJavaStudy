package java0821_basic;

/*
 * 조건연산자(삼항연산자) : 식의 결과에 따라서 리턴해주는 값이 여러개 일 때 사용한다.
 * 식 ? 참 : 거짓
 * int res = true ? 1 : 0;
 * char res = false ? 'a' : 'A';
 * 
 * 식1 ? 참1 : 식2 ? 참2 : 거짓2
 */
public class Java013_operator {

	public static void main(String[] args) {
		int total = 22;
		int record = 5;

		int page = (total % record) == 0 ? total / record : (total / record) + 1;
		System.out.println(page);

	}

}
