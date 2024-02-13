package sec01.exam04;
//super 변수

public class SupersonicAirplane extends Airplane { // 상속
	// 부모 클래스 : Airplane
	// 자식 클래스 : SupersonicAirplane

	public static final int NORMAL = 1;
	// 상수 선언
	// public 접근 제한자

	public static final int SUPERSONIC = 2;
	// 상수 선언
	// public 접근 제한자

	public int flyMode = NORMAL;
	// 자식 클래스의 필드 선언
	// public 접근 제한자
	// 상수 값 필드 저장

	@Override // 메소드 재정의
	public void fly() {
		// 메소드 선언
		// public 접근 제한자
		// 리턴 타입 : void

		if (flyMode == SUPERSONIC) {
			// 자식 클래스의 필드
			// 자식 클래스의 상수
			System.out.println("초음속비행합니다.");
		} else {
			super.fly();
			// super.로 호출했으므로 부모 클래스의 메소드 호출
			// 자식 클래스 내부에서 재정의 된 부모 클래스의 메소드 호출 필요할 떄
		}
	}
}