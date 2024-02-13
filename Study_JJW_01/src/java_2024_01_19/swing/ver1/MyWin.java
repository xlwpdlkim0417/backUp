package java_2024_01_19.swing.ver1;

import java.awt.Container;

import javax.swing.JFrame;

public class MyWin extends JFrame {
	public MyWin() {

		Container con = this.getContentPane(); // 1번

		this.setDefaultCloseOperation(EXIT_ON_CLOSE); // 2번

		this.setSize(400, 300); // 3번

		this.setLocation(700, 300); // 4번

		this.setVisible(true); // 5번

		this.setTitle("자바 스윙"); // 6번

	}

	public static void main(String[] args) {

		new MyWin();

	}

}
