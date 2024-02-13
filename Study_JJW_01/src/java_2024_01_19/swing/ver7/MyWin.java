package java_2024_01_19.swing.ver7;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MyWin extends JFrame { // 14번

	JLabel lb1 = new JLabel("이름1:"); // 7~9
	JTextField tf1 = new JTextField(5); // 7~9
	JButton bt1 = new JButton("버튼1"); // 7~9

	JLabel lb2 = new JLabel("이름2:"); // 7~9
	JTextField tf2 = new JTextField(5); // 7~9
	JButton bt2 = new JButton("종료"); // 7~9

	JLabel lbState = new JLabel("메세지 보여줌");

	JTextArea ta = new JTextArea(10, 10);

	public MyWin() {

		Container con = this.getContentPane(); // 1번

		this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); // 2번 : this.setDefaultCloseOperation(EXIT_ON_CLOSE);

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

		con.add(lbState);

		bt1.addActionListener(new ActionListener() { // 괄호 안에 new action까지 누르고 ctrl+스페이스로 나오는 proposal을 이용하라
			// 인터페이스이기 때문에 익명의 객체 생성임 클래스였다면 익명의 자식 객체였겠지

			@Override
			public void actionPerformed(ActionEvent e) {
				lbState.setText("버튼 1을 클릭했습니다");

				System.out.println("버튼1");
			}
		}); // 세미콜론이 바깥에 있더라도 익명의 객체라는 걸 알아차려라

		bt2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
//				System.out.println("종료");
//				System.exit(0); // 0 : 정상종료

				confirmExit();

			}
		});
		// 파일읽기 작업 처리
		JOptionPane.showMessageDialog(this, "파일 읽음", "파일 읽기", JOptionPane.INFORMATION_MESSAGE);

		JScrollPane scroll = new JScrollPane(ta);
//		scroll.setSize(30, 30);
		con.add(scroll);

	}

	public void confirmExit() {

		int answer = JOptionPane.showConfirmDialog(this, "종료?", "confirm", JOptionPane.YES_NO_OPTION); // Pane : 붙이는
																										// 개념이라고 생각하면 됨

		if (answer == JOptionPane.YES_OPTION) { // 사용자가 yes를 눌렀을 경우
			System.out.println("프로그램을 종료");
			// 파일로 객체를 보내는 일 처리를 여기서 하려고 합니다 코드 짜라는 말입니다 실행하기 전에 가져오고 실행 마치기 전에 적ㅏㅇ라고
			System.exit(0);
		} else { // 사용자가 yes 이외의 값을 눌렀을 경우
			lbState.setText("종료 취소했습니다");
			System.out.println("종료 취소");
		}
	}

	public static void main(String[] args) {

		new MyWin();

	}

}
