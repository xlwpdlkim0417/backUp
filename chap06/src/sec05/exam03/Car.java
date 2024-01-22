package sec05.exam03;
//정적 메소드 선언 시 주의할 점

public class Car {

	int speed;
	// Car 클래스의 인스턴스 필드 선언

	void run() {
		// 리턴값 없는 인스턴스 메소드
		System.out.println(speed + "으로 달립니다.");
	}

	public static void main(String[] args) {

		Car myCar = new Car();
		// Car 클래스의 객체를 참조하는 변수 myCar 선언
		// new 연산자와 Car() 생성자로 인스턴스 생성 후 메모리 주소 저장
		myCar.speed = 60;
		// myCar.로 Car 클래스의 인스턴스 필드 값 할당
		myCar.run();
		// myCar.로 Car 클래스의 인스턴스 메소드 run() 호출
	}
}