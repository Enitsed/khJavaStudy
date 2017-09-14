package java0914_thread;

// thread 우선순위 1(낮) < 5(중:기본값) < 10(높)

class PriorityTest extends Thread {

	@Override
	public void run() {
		for (int i = 0; i <= 5; i++) {
			System.out.printf("%s priority=%d i=%d\n", getName(), getPriority(), i);
		}
	}

}

public class Java209_thread {

	public static void main(String[] args) {

		for (int i = 0; i <= 5; i++) {
			System.out.printf("%s priority=%d i=%d\n", Thread.currentThread().getName(),
					Thread.currentThread().getPriority(), i);
		}

		PriorityTest t1 = new PriorityTest(); // 우선순위 5
		t1.setName("user");
		t1.start();

		PriorityTest t2 = new PriorityTest();
		// 스레드의 우선순위는 1~10까지 지정할 수 있다.
		// 스레드의 기본값은 5이다.
		t2.setPriority(Thread.MAX_PRIORITY); // 우선순위 10
		t2.start();

		PriorityTest t3 = new PriorityTest();
		t3.setPriority(8);
		t3.start();

	}

}
