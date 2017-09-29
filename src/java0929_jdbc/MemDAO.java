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

/*
 * java.sql.PreparedStatement
 * 1. 반복되는 쿼리문의 수행에 사용한다.
 * 2. 미리 정의된 SQL문을 수행하기 때문에 Statement에 비해 속도가 빠르다.
 * 3. 위치표시자(Placeholder)(?)를 사용하여 쿼리문을 간략하게 작성한다.
 */

public class MemDAO {
	Connection conn = null;
	Statement stmt = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	private static MemDAO dao = new MemDAO();

	private MemDAO() {

	}

	public static MemDAO getInstance() {
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

	public List<MemDTO> listMethod() {
		List<MemDTO> aList = new ArrayList<MemDTO>();

		try {
			conn = init();
			stmt = conn.createStatement();
			String sql = "SELECT * FROM Mem ORDER BY num";
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				MemDTO dto = new MemDTO();
				dto.setNum(rs.getInt("NUM"));
				dto.setName(rs.getString("NAME"));
				dto.setAge(rs.getInt("AGE"));
				dto.setLoc(rs.getString("LOC"));
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

	public void insertMethod(MemDTO dto) {
		try {
			conn = init();
			/*
			 * stmt = conn.createStatement(); String sql =
			 * "INSERT INTO Mem VALUES (mem_num_seq.nextval, '" + dto.getName() + "', " +
			 * dto.getAge() + ", '" + dto.getLoc() + "')"; stmt.executeUpdate(sql);
			 */

			String sql = "INSERT INTO mem VALUES (mem_num_seq.nextval, ?, ?, ?)"; // ? 와일드카드는 순서대로 인덱스가 매겨진다. 1부터 시작
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
			pstmt.setInt(2, dto.getAge());
			pstmt.setString(3, dto.getLoc());
			pstmt.executeUpdate();

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				exit();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public void updateMethod(HashMap<String, Object> map) {
		String name = map.get("name").toString();
		Integer num = (Integer) map.get("num");

		try {
			conn = init();
			String sql = "UPDATE mem SET name = ? WHERE num = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setInt(2, num);
			pstmt.executeUpdate();

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				exit();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public void deleteMethod(int num) {

		try {
			conn = init();
			String sql = "DELETE FROM mem WHERE num = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			pstmt.executeUpdate();

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				exit();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
