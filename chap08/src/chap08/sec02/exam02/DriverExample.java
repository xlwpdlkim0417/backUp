	package sec02.exam02;
	//매개 변수의 다형성 테스트
	
	public class DriverExample {
	
		public static void main(String[] args) {
			Driver driver = new Driver();
			// Driver 클래스의 객체를 참조하는 변수 driver 선언
			// Driver 클래스의 생성자로 인스턴스 생성 후 메모리 주소 저장
	
			Bus bus = new Bus();
			Taxi taxi = new Taxi();
	
			driver.drive(bus); // 자동 타입 변환 : Vehicle vehicle = bus;
			// 변수 driver.로 Driver 클래스의 drive(Vehicle vehicle) 메소드 호출
			// 매개 변수 : Vehicle vehicle = bus
			// vehicle.run() ▷ bus.run() 실행
			driver.drive(taxi); // 자동 타입 변환 : Vehicle vehicle = taxi;
		}
	}