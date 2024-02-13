package chap09.sec01.exam06;
//중첩 인터페이스

public class Button {

	OnClickListener listener;
	// Button 클래스의 인터페이스 타입 필드 선언

	void setOnClickListener(OnClickListener listener) {
		// Button 클래스의 메소드 선언
		// 매개 변수 : OnClickListener listener
		// Setter 메소드로 구현 객체를 받아 필드에 대입
		this.listener = listener;
		// Button 클래스의 인스턴스 필드
		// 매개 변수 값 저장
	}

	void touch() {
		// Button 클래스의 메소드 선언
		listener.onClick();
		// 1. 이러니저러니해도 결국 이 필드값은 Button 클래스 내부 인스턴스 필드니까
		// 1. Button 내부로 와서 필드를 찾고
		// 1. 그 앞에 인터페이스가 있는걸 확인하고 인터페이스로 가서 추상 메소드 호출?
		// 0. 인터페이스를 통해 구현 객체의 메소드를 호출
	}

	static interface OnClickListener {
		// 중첩 인터페이스 - 정적 멤버 인터페이스
		// 바깥 클래스의 객체 생성 없이도 바깥 클래스에 바로 접근 가능
		void onClick();
		// OnClickListener 인터페이스의 추상 메소드
	}
}