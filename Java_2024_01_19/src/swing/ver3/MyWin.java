package swing.ver3;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MyWin extends JFrame {

	JLabel lb1 = new JLabel("이름:"); // 7~9
	JTextField tf1 = new JTextField(15); // 7~9
	JButton bt1 = new JButton("버튼1"); // 7~9

	JLabel lb2 = new JLabel("이름:"); // 7~9
	JTextField tf2 = new JTextField(15); // 7~9
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
	}

	public static void main(String[] args) {

		new MyWin();

	}

}
