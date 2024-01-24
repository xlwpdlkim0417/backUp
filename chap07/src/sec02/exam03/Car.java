package sec02.exam03;
//Tire 부품으로 가지는 클래스

public class Car {

	// 필드
	Tire frontLeftTire = new Tire("앞왼쪽", 6); // 자동차는 4개의 타이어를 가짐
	// Tire 클래스의 객체를 참조하는 변수 선언
	// new 연산자와 Tire 클래스의 생성자로 인스턴스 생성 후 메모리 주소 저장
	// 매개 변수 : String location, int maxRotation
	Tire frontRightTire = new Tire("앞오른쪽", 2);
	Tire backLeftTire = new Tire("뒤왼쪽", 3);
	Tire backRightTire = new Tire("뒤오른쪽", 4);

	// 생성자

	// 메소드
	int run() {
		// 모든 타이어를 1회 회전시키기 위해 각 Tire 객체의 roll() 메소드를 호출. false를 리턴하는 roll()이 있을 경우
		// stop() 메소드를 호출하고 해당 타이어 번호를 리턴
		// 리턴 타입 : int
		System.out.println("[자동차가 달립니다.]");
		if (frontLeftTire.roll() == false) {
			// 조건식 : frontLeftTire를 통해 접근할 수 있는 Tire 클래스의 메소드 값 == false
			stop();
			// Car 클래스의 메소드
			return 1;
		}
		if (frontRightTire.roll() == false) {
			stop();
			return 2;
		}
		if (backLeftTire.roll() == false) {
			stop();
			return 3;
		}
		if (backRightTire.roll() == false) {
			stop();
			return 4;
		}
		return 0;
	}

	void stop() { // 펑크 났을 때 실행
		// 리턴 타입 : void
		System.out.println("[자동차가 멈춥니다.]");
	}
}