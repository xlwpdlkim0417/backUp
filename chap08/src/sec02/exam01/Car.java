package sec02.exam01;
//필드 다형성

public class Car {
	Tire frontLeftTire = new HankookTire(); // 인터페이스 타입 필드 선언과 초기 구현 객체 대입
	// Tire 인터페이스의 구현 객체를 참조하는 필드 선언
	// HankookTire 클래스의 생성자로 구현 객체 생성 후 메모리 주소 저장
	Tire frontRightTire = new HankookTire();
	Tire backLeftTire = new HankookTire();
	Tire backRightTire = new HankookTire();

	void run() {
		frontLeftTire.roll(); // 인터페이스에서 설명된 roll() 메소드 호출
		// Tire 인터페이스의 구현 객체를 참조하는 필드.로 Tire 인터페이스의 roll() 메소드 호출
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
	}
}