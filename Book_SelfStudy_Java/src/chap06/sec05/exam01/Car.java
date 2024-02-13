package chap06.sec05.exam01;
//인스턴스 멤버와 this

public class Car {

	// 필드
	String model;
	// Car 클래스의 인스턴스 필드 선언
	int speed;
	// Car 클래스의 인스턴스 필드 선언

	// 생성자
	Car(String model) {
		// 매개 변수 : String model
		this.model = model;
		// Car 클래스의 인스턴스 필드 model에
		// Car 클래스의 생성자로 전달된 매개 변수 model 저장

	}

	// 메소드
	void setSpeed(int speed) {
		// 리턴값 없는 메소드
		// 매개 변수 : int speed
		this.speed = speed;
		// Car 클래스의 인스턴스 필드 speed에
		// Car 클래스의 메소드로 전달된 매개 변수 speed 저장
	}

	void run() {
		// 리턴값 없는 메소드
		for (int i = 10; i <= 50; i += 10) {
			// 초기화식
			// 조건식
			// 증감식
			this.setSpeed(i);
			// Car 클래스의 인스턴스 메소드 setSpeed()에
			// 루프 카운터 변수를 매개 변수로 메소드 실행
			System.out.println(this.model + "가 달립니다.(시속:" + this.speed + "km/h)");
		}
	}
}