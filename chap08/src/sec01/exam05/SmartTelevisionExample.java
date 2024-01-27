package sec01.exam05;
//인터페이스 변수에 구현 객체 대입

import sec01.exam03.RemoteControl;

public class SmartTelevisionExample {

	public static void main(String[] args) {
		SmartTelevision tv = new SmartTelevision();
		// RemoteControl, Searchable 인터페이스를 다중 구현한 SmartTelevision 클래스의 객체를 참조하는 변수 tv
		// 선언
		// SmartTelevision() 생성자로 인스턴스 생성 후 메모리 주소 저장

		RemoteControl rc = tv; // 이 부분 모양이 좀 납득이 안가네 다른데서 이렇게 쓴 적이 있던가?
		// RemoteControl 인터페이스의 구현 객체를 참조하는 변수 rc에 변수 tv 저장
		// 결국 이 형태도 왼쪽이 부모이고 오른쪽이 자식이라고 생각하면 됨
		// RemoteControl rc = new SmartTelevision(); 이런 느낌인 셈
		// RemoteControl 인터페이스의 구현 객체 생성 X
		// 이미 생성된 SmartTelevision 객체 재사용 ▷ 구현 객체

		Searchable searchable = tv;
		// Searchable 인터페이스의 구현 객체 생성
	}
}