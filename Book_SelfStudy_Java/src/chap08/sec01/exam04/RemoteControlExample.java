package chap08.sec01.exam04;
//인터페이스 변수에 구현 객체 대입

import chap08.sec01.exam03.RemoteControl;

public class RemoteControlExample {

	public static void main(String[] args) {

		RemoteControl rc;
		// RemoteControl 인터페이스의 구현 객체를 참조하는 변수 rc 선언

		rc = new Television();
		// RemoteControl 인터페이스를 구현하는 Television 클래스의 생성자로 구현 객체 생성 후 메모리 주소 저장
		rc = new Audio();
		// RemoteControl 인터페이스를 구현하는 Audio 클래스의 생성자로 구현 객체 생성 후 메모리 주소 저장
	}
}