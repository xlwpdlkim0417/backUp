package test_01.before_submit.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

class Emp2 {

	int empno;
	String ename;
	String job;
	int mgr;
	String hiredate;
	double sal;
	double comm;
	int deptno;

	public Emp2(int empno, String ename, String job, int mgr, String hiredate, double sal, double comm, int deptno) {
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

	public Emp2() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Emp2 [empno=" + empno + ", ename=" + ename + ", job=" + job + ", mgr=" + mgr + ", hiredate=" + hiredate
				+ ", sal=" + sal + ", comm=" + comm + ", deptno=" + deptno + "]";
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

		List<Emp2> list = new ArrayList<>();

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

				Emp2 emp = new Emp2(empno, ename, job, mgr, hiredate, sal, comm, deptno);
				list.add(emp);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		for (Emp2 em : list) {
			System.out.println(em);

		}
	}
}

public class Project02_Main_proj1_Scanner {

	public static void main(String[] args) {

		Emp2 em1 = new Emp2();

//		em1.method1();
		em1.method2("김하나");

	}

}
