package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Class4 { // Class3에 대한 보완점

	void method() throws SQLException {
		String url = "jdbc:mysql://localhost:3306/firm";
		String id = "root";
		String pass = "mysql";
		String sql = "select * from emp";
		Connection conn = DriverManager.getConnection(url, id, pass); // 각각의 문을 연다고 생각해
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);

		try (conn; stmt; rs) { // 저 변수를 try-catch구문 밖에서도 쓰고 싶으면 이렇게 써야함
			// 대신에 throws 해줘야함
			// 그리고 아해 cl3 메소드에 대해서 try-catch 해야함

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
		}

	}

	public static void main(String[] args) {

		Class4 cl3 = new Class4();

		try {
			cl3.method();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

//		method();	이렇게 쓰고 싶으면 method 앞에 static 붙이던가

	}

}
