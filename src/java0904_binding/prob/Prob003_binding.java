package java0904_binding.prob;
/*
 * [데이타]
 * 이름       부서     구분        급여          수당         근무일         일당
 * 홍길동    영업부   정직원   450000  1000
 * 갑동이    기획부   계약직                                    20     10000
 * 
 * [출력결과]
 * 홍길동  총급여  451000
 * 갑동이  총급여  200000
 * 
 * 위의 [데이타]를 참조하여 [출력결과]가 나오도록 프로그램을 구현하세요.
 */

class Employee3 {
	String name; // 이름
	String dept; // 부서
	String job; // 구분

	public Employee3() {
		super();
	}

	public Employee3(String name, String dept, String job) {
		super();
		this.name = name;
		this.dept = dept;
		this.job = job;
	}

	public String toString() {
		return name + " 총급여";
	}

	public int getTotal() {
		return 0;
	}
}

// --------------------------------------------------------------------------------
class FullTime extends Employee3 {
	int salary; // 급여
	int bonus; // 수당

	public FullTime() {
		super();
	}

	public FullTime(String name, String dept, String job, int salary, int bonus) {
		super(name, dept, job);
		this.salary = salary;
		this.bonus = bonus;
	}

	@Override
	public int getTotal() {
		return salary + bonus;
	}

	@Override
	public String toString() {
		return super.toString() + " " + getTotal();
	}

}

// --------------------------------------------------------------------------------
class PartTime extends Employee3 {
	int workDay; // 근무일
	int payPerDay; // 일당

	public PartTime() {
		super();
	}

	public PartTime(String name, String dept, String job, int workDay, int payPerDay) {
		super(name, dept, job);
		this.workDay = workDay;
		this.payPerDay = payPerDay;
	}

	@Override
	public int getTotal() {
		return workDay * payPerDay;
	}

	@Override
	public String toString() {
		return super.toString() + " " + getTotal();
	}

}

// --------------------------------------------------------------------------------

public class Prob003_binding {

	public static void main(String[] args) {
		Employee3[] em = new Employee3[] { new FullTime("홍길동", "영업부", "정규직", 450000, 1000),
				new PartTime("갑동이", "기획부", "계약직", 20, 10000) };

		for (Employee3 a : em) {
			System.out.println(a.toString());
		}

	}// end main()

}// end class
