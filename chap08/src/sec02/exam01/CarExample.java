package sec02.exam01;
//필드 다형성 테스트

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		// Car 클래스의 객체를 참조하는 myCar 변수 선언
		// Car 클래스의 생성자로 인스턴스 생성 후 메모리 주소 저장

		myCar.run();
		// 변수 myCar.로 Car 클래스의 run() 메소드 호출

		myCar.frontLeftTire = new KumhoTire();
		// 변수 myCar.로 필드 값 변경
		myCar.frontRightTire = new KumhoTire();

		myCar.run();
		// 변수 myCar.로 Car 클래스의 run() 메소드 호출
		// 필드 값을 변경했으므로 메소드 결과값 다름 ▷ 필드 다형성
	}
}