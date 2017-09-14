package java0914_thread;

/*
 * 스레드 생명주기(Life Cycle)
 * start() - 실행준비상태(RUNNABLE) - run() - TERMINATED - 대기상태(WAITING, NOT RUNNALBLE)
 */

class LifeCycle extends Thread {
	public LifeCycle() {
	}

	@Override
	public void run() {
		System.out.println(getState()); // RUNNABLE

		for (int i = 0; i <= 5; i++) {
			System.out.printf("%s i=%d\n", Thread.currentThread().getName(), i);

			try {
				// 1000은 1초를 의미한다.(millisecond)
				Thread.sleep(1000); // WAITING(NOT RUNNABLE) - 일시정지상태
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

public class Java208_thread {

	public static void main(String[] args) {
		LifeCycle cc = new LifeCycle();
		// getState() : 현재 사용하는 스레드의 상태를 확인한다.
		System.out.println(cc.getState()); // NEW

		cc.start();

		try {
			// 지정된 시간동안 스레드가 실행되도록 한다.
			// 지정된 시간이 지나거나 종료가 되면 join()을 호출한 스레드로 다시 돌아와 실행을 계속 수행한다.
			cc.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(cc.getState()); // TERMINATED
		System.out.println("main end");

	}

}
