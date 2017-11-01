package java1031_plsql;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import oracle.jdbc.driver.OracleTypes;

/*
create or replace procedure my_select
(v_empid in number,
v_name out varchar2 ,
v_salary out number)
is
begin 
select first_name,salary
into v_name,v_salary
from employees
where employee_id=v_empid;
end;
/
*/
public class Java243_plsql {
	private Connection conn;
	private CallableStatement cstmt;
	private ResultSet rs;

	public Java243_plsql() {
		process();
	}

	private void process() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			String url = "jdbc:oracle:thin://@127.0.0.1:1521:xe";
			String user = "hr";
			String password = "a1234";
			conn = DriverManager.getConnection(url, user, password);

			String sql = "{call my_select(?, ?, ?)}";
			cstmt = conn.prepareCall(sql);
			// 입력값
			cstmt.setInt(1, 100);

			// 반환 값
			cstmt.registerOutParameter(2, Types.VARCHAR);
			cstmt.registerOutParameter(3, Types.INTEGER);
			cstmt.execute();
			System.out.printf("%s %d \n", cstmt.getString(2), cstmt.getInt(3));

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

	}

}
