package java0904_binding;

class BindTest extends Object {
	String stn;

	public BindTest() {

	}

	public BindTest(String stn) {
		this.stn = stn;
	}

	@Override
	public String toString() {
		return stn;
	}

}

public class Java110_binding {

	public static void main(String[] args) {
		BindTest bt = new BindTest("test");
		// 정적 바인딩 (객체 생성되는 범위와 객체가 참조하는 범위가 같을 때 컴파일 단계에서 처리함)
		System.out.println(bt.toString());
		process(bt);
		// Object obj = bt; 업캐스팅
		// System.out.println(obj.toString()); 동적바인딩

		process(new String("java"));

	}

	// is~a(상속) -> (up-casting)업캐스팅 -> (dynamic binding)동적바인딩 // 업캐스팅
	public static void process(Object obj) {
		System.out.println(obj.toString()); // 동적바인딩
	}

}
