package sec02.exam03;
//UI 클래스

public class Window {
	Button button1 = new Button();
	// Button 클래스의 객체를 참조하는 필드 button1 선언
	// Button 클래스의 생성자로 인스턴스 생성 후 메모리 주소 저장
	Button button2 = new Button();

	// 필드 초기값으로 대입
	Button.OnClickListener listener = new Button.OnClickListener() {
		// 외부 Window 클래스에서 Button 클래스의 OnClickListener 중첩 인터페이스 타입 필드 listener 선언
		// 필드값으로 익명 구현 객체 대입

		@Override
		public void OnClick() {
			System.out.println("전화를 겁니다.");
		}
	};

	Window() { // 생성자 내부에 메소드 올 수 있음
		button1.setOnClickListener(listener); // 매개값으로 필드 대입
		// 필드 button1으로 Button 클래스의 setOnClickListener() 메소드 호출
		// 매개 변수 : listener = new Button.OnClickListener()으로 시작하는 익명 구현 객체
		// 
		button2.setOnClickListener(new Button.OnClickListener() {
			// 매개 값으로 익명 객체 대입

			@Override
			public void OnClick() {
				System.out.println("메시지를 보냅니다.");
			}
		});
	}
}
