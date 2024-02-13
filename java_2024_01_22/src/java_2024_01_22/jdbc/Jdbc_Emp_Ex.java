package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc_Emp_Ex {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		String url = "jdbc:mysql://localhost:3306/company";
		String id = "root";
		String pass = "mysql";

		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("mysql 드라이버 로딩");

		Connection conn = DriverManager.getConnection(url, id, pass);
		System.out.println("mysql 접속 성공");

		Statement stmt = conn.createStatement(); //
		ResultSet rs = stmt.executeQuery("select ename, sal from emp"); // createStatement(); executeQuery(); 이거 할라고 위에
																		// 접속한겁니다 원래는 select * from dept

		while (rs.next()) { // 자바 에센셜 40페이지 언저리 봐봐 39였나 37이었나
			// rs.next() 이게 자료 넣고 true 넣고 true 이런식으로 넘어가다가 마지막에 false 값으로 반복문 탈출
//				int deptno = rs.getInt("deptno");
//				String dname = rs.getString("dname");
//				String loc = rs.getString("loc");
			String ename = rs.getString("ename");
			double sal = rs.getDouble("sal");
			System.out.printf("%s, %f\n", ename, sal);

		}

	}

}
