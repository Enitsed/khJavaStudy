package java1031_plsql;

/*
	SQL> begin
	proc06_othermode('정소라', '대전');
	end;
	/
 */
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Java241_plsql {

	private Connection conn;
	private CallableStatement cstmt;

	public Java241_plsql() {
		process();
	}

	private void process() {

		try {
			Class.forName("oracle.jdbc.OracleDriver");
			String url = "jdbc:oracle:thin://@127.0.0.1:1521:xe";
			String user = "hr";
			String password = "a1234";
			conn = DriverManager.getConnection(url, user, password);
			// String sql = "{call proc06_othermode(?, ?)}";
			// cstmt = conn.prepareCall(sql);
			// cstmt.setString(1, "정소라");
			// cstmt.setString(2, "대전");
			String sql = "{call proc06_othermode(?, ?)}";
			cstmt = conn.prepareCall(sql);
			cstmt.setString(1, "차두리");
			cstmt.setString(2, "포항");

			cstmt.execute();
			System.out.println("program end");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				cstmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		new Java241_plsql();
	}

}
