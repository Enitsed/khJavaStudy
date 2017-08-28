package java0828_class;

/*
 * 멤버변수 : 클래스
 * 지역변수 : 메소드
 * 매개변수 : 메소드
 * 블록변수 : 블록
 * 
 * class Test{
 * 	String name; => 멤버변수
 * 	String loc;
 * 					// int x => 매개변수
 * 	void process(int x){
 * 		int num; => 지역변수
 * 
 * 				// int i => 블록변수
 * 		for(int i= 0; i< 5; i++){
 * 		}
 * 	}
 * 
 * 	void setLoc(String kk){
 * 		loc = kk;
 * 	}
 * }
 */

class MemberVar {
	// 멤버변수는 초기값을 할당 하지 않을 때 기본값을 제공한다.(JVM에서)
	byte var_byte; // 0
	short var_short; // 0
	int var_int; // 0
	long var_long; // 0L
	float var_float; // 0.0f
	double var_double; // 0.0
	boolean var_boolean; // false
	char var_char; // \u0000 (공백)
	int[] num; // null
}

public class Java069_variable {

	public static void main(String[] args) {
		// 지역변수는 기본값을 제공하지 않는다.
		byte loc_byte;
		// System.out.printf("loc_byte:%d\n", loc_byte); // 에러 발생 (지역변수에 초기값을 지정하지 않으면
		// 오류가 발생함)

		MemberVar m = new MemberVar();
		System.out.printf("var_byte:%d\n", m.var_byte); // 0
		System.out.printf("var_short:%d\n", m.var_short); // 0
		System.out.printf("var_int:%d\n", m.var_int); // 0
		System.out.printf("var_long:%d\n", m.var_long); // 0
		System.out.printf("var_float:%.1f\n", m.var_float); // 0.0
		System.out.printf("var_double:%.1f\n", m.var_double); // 0.0
		System.out.printf("var_boolean:%b\n", m.var_boolean); // false
		System.out.printf("var_char:%c\n", m.var_char); // \u0000 (공백)
		System.out.printf("num:%s\n", m.num); // null

	}

}
