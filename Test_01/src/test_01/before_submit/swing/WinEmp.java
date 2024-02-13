package test_01.before_submit.swing;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class WinEmp extends JFrame {

	JLabel lb1 = new JLabel("부서 코드 : ");
	JTextField tf1 = new JTextField(5);
	JLabel lb2 = new JLabel("부서 이름 : ");
	JTextField tf2 = new JTextField(5);
	JLabel lb3 = new JLabel("부서 위치 : ");
	JTextField tf3 = new JTextField(5);

	JButton bt1 = new JButton("전체 내용"); // 이벤트 처리를 위해서 여기다가 썼습니다
	JButton bt2 = new JButton("입력");
	JButton bt3 = new JButton("이름 검색");
	JButton bt4 = new JButton("수정");
	JButton bt5 = new JButton("삭제");

	JTextArea ta = new JTextArea(10, 40);
	// 행의 개수, 열의 개수

	public WinEmp() {
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

		this.setTitle("EMP 관리");
		this.setLocation(500, 400);
		this.setSize(500, 300);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new WinEmp();
	}
}