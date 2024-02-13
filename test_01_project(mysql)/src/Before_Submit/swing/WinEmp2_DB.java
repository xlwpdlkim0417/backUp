package swing;

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

public class WinEmp2_DB extends JFrame {

	JLabel lb1 = new JLabel("사원 번호 : ");
	JTextField tf1 = new JTextField(5);
	JLabel lb2 = new JLabel("이름 : ");
	JTextField tf2 = new JTextField(5);
	JLabel lb3 = new JLabel("직급 : ");
	JTextField tf3 = new JTextField(5);
	JLabel lb4 = new JLabel("사수 사원 번호 : ");
	JTextField tf4 = new JTextField(5);
	JLabel lb5 = new JLabel("입사 날짜 : ");
	JTextField tf5 = new JTextField(5);
	JLabel lb6 = new JLabel("급여 : ");
	JTextField tf6 = new JTextField(5);
	JLabel lb7 = new JLabel("인센티브 : ");
	JTextField tf7 = new JTextField(5);
	JLabel lb8 = new JLabel("부서 번호 : ");
	JTextField tf8 = new JTextField(5);

	JButton bt1 = new JButton("전체 내용"); // 이벤트 처리를 위해서 여기다가 썼습니다
	JButton bt2 = new JButton("입력");
	JButton bt3 = new JButton("이름 검색");
	JButton bt4 = new JButton("수정");
	JButton bt5 = new JButton("삭제");

	JTextArea ta = new JTextArea(10, 40);
	// 행의 개수, 열의 개수

	Connection conn;
	Statement stmt;

	public WinEmp2_DB() {

		String url = "jdbc:mysql://localhost:3306/firm";
		String id = "root";
		String pass = "mysql";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url, id, pass);
			stmt = conn.createStatement();
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
		this.setLocation(400, 300);
		this.setSize(1000, 600);
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
				clearTextField();
				select();
			}
		});
	}

	private void clearTextField() { // 외부에서 안쓰고 내부에서만 쓰려고 private 붙였음
		tf1.setText("");
		tf2.setText("");
		tf3.setText("");

	}

	public void select() {

		String sql = "select deptno, dname, loc from dept";

		try {
			ResultSet rs = stmt.executeQuery(sql);

			ta.setText(""); // 전체내용 한 번 불러오고 그대로 스탑하는 방법

			while (rs.next()) {
				int deptno = rs.getInt("deptno");
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");
				String str = String.format("%d, %s, %s\n", deptno, dname, loc);

				ta.append(str);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void insert() { // update, delete 이걸로 다 할 수 있음

		String sql = String.format("insert into dept values(%s, '%s', '%s')", tf1.getText(), tf2.getText(),
				tf3.getText());
		// int 자리인데 &s로 보낼 수 있는 이유
		// 일단 보내면 알아서 받음

		try {
			int rest = stmt.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void update() {

		String sql = "update emp sal 3000 where empno = 7777";

	}

	public void delete() {

	}

	public static void main(String[] args) {
		new WinEmp2_DB();
	}
}