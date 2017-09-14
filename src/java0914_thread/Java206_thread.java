package java0914_thread;

/*
 * 프로세스 : 메모리에서 실행중인 프로그램이다.
 * 스레드(thread) : 프로세스에서 독립적으로 실행되는 단위이다.
 * 게임프로그램 -음악,채팅,게임
 * 
 * 자바에서 스레드 생성을 위해 제공해주는 2가지 방법
 * 1. java.lang.Thread클래스
 * 2. java.lang.Runnable인터페이스
 * 
 * 스케줄링
 *  : 스레드가 생성되어 실행될 때 필요한 시스템의 여러 자원을 해당 스레드에게 할당하는 작업
 *  
 * 선점형 스케줄링
 *  : 하나의 스레드가 cpu을 할당받아 실행하고 있을 때 우선순위가 높은 다른 스레드가 cpu를 강제로 빼앗아 사용할 수 있는 스케줄링 기법이다.
 */

class User extends Thread {
	public User() {

	}

	@Override
	public void run() {
		// thread로 실행시켜줄 문장들은 run() 메소드에서 구현한다.
		for (int i = 0; i <= 5; i++) {
			System.out.printf("%s i=%d\n", getName(), i);
		}
	}

}

public class Java206_thread {
	// 실행-> main 스레드 -> main()
	public static void main(String[] args) {
		User u = new User();
		u.start(); // 스레드를 실행하려면 start() 메소드를 먼저 실행시켜야함 run()는 스레드가 실행되면 자동으로 실행된다.

		for (int j = 0; j <= 5; j++) {
			System.out.printf("%s j=%d\n", Thread.currentThread().getName(), j);
		}

		System.out.println("main thread end");

	}

}
