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
	byte var_byte;
}

public class Java069_variable {

	public static void main(String[] args) {
		byte loc_byte;
		// System.out.printf("loc_byte:%d\n", loc_byte); // 에러 발생

		MemberVar m = new MemberVar();
		System.out.printf("Var_byte:%d\n", m.var_byte);
	}

}
