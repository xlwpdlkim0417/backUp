package Before_Submit.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Project03_Insert {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		String url = "jdbc:mysql://localhost:3306/firm";
		String id = "root";
		String pass = ("mysql");

		Class.forName("com.mysql.cj.jdbc.Driver"); // 1번

		Connection conn = DriverManager.getConnection(url, id, pass);

		Statement stmt = conn.createStatement();
		String sql = "insert into emp values(7777, '김하나', '사원', 7839, '2024-01-23', 5000, null, 10)";
		int result = stmt.executeUpdate(sql);
		if (result == 1) {
			System.out.println("입력 성공" + result);

		} else {
			System.out.println("입력 실패" + result);
		}

	}

}
