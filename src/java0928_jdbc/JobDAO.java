package java0928_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JobDAO {
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;

	public JobDAO() {

	}

	public Connection init() throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.OracleDriver");

		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "hr";
		String password = "a1234";

		Connection conn = DriverManager.getConnection(url, user, password);

		return conn;
	}

	public List<JobDTO> listJobs() {
		List<JobDTO> aList = new ArrayList<JobDTO>();

		try {
			conn = init();
			stmt = conn.createStatement();
			String sql = "SELECT * FROM JOBS";

			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				JobDTO jDTO = new JobDTO();
				jDTO.setJob_Id(rs.getString("job_id"));
				jDTO.setJob_Title(rs.getString("job_title"));
				jDTO.setMin_Salary(rs.getInt("min_salary"));
				jDTO.setMax_Salary(rs.getInt("max_salary"));

				aList.add(jDTO);
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

	public void exit() throws SQLException {
		if (rs != null)
			rs.close();
		if (stmt != null)
			stmt.close();
		if (conn != null)
			conn.close();
	}
}
