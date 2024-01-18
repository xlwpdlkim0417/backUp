package sec01.exam05;
//인터페이스 변수에 구현 객체 대입

import sec01.exam03.RemoteControl;

public class SmartTelevisionExample {

	public static void main(String[] args) {
		SmartTelevision tv = new SmartTelevision();
		// [RemoteControl, Searchable] 인터페이스를 다중 구현한 SmartTelevision 클래스의 참조 변수 tv에
		// SmartTelevision() 생성자를 통해서 새로운 객체 생성 (클래스 컴파일 할 때 별도의 생성자없다면 기본 생성자 자동 생성)

		RemoteControl rc = tv; // 이 부분 모양이 좀 납득이 안가네 다른데서 이렇게 쓴 적이 있던가?
		// 인터페이스 RemoteControl의 참조 변수 rc에 참조 변수 tv에 담겨있는 내용을 저장
		// 결국 이 형태도 왼쪽이 부모이고 오른쪽이 자식이라고 생각하면 됨

		Searchable searchable = tv;
	}

}
