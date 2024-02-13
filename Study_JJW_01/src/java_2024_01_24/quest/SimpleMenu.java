package java_2024_01_24.quest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Dept {

	int deptno;
	String dname;
	String loc;

	public Dept(int deptno, String dname, String loc) {
		super();
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
	}

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	@Override
	public String toString() {
		return "Dept [deptno=" + deptno + ", dname=" + dname + ", loc=" + loc + "]";
	}

}

class Emp {

	int empno;
	String ename;
	String job;
	double sal;

	public Emp(int empno, String ename, String job, double sal) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.job = job;
		this.sal = sal;
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", ename=" + ename + ", job=" + job + ", sal=" + sal + "]";
	}

}

public class SimpleMenu {

	private static final String DB_URL = "jdbc:mysql://localhost:3306/firm";
	private static final String DB_USER = "root";
	private static final String DB_PASSWORD = "mysql";

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {

			boolean exit = false;

			while (!exit) {
				System.out.println("1. 데이터 보기");
				System.out.println("2. 데이터 삽입");
				System.out.println("3. 종료");
				System.out.print("선택하세요: ");

				String choice = scanner.nextLine();

				switch (choice) {
				case "1":
					viewData(connection);
					break;
				case "2":
					insertData(connection);
					break;
				case "3":
					exit = true;
					break;
				default:
					System.out.println("유효하지 않은 선택. 다시 시도하세요.");
					break;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void viewData(Connection connection) {

		List<Dept> list = new ArrayList<>();

		String sql = "select * from dept";

		try {
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				int deptno = rs.getInt("deptno");
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");

				Dept dept = new Dept(deptno, dname, loc);
				list.add(dept);
			}

			for (Dept d : list) {
				System.out.println(d);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	private static void insertData(Connection connection) {

		System.out.print("1. 부서 번호 : ");
		int insDeptno = Integer.parseInt(scanner.nextLine());
		System.out.print("2. 이름 : ");
		String insDname = scanner.nextLine();
		System.out.print("3. 위치 : ");
		String insLoc = scanner.nextLine();
		System.out.print("선택하세요: ");

		String sql = "insert into dept values(deptno, dname, loc)";

		Statement stmt;
		try {
			stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				int deptno = rs.getInt(insDeptno);
				String dname = rs.getString(insDname);
				String loc = rs.getString(insLoc);

				List<Dept> list = new ArrayList<>();

				Dept dept = new Dept(deptno, dname, loc);
				list.add(dept);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
