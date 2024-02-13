package java_2024_01_19.swing.ver4;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MyWin extends JFrame { // 14번

	JLabel lb1 = new JLabel("이름1:"); // 7~9
	JTextField tf1 = new JTextField(5); // 7~9
	JButton bt1 = new JButton("버튼1"); // 7~9

	JLabel lb2 = new JLabel("이름2:"); // 7~9
	JTextField tf2 = new JTextField(5); // 7~9
	JButton bt2 = new JButton("버튼2"); // 7~9

	public MyWin() {

		Container con = this.getContentPane(); // 1번

		this.setDefaultCloseOperation(EXIT_ON_CLOSE); // 2번

		this.setSize(400, 300); // 3번

		this.setLocation(700, 300); // 4번

		this.setVisible(true); // 5번

		this.setTitle("자바 스윙"); // 6번

		con.setLayout(new FlowLayout()); // 10번

		con.add(lb1); // 11~13
		con.add(tf1); // 11~13
		con.add(bt1); // 11~13

		con.add(lb2);
		con.add(tf2);
		con.add(bt2);

		bt1.addActionListener(new ActionListener() { // 괄호 안에 new action까지 누르고 ctrl+스페이스로 나오는 proposal을 이용하라
			// 인터페이스이기 때문에 익명의 객체 생성임 클래스였다면 익명의 자식 객체였겠지
			
			@Override
			public void actionPerformed(ActionEvent e) {

				System.out.println("버튼1");
			}
		}); // 세미콜론이 바깥에 있더라도 익명의 객체라는 걸 알아차려라

		bt2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼2");
			}
		});

	}

	public static void main(String[] args) {

		new MyWin();

	}

}
