package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Emp6 {

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
		return "사원 번호 = " + empno + "\t" + "이름 = " + ename + "\t" + "직책 = " + job + "\t" + "사수 사원 번호 = " + mgr + "   \t"
				+ "입사 날짜 = " + hiredate + "\t" + "급여 = " + sal + "\t" + "인센티브 = " + comm + "\t" + "부서 번호 =" + deptno;
	}

	public Emp6(int empno, String ename, String job, int mgr, String hiredate, double sal, double comm, int deptno) {
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

	public Emp6() {
		// TODO Auto-generated constructor stub
	}

	void method5() throws SQLException {
		String url = "jdbc:mysql://localhost:3306/firm";
		String id = "root";
		String pass = "mysql";

		System.out.println("업데이트 내용을 입력하세요.");
		System.out.print("업데이트 희망 사원 번호 : ");
		int empno = Integer.parseInt(scan.nextLine());

		System.out.print("이름 : ");
		String ename = scan.nextLine();
		System.out.print("직책 : ");
		String job = scan.nextLine();
		System.out.print("사수 사원 번호 : ");
		int mgr = Integer.parseInt(scan.nextLine());
		System.out.print("입사 날짜 (yyyymmdd) : ");
		String hiredate = scan.nextLine();
		System.out.print("급여 : ");
		double sal = Double.parseDouble(scan.nextLine());
		System.out.print("인센티브 : ");
		double comm = Double.parseDouble(scan.nextLine());
		System.out.print("부서 번호 : ");
		int deptno = Integer.parseInt(scan.nextLine());

		String sql = "update emp set 이름 = '" + ename + "', 직책 = '" + job + "', 사수 사원 번호 = " + mgr + ", 입사 날짜 = '"
				+ hiredate + "', 급여 = " + sal + ", 인센티브 = " + comm + ", 부서 번호 = " + deptno + " where 사원 번호 = "
				+ empno;

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
		// 삭제 성공이라고 뜨고 실제로 자료도 삭제가 되는데 그 다음에 이름으로 검색이나 명단 입력 명령어 작동 안함
		// 왜?
		// 전체 명단은 되는데?
		String url = "jdbc:mysql://localhost:3306/firm";
		String id = "root";
		String pass = "mysql";

		System.out.println("삭제 사원 번호를 입력하세요.");
		System.out.print("입력 : ");
		String empno = scan.nextLine();
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

		System.out.println("기록 내용을 입력하세요.");
		System.out.print("사원 번호 : ");
		int empno = Integer.parseInt(scan.nextLine());
		System.out.print("이름 : ");
		String ename = scan.nextLine();
		System.out.print("직책 : ");
		String job = scan.nextLine();
		System.out.print("사수 사원 번호 : ");
		int mgr = Integer.parseInt(scan.nextLine());
		System.out.print("입사 날짜 (yyyymmdd) : ");
		String hiredate = scan.nextLine();
		System.out.print("급여 : ");
		double sal = Double.parseDouble(scan.nextLine());
		System.out.print("인센티브 : ");
		double comm = Double.parseDouble(scan.nextLine());
		System.out.print("부서 번호 : ");
		int deptno = Integer.parseInt(scan.nextLine());

		String sql = "insert into emp values(" + empno + ",'" + ename + "', '" + job + "', " + mgr + ", '" + hiredate
				+ "', " + sal + ", " + comm + ", " + deptno + ")";

		Connection conn = DriverManager.getConnection(url, id, pass);
		Statement stmt = conn.createStatement();
		int result = stmt.executeUpdate(sql);

		if (result == 1) {
			System.out.println("기록 성공");

		} else {
			System.out.println("기록 실패");
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

		List<Emp6> list = new ArrayList<>();

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

				Emp6 emp = new Emp6(empno, ename, job, mgr, hiredate, sal, comm, deptno);
				list.add(emp);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		for (Emp6 em : list) {
			System.out.println(em);

		}
	}
}

public class Project06_Main_1st_Design {

	public static void main(String[] args) {
		
		

		Scanner sc = new Scanner(System.in);

		Emp6 em1 = new Emp6();

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
					System.out.println("기록 실패 : 양식에 맞게 작성해주세요");
					System.out.println("사원 번호 : 0000");
					System.out.println("이름 : AAAAAAAAAA");
					System.out.println("직업 : AAAAAAAAA");
					System.out.println("사수 사원 번호 : 0000");
					System.out.println("입사일 ▷ 12월 넘지 않도록, 31일 넘지 않도록 yyyymmdd");
					System.out.println("급여 : 0000000");
					System.out.println("인센티브 : 0000000");
					System.out.println("부서 번호 : 00");
					// empno ▷ 4자리 / 0으로 시작하면 0 생략
					// mgr ▷ 4자리 / 5자리 넘어가니까 예외 발생
					// hiredate ▷ 날짜 양식 안맞으면 숫자 상관없이 예외 발생
					// 여기서 날짜 양식이란 각 자리 별 들어갈 수 있는 숫자를 말함
					// 12월 넘어가지 않게 31일 넘어가지 않게 주의
					// sal & comm ▷ 확인 필요 ▷ 둘 다 5자리도 가능
					// deptno ▷ 2자리 / 부서 번호 3자리 예외 발생
					// 아래 case5에 주석 달려있음 확인 요망
				}
				break;
			case 4:
				// delete
				try {
					em1.method4();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				break;
			case 5:
				// update
				try {
					em1.method5();
				} catch (SQLException e) {
					System.out.println("업데이트 실패 : 양식에 맞게 작성해주세요");
					System.out.println("사원 번호 : 0000");
					System.out.println("이름 : AAAAAAAAAA");
					System.out.println("직업 : AAAAAAAAA");
					System.out.println("사수 사원 번호 : 0000");
					System.out.println("입사일 ▷ 12월 넘지 않도록, 31일 넘지 않도록");
					System.out.println("급여 : 0000000");
					System.out.println("인센티브 : 0000000");
					System.out.println("부서 번호 : 00");
					e.printStackTrace();
					// Data truncation: Incorrect date value: '3333-33-33' for column 'hiredate'
					/*
					 * empno decimal(4,0) NOT NULL, ename varchar(10) default NULL, job varchar(9)
					 * default NULL, mgr decimal(4,0) default NULL, hiredate date default NULL, sal
					 * decimal(7,2) default NULL, comm decimal(7,2) default NULL, deptno
					 * decimal(2,0) default NULL
					 */
				}
				break;
			case 6:
				// exit
				System.out.println("프로그램 종료");
				run = false;
				break;
			default:
				System.out.println("올바른 숫자를 입력해주세요.");
				break;
			}
		}

	}

}
