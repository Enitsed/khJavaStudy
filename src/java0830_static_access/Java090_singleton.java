package java0830_static_access;

/*
  싱글통 패턴(singleton pattern)
 
	1. 객체를 생성할 마다 같은 형태의 객체를 생성할때 사용한다.
	2. 하나의 객체만을 생성해서 참조하는 방법이다.
	3. 방법
	-클래스가 정의된 클래스에서 자신의 객체를 생성한다.
	static MemberDao dao = new MemberDao();
	
	-static선언된 메소드에서 생성된 객체를 리턴한다.
	static MemberDao getInstance() {
		return dao;
	}
	
	-생성자의 접근제어자는 private으로 선언한다.
	private MemberDao() {
	}
	
	4. 장점: 객체의 단일 생성을 통한 자원의 절약
	   단점: 해제되는 시점을 알기 어려움   
*/

class MemberDao {
	static MemberDao dao = new MemberDao();

	private MemberDao() {
	}

	static MemberDao getInstance() {
		return dao;
	}

	public void display() {
		System.out.println("display");
	}

}

public class Java090_singleton {

	public static void main(String[] args) {

		/*
		 * MemberDao d1 = new MemberDao(); MemberDao d2 = new MemberDao(); // 싱글톤이 아닐 때
		 * : 생성자에 접근제한이 없을 때. System.out.println(d1 == d2);
		 */ // false (주소값이 다르다.)

		MemberDao m1 = MemberDao.getInstance();
		MemberDao m2 = MemberDao.getInstance();
		System.out.println(m1 == m2); // true (같은 개체 참조.)

	}

}
