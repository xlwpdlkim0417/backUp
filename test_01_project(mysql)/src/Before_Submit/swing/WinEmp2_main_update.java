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

public class WinEmp2_main_update extends JFrame {

	JLabel lb1 = new JLabel("사원 번호 : ");
	JTextField tf1 = new JTextField(10);
	JLabel lb2 = new JLabel("이름 : ");
	JTextField tf2 = new JTextField(10);
	JLabel lb3 = new JLabel("직급 : ");
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
	JButton bt6 = new JButton("텍스트 필드 클리어");
	JButton bt7 = new JButton("화면 클리어");

	JTextArea ta = new JTextArea(43, 140);
	// 행의 개수, 열의 개수

	Connection conn;
	Statement stmt;

	public WinEmp2_main_update() {

		String url = "jdbc:mysql://localhost:3306/firm";
		String id = "root";
		String pass = "mysql";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url, id, pass);
			stmt = conn.createStatement();
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			ta.append(e.getMessage());
		}

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container con = this.getContentPane();
		con.setLayout(new BorderLayout());

		JPanel jp1 = new JPanel(new FlowLayout());
		// jp1은 판넬입니다 판넬에 플로우 레이아웃을 주고 거기에 컨테니어의 보더 레이아웃으로 아래로 깔아줌
		jp1.add(bt1);
		jp1.add(bt2);
		jp1.add(bt3);
		jp1.add(bt4);
		jp1.add(bt5);
		jp1.add(bt6);
		jp1.add(bt7);
		con.add(jp1, BorderLayout.SOUTH);

		JScrollPane scroll = new JScrollPane(ta);
		// 스크롤바가 나올 수 있도록 함
		// 그걸 판넬에 붙여서 컨테이너에 붙인 거임 안그러면 늘리는 대로 늘어나기 때문에
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

		this.setTitle("EMP 관리");
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
	}

	private void clearTextField() { // 외부에서 안쓰고 내부에서만 쓰려고 private 붙였음
		// tf니까 TextField에 관련된 메소드임
		// 입력 칸을 자동으로 비워주는 거임
		tf1.setText("");
		tf2.setText("");
		tf3.setText("");
		tf4.setText("");
		tf5.setText("");
		tf6.setText("");
		tf7.setText("");
		tf8.setText("");

	}

	private void clearTextArea() {
		ta.setText("");
	}

	public void select() { // 전체 내용

		String sql = "select * from emp";

		try {
			ResultSet rs = stmt.executeQuery(sql);

			ta.setText(""); // 전체내용 한 번 불러오고 그대로 스탑하는 방법

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
						"사원번호 = %d\t 이름 = %s\t 직급 = %s\t 사수 사원 번호 = %d\t 입사 날짜 = %s\t 급여 = %f\t 인센티브 = %f\t 부서 번호 = %d\n",
						empno, ename, job, mgr, hiredate, sal, comm, deptno);

				ta.append(str);
			}
		} catch (SQLException e) {
		}
	}

	public void insert() { // update, delete 이걸로 다 할 수 있음
		// 지금 인서트 문제점음 화면이 지워졌으면 좋겠다는 거임
		// 일단 클리어 텍스트 아레아 다 빼고 진행하고
		// 나중에 기능 추가한다

		String sql = String.format("insert into emp values(%s, '%s', '%s', %s, '%s', %s, %s, %s)", tf1.getText(),
				tf2.getText(), tf3.getText(), tf4.getText(), tf5.getText(), tf6.getText(), tf7.getText(),
				tf8.getText());
		// int 자리인데 &s로 보낼 수 있는 이유
		// 일단 보내면 알아서 받음

		if (tf2.getText().isEmpty() || tf3.getText().isEmpty() || tf4.getText().isEmpty() || tf5.getText().isEmpty()
				|| tf6.getText().isEmpty() || tf7.getText().isEmpty() || tf8.getText().isEmpty()
				|| tf1.getText().isEmpty()) {

			ta.append("모든 정보를 입력하세요.\n");

		} else {

			try {
				int result = stmt.executeUpdate(sql);
				if (result >= 1) {
					ta.append("입력 완료했습니다.\n");
					ta.append("전체 내용을 확인해주세요.\n");

				} else {
					ta.append("입력 실패했습니다.\n");
					// 개발할 때 이런 부분은 어떻게 처리하는게 좋을까?
					// 당장은 출력되지 않는 내용이지만
					// 추후 언제라도 내가 찾지 못한 버그 발생 시
					// 팝업될 수 있는 문장을 넣어두는 거
				}
			} catch (SQLException e) {
				ta.append("올바는 정보를 입력하세요.\n");
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

			ta.append("업데이트를 위해 모든 정보를 입력하세요.\n");

		} else {

			try {
				int result = stmt.executeUpdate(sql);
				if (result >= 1) {
					ta.append("업데이트했습니다.\n");

				} else {
					ta.append("업데이트 실패했습니다.\n");
					ta.append("존재하지 않는 사원 번호입니다.\n");
				}
			} catch (SQLException e) {
				ta.append("수정 희망 사원 번호를 입력하세요.\n");
			}
		}
	}

	public void delete() {

		String sql = String.format("delete from emp where empno = %s", tf1.getText());
		int result = 0;
		try {
			result = stmt.executeUpdate(sql);
			if (result >= 1) {
				ta.append("삭제했습니다.\n");

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

		ResultSet rs;
		boolean isRun = false;
		try {
			rs = stmt.executeQuery(sql);

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
						"사원번호 = %d\t 이름 = %s\t 직급 = %s\t 사수 사원 번호 = %d\t 입사 날짜 = %s\t 급여 = %f\t 인센티브 = %f\t 부서 번호 = %d\n",
						empno, ename, job, mgr, hiredate, sal, comm, deptno);

				ta.append(str);

				tf2.setText(ename);
				tf3.setText(job);
				tf4.setText(mgr + "");
				tf5.setText(hiredate);
				tf6.setText(sal + "");
				tf7.setText(comm + "");
				tf8.setText(deptno + "");

				isRun = true;

				if (isRun = false) {
					ta.append("사원 목록에 없는 사원 번호입니다.");

				}

			}

		} catch (

		SQLException e) {
			ta.append("검색 희망 사원 번호를 입력하세요.\n");
		}

	}

	public static void main(String[] args) {

		new WinEmp2_main_update();
	}
}