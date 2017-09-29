package java0929_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class EmpDAO {
	Connection conn = null;
	Statement stmt = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	private static EmpDAO dao = new EmpDAO();

	private EmpDAO() {

	}

	public static EmpDAO getInstance() {
		return dao;
	}

	private Connection init() throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.OracleDriver");

		String url = "jdbc:oracle:thin://@127.0.0.1:1521:xe";
		String username = "hr";
		String password = "a1234";
		conn = DriverManager.getConnection(url, username, password);

		return conn;
	}

	private void exit() throws SQLException {
		if (rs != null)
			rs.close();

		if (stmt != null)
			stmt.close();

		if (pstmt != null)
			pstmt.close();

		if (conn != null)
			conn.close();
	}

	public List<EmpDTO> rangeMethod(HashMap<String, Integer> map) {
		List<EmpDTO> aList = new ArrayList<EmpDTO>();

		try {
			conn = init();

			// String sql = "SELECT a.* FROM (SELECT rownum rm, e.* FROM EMPLOYEES e ORDER
			// BY EMPLOYEE_ID) a WHERE rm > "
			// + map.get("start") + " AND rm <= " + map.get("end");

			String sql = "SELECT a.* FROM (SELECT rownum rm, e.* FROM EMPLOYEES e ORDER BY EMPLOYEE_ID) a WHERE rm > ? AND rm <= ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, map.get("start"));
			pstmt.setInt(2, map.get("end"));
			rs = pstmt.executeQuery();

			// stmt = conn.createStatement();
			// rs = stmt.executeQuery(sql);

			while (rs.next()) {
				EmpDTO dto = new EmpDTO();
				dto.setEmployee_id(rs.getInt("employee_id"));
				dto.setFirst_name(rs.getString("first_name"));
				dto.setSalary(rs.getInt("salary"));
				dto.setHire_date(rs.getDate("hire_date"));

				aList.add(dto);
			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				exit();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return aList;

	}

	public List<EmpDTO> searchMethod(String str) {
		List<EmpDTO> aList = new ArrayList<EmpDTO>();
		try {
			conn = init();
			String sql = "SELECT * FROM EMPLOYEES WHERE lower(first_name) LIKE lower('%' || ? || '%')";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, str);
			rs = pstmt.executeQuery();

			// String sql = "SELECT * FROM EMPLOYEES WHERE lower(first_name) LIKE lower('%"
			// + str + "%')";
			// stmt = conn.createStatement();
			// rs = stmt.executeQuery(sql);

			while (rs.next()) {
				EmpDTO dto = new EmpDTO();
				dto.setEmployee_id(rs.getInt("employee_id"));
				dto.setFirst_name(rs.getString("first_name"));
				dto.setSalary(rs.getInt("salary"));
				dto.setHire_date(rs.getDate("hire_date"));

				aList.add(dto);
			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				exit();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return aList;
	}

}
