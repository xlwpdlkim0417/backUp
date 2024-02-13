package chap08.sec02.exam04;
//객체 타입 확인

public class DriverExample {

	public static void main(String[] args) {
		Driver driver = new Driver();
		// Driver 클래스의 객체를 참조하는 변수 driver 선언
		// Driver 클래스의 생성자로 인스턴스 생성 후 메모리 주소 저장

		Bus bus = new Bus();
		Taxi taxi = new Taxi();

		driver.drive(bus);
		// 변수 driver.로 Driver 클래스의 drive() 메소드 호출
		// 매개 변수 : bus
		// if (조건식)에 따라 bus.checkFare(); 실행 후 vehicle.run(); 실행
		// vehicle.run(); ▷ Vehicle 인터페이스를 구현한 Bus 클래스의 run() 메소드 호출
		driver.drive(taxi);
		// 변수 driver.로 Driver 클래스의 drive() 메소드 호출
		// 매개 변수 : taxi
	}
}