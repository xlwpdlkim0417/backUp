package Before_Submit.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Emp5 {

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
		return "empno=" + empno + "\t" + "ename=" + ename + "\t" + "job=" + job + "\t" + "mgr=" + mgr + "   \t"
				+ "hiredate=" + hiredate + "\t" + "sal=" + sal + "\t" + "comm=" + comm + "\t" + "deptno=" + deptno;
	}

	public Emp5(int empno, String ename, String job, int mgr, String hiredate, double sal, double comm, int deptno) {
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

	public Emp5() {
		// TODO Auto-generated constructor stub
	}

	void method5() throws SQLException {
		String url = "jdbc:mysql://localhost:3306/firm";
		String id = "root";
		String pass = "mysql";

		System.out.println("업데이트 내용을 입력하시오");
		System.out.println("업데이트 희망 사원 번호");
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

		String sql = "update emp set dname = '" + ename + "', job = '" + job + "', mgr = " + mgr + ", hiredate = '"
				+ hiredate + "', sal = " + sal + ", comm = " + comm + ", deptno = " + deptno + " where empno = " + empno
				+ "";

		System.out.println(sql);
		Connection conn = DriverManager.getConnection(url, id, pass);
		Statement stmt = conn.createStatement();
		int result = stmt.executeUpdate(sql);

		if (result >= 1) {
			System.out.println("업데이트 성공");

		} else {
			System.out.println("업데이트 실패");
		}

	}

	void method4() throws SQLException {
		String url = "jdbc:mysql://localhost:3306/firm";
		String id = "root";
		String pass = "mysql";

		System.out.println("삭제 사원번호를 입력하시오");
		System.out.print("입력 : ");
		int empno = scan.nextInt();
		String sql = "delete from emp where empno = " + empno;

		Connection conn = DriverManager.getConnection(url, id, pass);
		Statement stmt = conn.createStatement();
		int result = stmt.executeUpdate(sql);

		if (result >= 1) {
			System.out.println("삭제 성공");

		} else {
			System.out.println("삭제 실패");
		}
	}

	void method3() throws SQLException {

		String url = "jdbc:mysql://localhost:3306/firm";
		String id = "root";
		String pass = "mysql";

		System.out.println("기록 내용을 입력하시오");
		System.out.println("사원 번호");
		int empno = Integer.parseInt(scan.nextLine());
		System.out.println("이름");
		String ename = scan.nextLine();
		System.out.println("직업");
		String job = scan.nextLine();
		System.out.println("매니저 등급");
		int mgr = Integer.parseInt(scan.nextLine());
		System.out.println("입사 날짜 (yyyy-mm-dd)");
		String hiredate = scan.nextLine();
		System.out.println("급여");
		double sal = Double.parseDouble(scan.nextLine());
		System.out.println("인센티브");
		double comm = Double.parseDouble(scan.nextLine());
		System.out.println("부서 번호");
		int deptno = Integer.parseInt(scan.nextLine());

		String sql = "insert into emp values(" + empno + ",'" + ename + "', '" + job + "', " + mgr + ", '" + hiredate
				+ "', " + sal + ", " + comm + ", " + deptno + ")";
		System.out.println(sql);
		Connection conn = DriverManager.getConnection(url, id, pass);
		Statement stmt = conn.createStatement();
		int result = stmt.executeUpdate(sql);

		if (result == 1) {
			System.out.println("기록 성공" + result);

		} else {
			System.out.println("기록 실패" + result);
		}
	}

	void method2(String ename) {

		String url = "jdbc:mysql://localhost:3306/firm";
		String id = "root";
		String pass = "mysql";

		System.out.println("검색할 이름을 입력하세요.");
		System.out.print("입력 : ");
		ename = scan.nextLine();

		String sql = "select * from emp where ename = '" + ename + "'";

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

		List<Emp5> list = new ArrayList<>();

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

				Emp5 emp = new Emp5(empno, ename, job, mgr, hiredate, sal, comm, deptno);
				list.add(emp);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		for (Emp5 em : list) {
			System.out.println(em);

		}
	}
}

public class Project05_Main_Update {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Emp5 em1 = new Emp5();

		boolean run = true;
		while (run) {

			System.out.println("──────────────────────────────────────────────────────");
			System.out.println("1.전체 명단 2.이름으로 검색 3.명단 입력 4.명단 삭제 5.명단 업데이트 6.종료");
			System.out.println("──────────────────────────────────────────────────────");
			System.out.print("입력> ");

			int menuNum = Integer.parseInt(sc.nextLine());
			switch (menuNum) {
			case 1:
				// select
				em1.method1();
				break;
			case 2:
				// search
				em1.method2("");
				break;
			case 3:
				// insert
				try {
					em1.method3();
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 4:
				// delete
				try {
					em1.method4();
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 5:
				// update
				try {
					em1.method5();
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 6:
				// exit
				run = false;
				break;
			}
		}

	}

}
