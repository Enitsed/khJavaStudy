package java0928_jdbc;

public class JobDTO {
	private String job_Id;
	private String job_Title;
	private int min_Salary;
	private int max_Salary;

	public JobDTO() {

	}

	public String getJob_Id() {
		return job_Id;
	}

	public void setJob_Id(String job_Id) {
		this.job_Id = job_Id;
	}

	public String getJob_Title() {
		return job_Title;
	}

	public void setJob_Title(String job_Title) {
		this.job_Title = job_Title;
	}

	public int getMin_Salary() {
		return min_Salary;
	}

	public void setMin_Salary(int min_Salary) {
		this.min_Salary = min_Salary;
	}

	public int getMax_Salary() {
		return max_Salary;
	}

	public void setMax_Salary(int max_Salary) {
		this.max_Salary = max_Salary;
	}

}
