package Before_Submit.mysql;

import java.io.Console;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Project {

	int empno;
	String ename;
	String job;
	int mgr;
	String hiredate;
	double sal;
	double comm;
	int deptno;

	Scanner scan = new Scanner(System.in);

	Connection conn;
	Statement stmt;
	ResultSet rs;

	public Project() {

		String url = "jdbc:mysql://localhost:3306/firm";
		String id = "root";
		String pass = "mysql";

		try {
			conn = DriverManager.getConnection(url, id, pass);
			stmt = conn.createStatement();
		} catch (SQLException e) {
			System.out.println("Project() 생성자 catch");
			System.out.println(e.getMessage());
		}
	}

	void update() {
		System.out.println("업데이트 희망 사원 번호를 입력하세요.");
		System.out.print("업데이트 희망 사원 번호 : ");
		String empno = scan.nextLine();

		System.out.print("이름 : ");
		String ename = scan.nextLine();
		System.out.print("직책 : ");
		String job = scan.nextLine();
		System.out.print("사수 사원 번호 : ");
		String mgr = scan.nextLine();
		System.out.print("입사 날짜 (yyyymmdd) : ");
		String hiredate = scan.nextLine();
		System.out.print("급여 : ");
		String sal = scan.nextLine();
		System.out.print("인센티브 : ");
		String comm = scan.nextLine();
		System.out.print("부서 번호 : ");
		String deptno = scan.nextLine();

		String sql = String.format(
				"update emp set ename = '%s', job = '%s', mgr = %s, hiredate = '%s', sal = %s, comm = %s, deptno = %s where empno = %s",
				ename, job, mgr, hiredate, sal, comm, deptno, empno);

		if (empno.isEmpty() || ename.isEmpty() || job.isEmpty() || mgr.isEmpty() || hiredate.isEmpty() || sal.isEmpty()
				|| comm.isEmpty() || deptno.isEmpty()) {
			System.out.println("업데이트를 위해 모든 정보를 빠짐없이 입력해주세요.");
		} else {
			try {
				int result = stmt.executeUpdate(sql);
				if (result >= 1) {
					System.out.println("업데이트 성공했습니다.");
				} else {
					System.out.println("업데이트 실패했습니다.");
				}
			} catch (SQLException e) {
				System.out.println("올바른 업데이트 정보를 입력하세요.");
			}
		}
	}

	void delete() {
		System.out.println("삭제 희망 사원 번호를 입력하세요.");
		System.out.print("삭제 희망 사원 번호 : ");
		String empno = scan.nextLine();

		String sql = "delete from emp where empno = " + empno;

		int result;
		try {
			result = stmt.executeUpdate(sql);
			if (result >= 1) {
				System.out.println("삭제 성공했습니다.");
			} else {
				System.out.println("삭제 실패했습니다.");
				System.out.println("존재하지 않는 사원 번호입니다.");
			}
		} catch (SQLException e) {
			System.out.println("삭제 희망 사원 번호를 입력해주세요.");
		}
	}

	void insert() {
		System.out.println("입력 희망 내용을 입력하세요.");
		System.out.print("사원 번호 : ");
		String empno = scan.nextLine();
		System.out.print("이름 : ");
		String ename = scan.nextLine();
		System.out.print("직책 : ");
		String job = scan.nextLine();
		System.out.print("사수 사원 번호 : ");
		String mgr = scan.nextLine();
		System.out.print("입사 날짜 (yyyymmdd) : ");
		String hiredate = scan.nextLine();
		System.out.print("급여 : ");
		String sal = scan.nextLine();
		System.out.print("인센티브 : ");
		String comm = scan.nextLine();
		System.out.print("부서 번호 : ");
		String deptno = scan.nextLine();

		String sql = String.format("insert into emp values(%s, '%s', '%s', %s, '%s', %s, %s, %s)", empno, ename, job,
				mgr, hiredate, sal, comm, deptno);

		if (empno.isEmpty() || ename.isEmpty() || job.isEmpty() || mgr.isEmpty() || hiredate.isEmpty() || sal.isEmpty()
				|| comm.isEmpty() || deptno.isEmpty()) {
			System.out.println("모든 정보를 빠짐없이 입력해주세요.");
		} else {
			try {
				int result = stmt.executeUpdate(sql);
				if (result >= 1) {
					System.out.println("입력 성공했습니다.");
				} else {
					System.out.println("입력 실패했습니다.");
				}
			} catch (SQLException e) {
				System.out.println("입력 실패했습니다.");
				System.out.println("올바른 정보를 입력하세요.");
			}
		}
	}

	void search() {

		boolean found = false;

		System.out.println("검색 희망 사원 번호 입력하세요.");
		System.out.print("검색 희망 사원 번호 : ");
		String empno = scan.nextLine();

		String sql = "select * from emp where empno = " + empno;

		try {
			rs = stmt.executeQuery(sql);
			while (rs.next()) {

				found = true;

				int empnoo = rs.getInt("empno");
				String ename = rs.getString("ename");
				String job = rs.getString("job");
				int mgr = rs.getInt("mgr");
				String hiredate = rs.getString("hiredate");
				double sal = rs.getDouble("sal");
				double comm = rs.getDouble("comm");
				int deptno = rs.getInt("deptno");

				String str = String.format(
						"사원 번호:%-4d\t 이름:%-4s\t 직책:%-4s\t 사수 사원 번호:%-4d\t 입사 날짜:%-4s\t 급여:%-4.2f\t 인센티브:%-4.2f\t 부서 번호:%-4d",
						empnoo, ename, job, mgr, hiredate, sal, comm, deptno);

				System.out.println(str);
			}
			if (!found) {
				System.out.println("존재하지 않는 사원 번호입니다.");
			}
		} catch (SQLException e) {
			System.out.println("검색 희망 사원 번호를 입력하세요.");
		}
	}

	void select() {
		String sql = "select * from emp";

		try {
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

				String str = String.format(
						"사원 번호:%-4d\t 이름:%-4s\t 직책:%-4s\t 사수 사원 번호:%-4d\t 입사 날짜:%-4s\t 급여:%-4.2f\t 인센티브:%-4.2f\t 부서 번호:%-4d",
						empno, ename, job, mgr, hiredate, sal, comm, deptno);

				System.out.println(str);
			}
		} catch (SQLException e) {
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Project proj = new Project();

		new Unique_On();

		boolean run = true;

		while (run) {

			System.out.println("───────────────────────────────────────────────────────────");
			System.out.println("1.전체 내용 2.정보 입력 3.사원 번호 검색 4.정보 수정 5.정보 삭제 6.종료");
			System.out.println("───────────────────────────────────────────────────────────");
			System.out.print("입력 : ");

			String menu = sc.nextLine();
			switch (menu) {
			case "1":
				// select
				proj.select();
				break;
			case "2":
				// insert
				proj.insert();
				break;
			case "3":
				// search
				proj.search();
				break;
			case "4":
				// update
				proj.update();
				break;
			case "5":
				// delete
				proj.delete();
				break;
			case "6":
				// exit
				new Unique_Off();
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