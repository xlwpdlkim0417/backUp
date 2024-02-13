package chap08.sec01.exam06;
//인터페이스 사용

import chap08.sec01.exam03.RemoteControl;
import chap08.sec01.exam04.Audio;
import chap08.sec01.exam04.Television;

public class MyClass {

	// 필드
	RemoteControl rc = new Television();
	// RemoteControl 인터페이스의 구현 객체를 참조하는 필드 선언
	// RemoteControl 인터페이스를 구현한 Television 클래스의 생성자로 인스턴스 생성 후 메모리 주소 저장

	// 생성자
	MyClass() {
		// MyClass 클래스의 기본 생성자

	}

	MyClass(RemoteControl rc) {
		// MyClass 클래스의 생성자 선언
		// 매개 변수 : RemoteControl rc ▷ 인터페이스 변수
		this.rc = rc;
		// MyClass 클래스의 인스턴스 필드 선언
		// 매개 변수 : RemoteControl rc
		// MyClass의 인스턴스 필드 rc에 매개 변수로 받은 rc 객체의 참조를 할당
		rc.turnOn();
		// 매개 변수로 받은 RemoteControl 인터페이스 구현 객체의 turnOn 메소드 호출
		rc.setVolume(5);
		// 매개 변수로 받은 RemoteControl 인터페이스 구현 객체의 turnOn 메소드 호출
	}

	// 메소드
	void methodA() {
		// MyClass 클래스의 메소드 선언
		RemoteControl rc = new Audio();
		// RemoteControl 인터페이스의 구현 객체를 참조하는 변수 rc 선언
		// Audio 클래스의 생성자로 RemoteControl 인터페이스를 구현한 Audio 클래스의 구현 객체를 생성하고 메모리 주소 저장
		rc.turnOn();
		// rc가 Audio 클래스의 구현 객체를 참조하고 있으므로 Audio 클래스의 turnOn() 메소드 실행
		rc.setVolume(5);
		// rc가 Audio 클래스의 구현 객체를 참조하고 있으므로 Audio 클래스의 setVolume() 메소드 실행
	}

	void methodB(RemoteControl rc) {
		// MyClass 클래스의 메소드 선언
		// 매개 변수 : RemoteControl rc ▷ 인터페이스 변수
		rc.turnOn();
		// 매개 변수로 받은 RemoteControl 인터페이스의 구현 객체의 turnOn() 메소드 호출
		rc.setVolume(5);
		// 매개 변수로 받은 RemoteControl 인터페이스의 구현 객체의 setVolume() 메소드 호출
	}
}