package sec02.exam04;
//실행 클래스

public class DriverExample {

	public static void main(String[] args) {
		Driver driver = new Driver();
		// Driver 클래스의 객체를 참조하는 변수 driver 선언
		// new 연산자와 Driver 클래스의 생성자로 인스턴스 생성 후 메모리 주소 저장
		Bus bus = new Bus();
		// Bus 클래스의 객체를 참조하는 변수 driver 선언
		// new 연산자와 Bus 클래스의 생성자로 인스턴스 생성 후 메모리 주소 저장
		Taxi taxi = new Taxi();
		// Taxi 클래스의 객체를 참조하는 변수 taxi 선언
		// new 연산자와 Taxi 클래스의 생성자로 인스턴스 생성 후 메모리 주소 저장

		driver.driver(bus); // 자동 타입 변환 : Vehicle vehicle = bus;
		// driver.로 Driver 클래스의 driver() 메소드 호출 ▷ 매개 변수 Bus bus
		// driver(Bus bus) 접근
		// bus.run() 접근
		// System.out.println("버스가 달립니다."); ▷ 자식 클래스에서 메소드 재정의

		driver.driver(taxi); // 자동 타입 변환 : Vehicle vehicle = taxi;
		// driver.로 Driver 클래스의 driver() 메소드 호출 ▷ 매개 변수 Taxi taxi
		// driver(Taxi taxi) 접근
		// taxi.run() 접근
		// System.out.println("택시가 달립니다."); ▷ 자식 클래스에서 메소드 재정의
	}
}