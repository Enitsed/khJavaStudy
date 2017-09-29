package java0929_jdbc;

import java.util.HashMap;
import java.util.List;

public class Java235_Jdbc {

	public static void main(String[] args) {
		MemDAO dao = MemDAO.getInstance();

		// MemDTO dto1 = new MemDTO("야옹이", 41, "부산");
		// dao.insertMethod(dto1);

		// num컬럼의 값이 1일때 name컬럼의 값을 "윤아"로 수정
		// MemDTO dto = new MemDTO();
		// dto.setNum(1);
		// dto.setName("윤아");

		// HashMap<String, Object> map = new HashMap<String, Object>();
		// map.put("name", new String("윤아"));
		// map.put("num", new Integer(1));
		// dao.updateMethod(map);

		// dao.deleteMethod(4);

		List<MemDTO> aList = dao.listMethod();
		for (MemDTO dto : aList) {
			System.out.printf("%d %s %d %s \n", dto.getNum(), dto.getName(), dto.getAge(), dto.getLoc());
		}

	}

}
