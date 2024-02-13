package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Class3 {

	void method() {
		String url = "jdbc:mysql://localhost:3306/firm";
		String id = "root";
		String pass = "mysql";
		String sql = "select * from emp";
//		Connection conn = null;
//		Statement stmt = null;
//		ResultSet rs = null;

		try (Connection conn = DriverManager.getConnection(url, id, pass); // 각각의 문을 연다고 생각해
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql); // 문 닫아줘야되는 애들 ▷ 선언부 변경해주기
		// catch 뒤에 finally 왔어야되는데 이 형태로 바꾸면서 지웠음
		// finally에서 문 닫아줬어야하는데 안닫아줘도 괜찮은가?
		// 이 괄호 안에 쓴 것들은 알아서 자원반납해주겠다는 의미로 받아들이면됨
		// 변수 선언 해준게 close 해줘야 되는 애들 써준거임
		// 단점이 있음 지역 변수 불편...

		) {

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

		Class3 cl3 = new Class3();

		cl3.method();

//		method();	이렇게 쓰고 싶으면 method 앞에 static 붙이던가

	}

}
