package sec02.exam03;

public class CarExample {

	public static void main(String[] args) {

		Car car = new Car(); // Car 객체 생성
		// Car 클래스의 객체를 참조하는 변수 선언
		// new 연산자와 Car 클래스의 생성자로 인스턴스 생성 후 메모리 주소 저장

		for (int i = 1; i <= 5; i++) { // Car 객체의 run() 메소드 5번 반복 실행
			// 초기화식
			// 조건식
			// 증감식
			int problemLocation = car.run();
			// int 타입 변수 problemLocation 선언
			// 변수 car가 참조하는 Car 클래스의 인스턴스 메소드 run() 호출

			switch (problemLocation) {
			case 1:
				System.out.println("앞왼쪽 HankookTire로 교체");
				car.frontLeftTire = new HankookTire("앞왼쪽", 15);
				// 변수 car가 참조하는 Car 클래스 인스턴스 필드 선언
				// new 연산자와 Tire 클래스의 자식 클래스인 HankookTire 클래스의 생성자로 인스턴스 생성 후 메모리 주소 저장
				// 매개 변수 : String location, int maxRotation
				break;
			case 2:
				System.out.println("앞오른쪽 KumhoTire로 교체");
				car.frontRightTire = new KumhoTire("앞오른쪽", 13);
				break;
			case 3:
				System.out.println("뒤왼쪽 HankookTire로 교체");
				car.backLeftTire = new HankookTire("뒤왼쪽", 14);
				break;
			case 4:
				System.out.println("앞왼쪽 KumhoTire로 교체");
				car.backRightTire = new KumhoTire("뒤오른쪽", 17);
				break;
			}
			System.out.println("────────────────────");
		}
	}
}