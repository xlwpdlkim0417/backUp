package java_2024_01_23.swing;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MyFrame extends JFrame {

	class MyEvent implements ActionListener {

		String str;

		public MyEvent(String str) {
			// TODO Auto-generated constructor stub
			this.str = str;
		}

		public MyEvent() {
			// TODO Auto-generated constructor stub
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println(tf.getText());	// 이너클래스 개꿀 필드 바로 불러다 쓸 수 있음
		}

	}

//	String str = "안녕"; // 여기에 static 달도 위에 클릭! 자리에 MyFrame.str 넣기가 첫번째
	JTextField tf = new JTextField(10);
	JButton bt = new JButton("실행");

	public MyFrame() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container con = this.getContentPane();
		con.setLayout(new FlowLayout());
		this.setLocation(500, 400);
		this.setSize(400, 300);
		this.setVisible(true);

		con.add(tf);
		con.add(bt);

//		bt.addActionListener(new MyEvent("안녕"));
		bt.addActionListener(new MyEvent());

	}

	public static void main(String[] args) {

		new MyFrame();

	}

}
