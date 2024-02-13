package java_2024_01_19.windowmaking;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Chang extends JFrame {

	public Chang() {

		Container con = this.getContentPane();

		con.setLayout(new FlowLayout());

		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocation(300, 300);
		this.setSize(300, 300);
		this.setTitle("타이틀");

		JButton jb1 = new JButton("버튼1");
		jb1.setSize(100, 100);
//		jb1.setLocation(50, 50);
		con.add(jb1);
		
		JButton jb2 = new JButton("버튼2");
		jb2.setSize(100, 100);
//		jb2.setLocation(50, 50);
		con.add(jb2);
				
		JLabel jl1 = new JLabel("라벨1");
		jl1.setSize(100, 100);
//		jl1.setLocation(50, 50);
		con.add(jl1);

		JLabel jl2 = new JLabel("라벨2");
		jl2.setSize(100, 100);
//		jl2.setLocation(50, 50);
		con.add(jl2);
		
		JTextField jt1 = new JTextField("텍스트필드1");
		jt1.setSize(100, 100);
//		jt1.setLocation(50, 50);
		con.add(jt1);
		
		
		JTextField jt2 = new JTextField("텍스트필드2");
		jt2.setSize(100, 100);
//		jt2.setLocation(200, 200);
		con.add(jt2);
		

	}

	public static void main(String[] args) {

		new Chang();

	}

}
