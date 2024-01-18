package swing;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame2 extends JFrame implements ActionListener { // 1번 제일 먼저 할 일 임포트 필요

	JButton jb = new JButton("버튼 1"); // 8번 버튼 만들기 (괄호 안에 버튼 위에 출력될 이름 기입)
	JButton jb2 = new JButton("버튼 2"); // 필드로 올려버리면 재정의 된 메소드에서도 쓸 수 있음

	public MyFrame2() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 3번 실행 종료 하면 이클립스도 실행 멈추는 거 메모리 누수 방지 가능
		Container con = this.getContentPane(); // 6번 컴포넌트(버튼, 레이블, 텍스트 필드, 텍스트 에어리어 등) 붙이는 곳
		this.setVisible(true); // 2번 기본 생성자 만들고 이거 만들면 됨

		this.setSize(500, 300); // 4번 사이즈 규정

		this.setLocation(300, 300); // 5번 위치 규정

		this.setTitle("오늘은 이벤트"); // 7번 타이틀 변경

		con.setLayout(new FlowLayout()); // 10번 버튼을 예쁘게 붙여주는 플로우 레이아웃 배치 관리자 설정

		con.add(jb); // 9번 만든 버튼 프레임에 추가
		jb.addActionListener(this); // 버튼에다가 ActionListener 구현한 클래스의 객체를 매개변수로 넣어줌

		con.add(jb2);
		jb2.addActionListener(this); // MyAction 대신에 this 써야함

	}

	public static void main(String[] args) {

		new MyFrame2();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == jb) {
			System.out.println("버튼 1");
		} else if (e.getSource() == jb2) {
			System.out.println("버튼 2");
		}

	}

}
