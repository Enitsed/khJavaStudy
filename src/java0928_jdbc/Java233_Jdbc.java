package java0928_jdbc;

import java.util.List;

/*
 * MVC패턴
 * Model : 데이터에 관련된 작업 (DepartmentDTO, DepartmentDAO)
 * View : 클라이언트에 보여줄 결과 화면 (Java233_Jdbc)
 * Controller : 요청, 응답처리 (Java233_Jdbc)
 */

public class Java233_Jdbc {

	public static void main(String[] args) {
		DepartmentDAO dao = new DepartmentDAO();
		List<DepartmentDTO> aList = dao.listMethod();

		for (int i = 0; i < aList.size(); i++) {
			DepartmentDTO dto = aList.get(i);
			System.out.printf("%d %s %d %d \n", dto.getDepartment_id(), dto.getDepartment_name(), dto.getManager_id(),
					dto.getLocation_id());

		}

	}

}
