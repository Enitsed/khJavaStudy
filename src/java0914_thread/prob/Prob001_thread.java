package java0914_thread.prob;

/*
[출력화면]
생산자 : 음료수 No. 1 자판기에 넣기
소비자 : 음료수 No. 1 꺼내먹음
 
생산자 : 음료수 No. 2 자판기에 넣기
소비자 : 음료수 No. 2 꺼내먹음

생산자 : 음료수 No. 3 자판기에 넣기
소비자 : 음료수 No. 3 꺼내먹음
        :
        
생산자 : 음료수 No. 10 자판기에 넣기
소비자 : 음료수 No. 10 꺼내먹음 
 */
class VendingMachine {
	private String drink = "";
	private int cnt = 0;
	private int i = 1 + cnt;

	public String getDrink() {
		return drink + "No. " + i + " 꺼내먹음";
	}

	public void putDrink(String drink) {
		this.drink = drink;
		System.out.println(drink + "No. " + i + "자판기에 넣기");
		cnt++;
	}
}

class Producer extends Thread {

	Producer(VendingMachine vm) {
		vm.putDrink("음료수");
	}

	@Override
	public void run() {

		System.out.println(new VendingMachine().getDrink());
	}

}

class Consumer extends Thread {

	Consumer(VendingMachine vm) {
		vm.getDrink();
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			new VendingMachine().putDrink("음료수");
		}
	}

}

public class Prob001_thread {

	public static void main(String[] args) {

		VendingMachine vm = new VendingMachine();

		Producer p = new Producer(vm);
		Consumer c = new Consumer(vm);

		Thread t1 = new Thread(p, "생산자");
		Thread t2 = new Thread(c, "소비자");

		t1.start();
		t2.start();
	}// end main()

}// end class
