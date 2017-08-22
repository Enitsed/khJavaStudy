package java0822_statement;

/*
 * switch(식) { // '식'의 반환 데이타 형은 byte, short, char, int, enum(jdk7버전), String(jdk7버전). '조건식'은 boolean(true or false)만.
 * 	case 값1 : 문장1; break;
 *  case 값2 : 문장2; break;
 *  case 값3 : 문장3; break;
 *  default : 문장4;
 * }
 * Switch ~ case 에서 break을 만나면 현재 수행중인 조건문을 완전히 빠져나와 다음 문장을 수행한다.
 */

public class Java025_switch {

	public static void main(String[] args) {
		int jumsu = 95;
		char res = 'f';

		switch (jumsu / 10) {
		case 10:
			res = 'A';
			break;
		case 9:
			res = 'A';
			break;
		case 8:
			res = 'B';
			break;
		case 7:
			res = 'C';
			break;
		case 6:
			res = 'D';
			break;
		default:
			res = 'F';
		}

		// jumsu >= 90 'A', jumsu >= 80 'B', jumsu >= 70 'C'
		// jumsu >= 60 'D', jumsu >= 50 'F'

		System.out.printf("%d점수는 %c학점입니다. \n", jumsu, res);
	}

}
