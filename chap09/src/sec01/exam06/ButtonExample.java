package sec01.exam06;
//버튼 이벤트 처리

public class ButtonExample {

	public static void main(String[] args) {

		Button btn = new Button();
		// Button 클래스의 객체를 참조하는 변수 btn 설정
		// button 클래스의 생성자로 인스턴스 생성 후 메모리 주소 저장

		btn.setOnClickListener(new CallListener());
		// Button 클래스의 Setter 메소드 setOnClickListener() 호출
		// 매개 변수 : new CallListener()
		// Button의 인터페이스 타입 인스턴스 필드에 CallListener의 구현 객체 저장
		btn.touch();
		// Button 클래스의 touch() 메소드 호출
		// CallListener 클래스의 재정의된 실체 메소드 호출

		btn.setOnClickListener(new MessageListener());
		btn.touch();
	}
}