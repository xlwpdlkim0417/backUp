package chap07.sec02.exam03;
//Tire의 자식 클래스

public class KumhoTire extends Tire { // 상속
	// 부모 클래스 : Tire
	// 자식 클래스 : KumhoTire

	// 필드

	// 생성자

	public KumhoTire(String location, int maxRotation) {
		// KumhoTire 클래스의 생성자 선언
		// 매개 변수 : String location, int maxRotation
		super(location, maxRotation);
		// 부모 클래스 생성자 호출
		// 매개 변수 : String location, int maxRotation
	}

	// 메소드

	@Override
	public boolean roll() {
		// 상속으로 메소드 재정의
		// 리턴 타입 : boolean
		++accumulatedRotation; // 누적 회전수 1 증가
		if (accumulatedRotation < maxRotation) { // 정상 회전(누적<최대)일 경우 실행
			System.out.println(location + " KumhoTire 수명: " + (maxRotation - accumulatedRotation) + "회");
			return true;
		} else { // 펑크(누적=최대)일 경우 실행
			System.out.println("***" + location + " KumhoTire 펑크 ***");
			return false;
		}
	}
}