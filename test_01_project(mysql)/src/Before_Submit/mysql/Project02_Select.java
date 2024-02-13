package Before_Submit.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Project02_Select {

	void method(String ename) { // 1번
		String url = "jdbc:mysql://localhost:3306/firm";
		String id = "root";
		String pass = "mysql";
		String sql = "select * from emp where ename = '" + ename + "'"; // 2번
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {

			conn = DriverManager.getConnection(url, id, pass); // 각각의 문을 연다고 생각해
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				System.out.print(rs.getInt("empno") + "\t");
				System.out.print(rs.getString("ename") + "\t");
				System.out.print(rs.getString("job") + "\t");
				System.out.print(rs.getInt("mgr") + "\t");
				System.out.print(rs.getString("hiredate") + "\t");
				System.out.print(rs.getDouble("sal") + "\t");
				System.out.print(rs.getDouble("comm") + "\t");
				System.out.println(rs.getInt("deptno"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally { // 닫을 때는 가장 최심부에 열었던 문부터 닫아야해
			if (rs != null)
				try {
					rs.close();
				} catch (Exception e) {
				}
			if (stmt != null)
				try {
					stmt.close();
				} catch (Exception e) {
				}
			if (conn != null)
				try {
					conn.close();
				} catch (Exception e) {
				}

		}

	}

	public static void main(String[] args) {

		Project02_Select cl2 = new Project02_Select();

		cl2.method("JONES"); // 3번

//		method();	이렇게 쓰고 싶으면 method 앞에 static 붙이던가

	}

}
