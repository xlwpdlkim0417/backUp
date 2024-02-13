package sec01.exam06;
//구현 클래스

public class CallListener implements Button.OnClickListener {
	// Button 클래스 내부의 중첩 인터페이스 OnClickListener를 구현

	@Override
	public void onClick() {
		// 실체 메소드
		System.out.println("전화를 겁니다.");
	}
}