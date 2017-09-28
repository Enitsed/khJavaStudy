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
		// DepartmentDAO dao = new DepartmentDAO();
		DepartmentDAO dao = DepartmentDAO.getInstance();
		// 싱글톤 사용 이유 : 여러가지 메소드를 사용할 때 매 사용시마다 객체생성을 할 필요 없이 한번 객체를 생성해놓고 사용하기위해서

		// List<DepartmentDTO> aList = dao.listMethod();

		List<DepartmentDTO> aList = dao.searchMethod("man");

		for (int i = 0; i < aList.size(); i++) {
			DepartmentDTO dto = aList.get(i);
			System.out.printf("%d %s %d %d \n", dto.getDepartment_id(), dto.getDepartment_name(), dto.getManager_id(),
					dto.getLocation_id());
		}

	}

}
