package java0914_thread;

/*
 * 동기화(synchronized)
 * 
 * 계좌번호 => 공유자원
 * A지점, B지점, C지점 => 스레드
 * 
 * 동기화 : 하나의 스레드가 공유자원을 사용하고 있으면 다른 스레드가 접근하는
 *  것을 막아주는 기능이다.
 * 
 * 동기화 목적 : 데이터의 일관성 유지를 위해서이다.
 * 동기화 키워드 : synchronized
 * 
 * 동기화 설정방법
 * 1) 메소드에 lock을 걸고자 할때
 *    synchronized void test( ) { }
 * 2) 특정한 객체에 lock을 걸고자 할때
 *     void test(){
 *       synchronized(객체의 참조변수){ }
 *     }
 * 
 *   wait(), notify(), notifyAll()메소드 동기화가
 *   설정되어 있는 영역에서만 호출 할 수 있다.
 */

public class Java210_thread {

	public static void main(String[] args) {

	}

}
