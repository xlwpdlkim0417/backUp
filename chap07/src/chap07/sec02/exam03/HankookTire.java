package sec02.exam03;
//Tire의 자식 클래스

public class HankookTire extends Tire { // 상속
	// 부모 클래스 : Tire
	// 자식 클래스 : HankookTire

	// 필드

	// 생성자

	public HankookTire(String location, int maxRotation) {
		// public 접근 제한자
		// HankookTire 클래스의 생성자 선언
		// 매개 변수 : String location, int maxRotation
		super(location, maxRotation);
		// 부모 클래스 생성자 호출
		// 매개 변수 : location, maxRotation
	}

	// 메소드

	@Override
	public boolean roll() {
		// public 접근 제한
		// 리턴 타입 : boolean
		// 부모 클래스 Tire에서 상속받은 메소드 재정의 ▷ 이 시점에서 부모 클래스의 메소드 roll() 호출 불가

		++accumulatedRotation; // 누적 회전수 1 증가
		if (accumulatedRotation < maxRotation) { // 정상 회전(누적<최대)일 경우 실행
			System.out.println(location + " HankookTire 수명: " + (maxRotation - accumulatedRotation) + "회");
			return true;
		} else { // 펑크(누적=최대)일 경우 실행
			System.out.println("***" + location + " HankookTire 펑크 ***");
			return false;
		}
	}
}