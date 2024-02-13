package java_2024_01_24.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

class Emp {
	int empno;
	String ename;
	String job;
	int sal;

	public Emp(int empno, String ename, String job, int sal) {
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

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", ename=" + ename + ", job=" + job + ", sal=" + sal + "]";
	}

}

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

public class JdbcArrayEx {

	public static void main(String[] args) {

		List<Dept> list = new ArrayList<>();
		List<Emp> list2 = new ArrayList<>();

		String url = "jdbc:mysql://localhost:3306/firm";
		String id = "root";
		String pass = "mysql";

		Statement stmt = null;
		Connection conn = null;
		ResultSet rs = null; // 분리해주는게 더 나음 안그러면 로컬 변수로 내부에서 한 번 쓰고 말아버릴거잖아

		String sql = "select empno, ename, job, sal from emp"; // firm.dept 아닌 이유 위에 firm으로 들어오라고
																// "jdbc:mysql://localhost:3306/firm";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url, id, pass); // 지역 변수 선언이라 블록 밖으로 나가면 사라짐
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
//				int deptno = rs.getInt(1);
				int deptno = rs.getInt("deptno");
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");

				int empno = rs.getInt("empno");
				String ename = rs.getString("ename");
				String job = rs.getString("job");
				int sal = rs.getInt("sal");

//				System.out.println(deptno); // deptno랑 deptno1이랑 용도가 다름
				// deptno는 String sql = "select deptno, dname, loc from dept"; 이중에서 1번 콜론 얘기하는거
				Dept dept = new Dept(deptno, dname, loc);
				Emp emp = new Emp(empno, ename, job, sal);
				list.add(dept);
				list2.add(emp);

			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

		for (Dept d : list) {
			System.out.println(d);

		}
		for (Emp em : list2) { // list에 있는 자료 모두 출력
			System.out.println(em);
//			System.out.println(s);

		}

		//
		// catch 옆에 예외 상황 작은거부터 큰 거 순서로 쓸것
		// finally에 걸리면 무조건 실행 catch에 걸리더라도
		// throws 는 오류나면 프로그램 그냥 끝내버리는거고
		// 이건 일단 오류 발생하면 뭘 할지를 메소드로 정할 수 있음 >? 이거 정확하진 않는데 실행문 넣을 수 있는 블록있으니까 가능하지 않을까?

	}
}
// 예외 상황을 내가 제어
