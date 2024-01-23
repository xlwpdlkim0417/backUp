package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class JdbcExSelect {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		String url = "jdbc:mysql://localhost:3306/firm";
		String id = "root";
		String pass = ("mysql");
		
		ArrayList arr =new ArrayList();
		

		Class.forName("com.mysql.cj.jdbc.Driver"); // 1번

		Connection conn = DriverManager.getConnection(url, id, pass);

		Statement stmt = conn.createStatement();
		String sql = "select * from emp";
//		int result = stmt.executeUpdate(sql);

		ResultSet rs = stmt.executeQuery(sql);
		while (rs.next()) {
			System.out.print(rs.getInt("empno") + "\t");
			System.out.print(rs.getString("ename") + "\t");
			System.out.println(rs.getDouble("sal"));

		}

	}

}
