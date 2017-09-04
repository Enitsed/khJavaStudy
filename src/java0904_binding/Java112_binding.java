package java0904_binding;

public class Java112_binding {

	public static void main(String[] args) {
		LgTv2 lg = new LgTv2("LG");
		process(lg);
		SamsungTv2 ss = new SamsungTv2("SAMSUNG");
		process(ss);
	}

	// 결합도(의존도)가 낮아졌다
	public static void process(HomeTv tv) { // 업캐스팅
		tv.turnOn();
		if (tv instanceof LgTv2)
			((LgTv2) tv).call(); // 다운캐스팅
		else if (tv instanceof SamsungTv2)
			((SamsungTv2) tv).loc();
	}
}
