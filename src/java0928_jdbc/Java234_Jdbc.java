package java0928_jdbc;

import java.util.ArrayList;

public class Java234_Jdbc {

	public static void main(String[] args) {
		JobDAO jDAO = new JobDAO();
		ArrayList<JobDTO> aList = jDAO.listJobs();
		for (int i = 0; i < aList.size(); i++) {
			JobDTO jDTO = aList.get(i);
			System.out.printf("%s %s %d %d \n", jDTO.getJob_Id(), jDTO.getJob_Title(), jDTO.getMin_Salary(),
					jDTO.getMax_Salary());
		}

	}

}
