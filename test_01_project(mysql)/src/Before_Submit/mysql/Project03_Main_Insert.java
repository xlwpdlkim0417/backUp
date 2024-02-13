package Before_Submit.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Emp3 {

	Scanner scan = new Scanner(System.in);

	int empno;
	String ename;
	String job;
	int mgr;
	String hiredate;
	double sal;
	double comm;
	int deptno;

	@Override
	public String toString() {
		return "Emp3 [empno=" + empno + ", ename=" + ename + ", job=" + job + ", mgr=" + mgr + ", hiredate=" + hiredate
				+ ", sal=" + sal + ", comm=" + comm + ", deptno=" + deptno + "]";
	}

	public Emp3(int empno, String ename, String job, int mgr, String hiredate, double sal, double comm, int deptno) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.job = job;
		this.mgr = mgr;
		this.hiredate = hiredate;
		this.sal = sal;
		this.comm = comm;
		this.deptno = deptno;
	}

	public Emp3() {
		// TODO Auto-generated constructor stub
	}

	void method3() throws SQLException {

		String url = "jdbc:mysql://localhost:3306/firm";
		String id = "root";
		String pass = "mysql";

		System.out.println("수정 사항을 입력하시오");
		System.out.println("사원 번호");
		int empno = Integer.parseInt(scan.nextLine());
		System.out.println("이름");
		String ename = scan.nextLine();
		System.out.println("직업");
		String job = scan.nextLine();
		System.out.println("매니저 등급");
		int mgr = Integer.parseInt(scan.nextLine());
		System.out.println("입사 날짜");
		String hiredate = scan.nextLine();
		System.out.println("급여");
		double sal = Double.parseDouble(scan.nextLine());
		System.out.println("인센티브");
		double comm = Double.parseDouble(scan.nextLine());
		System.out.println("부서 번호");
		int deptno = Integer.parseInt(scan.nextLine());

		String sql = "insert into emp values("+empno+",'"+ename+"', '"+job+"', 7839, '2024-01-23', 5000, null, 10)";

		Connection conn = DriverManager.getConnection(url, id, pass);
		Statement stmt = conn.createStatement();
		int result = stmt.executeUpdate(sql);

		if (result == 1) {
			System.out.println("입력 성공" + result);

		} else {
			System.out.println("입력 실패" + result);
		}
	}

	void method2(String ename) {
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

	void method1() {
		String url = "jdbc:mysql://localhost:3306/firm";
		String id = "root";
		String pass = "mysql";

		String sql = "select * from emp";

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		List<Emp3> list = new ArrayList<>();

		try {
			conn = DriverManager.getConnection(url, id, pass);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				int empno = rs.getInt("empno");
				String ename = rs.getString("ename");
				String job = rs.getString("job");
				int mgr = rs.getInt("mgr");
				String hiredate = rs.getString("hiredate");
				double sal = rs.getDouble("sal");
				double comm = rs.getDouble("comm");
				int deptno = rs.getInt("deptno");

				Emp3 emp = new Emp3(empno, ename, job, mgr, hiredate, sal, comm, deptno);
				list.add(emp);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		for (Emp3 em : list) {
			System.out.println(em);

		}
	}
}

public class Project03_Main_Insert {

	public static void main(String[] args) {

		Emp3 em1 = new Emp3();

//		em1.method1();
//		em1.method2("김하나");
		try {
			em1.method3();
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

}
