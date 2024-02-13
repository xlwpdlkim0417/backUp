package Before_Submit.swing;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Swing extends JFrame {

	JLabel lb1 = new JLabel("사원 번호 : ");
	JTextField tf1 = new JTextField(10);
	JLabel lb2 = new JLabel("이름 : ");
	JTextField tf2 = new JTextField(10);
	JLabel lb3 = new JLabel("직책 : ");
	JTextField tf3 = new JTextField(10);
	JLabel lb4 = new JLabel("사수 사원 번호 : ");
	JTextField tf4 = new JTextField(10);
	JLabel lb5 = new JLabel("입사 날짜 : ");
	JTextField tf5 = new JTextField(10);
	JLabel lb6 = new JLabel("급여 : ");
	JTextField tf6 = new JTextField(10);
	JLabel lb7 = new JLabel("인센티브 : ");
	JTextField tf7 = new JTextField(10);
	JLabel lb8 = new JLabel("부서 번호 : ");
	JTextField tf8 = new JTextField(10);

	JButton bt1 = new JButton("전체 내용"); // 이벤트 처리를 위해서 여기다가 썼습니다
	JButton bt2 = new JButton("정보 입력");
	JButton bt3 = new JButton("사원 번호 검색");
	JButton bt4 = new JButton("정보 수정");
	JButton bt5 = new JButton("정보 삭제");
	JButton bt6 = new JButton("입력 초기화");
	JButton bt7 = new JButton("화면 초기화");
	JButton bt8 = new JButton("주의 사항");
	JButton bt9 = new JButton("종료");
	JTextArea ta = new JTextArea(43, 140);
	// 행의 개수, 열의 개수

	Connection conn;
	Statement stmt;

	public Swing() {

		String url = "jdbc:mysql://localhost:3306/firm";
		String id = "root";
		String pass = "mysql";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url, id, pass);
			stmt = conn.createStatement();

			String sql = "ALTER TABLE emp ADD UNIQUE (empno);";
			stmt.executeUpdate(sql);

			ta.append("유니크 제약 설정에 성공했습니다.\n");
			ta.append("\n");
			readMe();

		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			ta.append("유니크 제약 설정에 실패했습니다.\n");
			ta.append("확인해주세요.");
		}

		// 쿼리 실행

		this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		Container con = this.getContentPane();
		con.setLayout(new BorderLayout());

		JPanel jp1 = new JPanel(new FlowLayout());
		con.add(jp1, BorderLayout.SOUTH);

		jp1.add(bt1);
		jp1.add(bt2);
		jp1.add(bt3);
		jp1.add(bt4);
		jp1.add(bt5);
		jp1.add(bt6);
		jp1.add(bt7);
		jp1.add(bt8);
		jp1.add(bt9);

		JScrollPane scroll = new JScrollPane(ta);
		JPanel jp2 = new JPanel(new FlowLayout());
		con.add(jp2, BorderLayout.CENTER);
		jp2.add(scroll);

		JPanel jp3 = new JPanel(new FlowLayout());
		con.add(jp3, BorderLayout.NORTH);
		jp3.add(lb1);
		jp3.add(tf1);
		jp3.add(lb2);
		jp3.add(tf2);
		jp3.add(lb3);
		jp3.add(tf3);
		jp3.add(lb4);
		jp3.add(tf4);
		jp3.add(lb5);
		jp3.add(tf5);
		jp3.add(lb6);
		jp3.add(tf6);
		jp3.add(lb7);
		jp3.add(tf7);
		jp3.add(lb8);
		jp3.add(tf8);

		this.setTitle("EMP 관리 서비스");
		this.setLocation(100, 100);
		this.setSize(1600, 800);
		this.setVisible(true);

		bt1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				select();
			}
		});

		bt2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				insert();

			}
		});

		bt3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				search();

			}
		});

		bt4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				update();

			}
		});

		bt5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				delete();

			}
		});

		bt6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				clearTextField();
			}
		});

		bt7.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				clearTextArea();
			}
		});

		bt8.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				clearTextArea();
				readMe();
			}
		});
		
		bt9.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Unique_Off();
				System.exit(0); // 0 : 정상종료

				

			}
		});
	}

	private void readMe() { // 사용 설명서
		ta.append("[사용 설명서]\n");
		ta.append("\n");
		ta.append("1. 전체 내용 : 전체 사원 목록을 확인할 수 있습니다.\n");
		ta.append("\n");
		ta.append("2. 정보 입력 : 사원 정보를 입력할 수 있습니다. 모든 정보를 빠짐없이 입력하세요.\n");
		ta.append("\n");
		ta.append("3. 사원 번호 검색 : 사원 번호로 정보를 검색할 수 있습니다.\n");
		ta.append("\n");
		ta.append("4. 정보 수정 : 사원 번호로 검색한 정보를 수정할 수 있습니다. 모든 정보를 빠짐없이 입력하세요.\n");
		ta.append("\n");
		ta.append("5. 정보 삭제 : 사원 번호로 정보를 삭제할 수 있습니다.\n");
		ta.append("\n");
		ta.append("6. 입력 초기화 : 입력 칸의 내용을 일괄적으로 초기화합니다.\n");
		ta.append("\n");
		ta.append("7. 화면 초기화 : 출력 화면을 초기화합니다.\n");
		ta.append("\n");
		ta.append("8. 주의 사항 : 주의 사항을 확인할 수 있습니다.\n");
		ta.append("\n");
		ta.append("9. 종료 : 정상적인 서비스 종료를 위해 종료 버튼을 눌러 종료해주세요.\n");

		ta.append("\n\n");

		ta.append("[입력 가능 정보 양식]\n");
		ta.append("\n");
		ta.append("▷ 사원 번호 : 4자리 숫자\n");
		ta.append("\n");
		ta.append("▷ 이름 : 10자리 문자\n");
		ta.append("\n");
		ta.append("▷ 직책 : 9자리 문자\n");
		ta.append("\n");
		ta.append("▷ 사수 사원 번호 : 4자리 숫자\n");
		ta.append("\n");
		ta.append("▷ 입사 날짜 : 8자리 숫자 (yyyymmdd)\n");
		ta.append("\n");
		ta.append("▷ 급여 : 5자리 숫자 (+소수점 아래 2자리)\n");
		ta.append("\n");
		ta.append("▷ 인센티브 : 5자리 숫자 (+소수점 아래 2자리)\n");
		ta.append("\n");
		ta.append("▷ 부서 번호 : 2자리 숫자\n");
		ta.append("\n");
		ta.append("※주의※ 입력 가능 정보 양식을 벗어날 경우 정상적인 이용에 어려움이 있을 수 있습니다.\n");
	}

	private void clearTextField() { // TF 클리어
		tf1.setText("");
		tf2.setText("");
		tf3.setText("");
		tf4.setText("");
		tf5.setText("");
		tf6.setText("");
		tf7.setText("");
		tf8.setText("");
	}

	private void clearTextArea() { // TA 클리어
		ta.setText("");
	}

	public void select() { // 전체 내용

		String sql = "select * from emp";

		try {
			ResultSet rs = stmt.executeQuery(sql);

			ta.setText("");

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
						"사원 번호 = %-7d\t 이름 = %-15s\t 직책 = %-17s\t 사수 사원 번호 = %-12d\t 입사 날짜 = %-24s\t 급여 = %-15.2f\t 인센티브 = %-15.2f\t 부서 번호 = %-10d\n",
						empno, ename, job, mgr, hiredate, sal, comm, deptno);

				ta.append(str + "\n");
			}
		} catch (SQLException e) {
		}
	}

	public void insert() {

		String sql = String.format("insert into emp values(%s, '%s', '%s', %s, '%s', %s, %s, %s)", tf1.getText(),
				tf2.getText(), tf3.getText(), tf4.getText(), tf5.getText(), tf6.getText(), tf7.getText(),
				tf8.getText());

		if (tf2.getText().isEmpty() || tf3.getText().isEmpty() || tf4.getText().isEmpty() || tf5.getText().isEmpty()
				|| tf6.getText().isEmpty() || tf7.getText().isEmpty() || tf8.getText().isEmpty()
				|| tf1.getText().isEmpty()) {
			ta.append("입력을 위해 모든 정보를 빠짐없이 입력하세요.\n");
		} else {
			try {
				int result = stmt.executeUpdate(sql);
				if (result >= 1) {
					ta.append("입력 성공했습니다.\n");
				} else {
					ta.append("입력 실패했습니다.\n");
				}
			} catch (SQLException e) {
				ta.append("입력 실패했습니다.\n");
				ta.append("올바른 내용을 입력하세요.\n");
			}
		}
	}

	public void update() {

		String sql = String.format(
				"update emp set ename = '%s', job = '%s', mgr = %s, hiredate = '%s', sal = %s, comm = %s, deptno = %s where empno = %s",
				tf2.getText(), tf3.getText(), tf4.getText(), tf5.getText(), tf6.getText(), tf7.getText(), tf8.getText(),
				tf1.getText());

		if (tf2.getText().isEmpty() || tf3.getText().isEmpty() || tf4.getText().isEmpty() || tf5.getText().isEmpty()
				|| tf6.getText().isEmpty() || tf7.getText().isEmpty() || tf8.getText().isEmpty()
				|| tf1.getText().isEmpty()) {
			ta.append("업데이트를 위해 모든 정보를 빠짐없이 입력하세요.\n");
		}

		try {
			int result = stmt.executeUpdate(sql);
			if (result >= 1) {
				ta.append("업데이트 성공했습니다.\n");
			} else {
				ta.append("업데이트 실패했습니다.\n");
				ta.append("사원 번호는 변경할 수 없습니다.\n");
			}
		} catch (SQLException e) {
			ta.append("올바른 업데이트 정보를 입력하세요.\n");
		}
	}

	public void delete() {

		String sql = String.format("delete from emp where empno = %s", tf1.getText());

		try {
			int result = stmt.executeUpdate(sql);
			if (result >= 1) {
				ta.append("삭제 성공했습니다.\n");
			} else {
				ta.append("삭제 실패했습니다.\n");
				ta.append("존재하지 않는 사원 번호입니다.\n");
			}
		} catch (SQLException e) {
			ta.append("삭제 희망 사원 번호를 입력하세요.\n");
		}
	}

	public void search() {

		String sql = String.format("select * from emp where empno = %s", tf1.getText());

		try {
			ResultSet rs = stmt.executeQuery(sql);

			ta.setText("");

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
						"사원 번호 = %-7d\t 이름 = %-15s\t 직책 = %-17s\t 사수 사원 번호 = %-12d\t 입사 날짜 = %-24s\t 급여 = %-15.2f\t 인센티브 = %-15.2f\t 부서 번호 = %-10d\n",
						empno, ename, job, mgr, hiredate, sal, comm, deptno);

				ta.append(str);

				tf2.setText(ename);
				tf3.setText(job);
				tf4.setText(mgr + "");
				tf5.setText(hiredate);
				tf6.setText(sal + "");
				tf7.setText(comm + "");
				tf8.setText(deptno + "");
			}
			if (ta.getText().isEmpty()) {
				ta.append("존재하지 않는 사원 번호입니다.\n");
			}
		} catch (SQLException e) {
			ta.append("검색 희망 사원 번호를 입력하세요.\n");
		}
	}

	public static void main(String[] args) {
		new Swing();
	}
}