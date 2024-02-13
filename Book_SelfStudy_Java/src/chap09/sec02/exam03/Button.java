package chap09.sec02.exam03;
//UI 클래스

public class Button {
	OnClickListener listener;
	// OnClickListener 인터페이스 타입 필드 listener 선언

	void setOnClickListener(OnClickListener listener) {
		// Setter 메소드 선언
		// 매개 변수 : OnClickListener listener
		this.listener = listener;
		// Button 클래스의 OnClickListener 인터페이스 타입 인스턴스 필드 listener 선언
		// 매개 변수 OnClickListener listener 저장
		// 외부의 구현 객체를 받아 필드에 대입
	}

	void touch() {
		listener.OnClick();
		// OnClickListener 인터페이스 타입 필드 listener
		// 구현 객체의 OnClick() 메소드 호출

		// [GPT]
		// listener 필드의 OnClick 메소드를 호출
		// listener가 null이 아닌 경우에만 안전하게 작동
	}

	static interface OnClickListener {
		// Button 클래스 내부에 정의된 정적 중첩 인터페이스
		void OnClick();
		// 추상 메소드
	}
}