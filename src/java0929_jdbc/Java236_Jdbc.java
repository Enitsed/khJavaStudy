package java0929_jdbc;

import java.util.HashMap;
import java.util.List;

public class Java236_Jdbc {

	public static void main(String[] args) {
		EmpDAO dao = EmpDAO.getInstance();

		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("start", 30);
		map.put("end", 35);

		List<EmpDTO> aList = dao.rangeMethod(map);
		for (EmpDTO dto : aList) {
			System.out.printf("%d %s %d %s \n", dto.getEmployee_id(), dto.getFirst_name(), dto.getSalary(),
					dto.getHire_date());
		}

	}

}
