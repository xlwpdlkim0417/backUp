package sec02.exam04;
//객체 타입 확인

public class Driver {
	public void drive(Vehicle vehicle) {
		// Driver 클래스의 메소드 선언
		// 매개 변수 : Vehicle vehicle
		if (vehicle instanceof Bus) { // vehicle 매개 변수가 참조하는 객체가 Bus인지 조사
			// 객체 타입 확인
			Bus bus = (Bus) vehicle; // Bus 객체일 경우 안전하게 강제 타입 변환
			// 강제 타입 변환
			bus.checkFare(); // Bus 타입으로 강제 타입 변환을 하는 이유
			// 변수 bus.로 Bus 클래스의 checkFare() 메소드 호출
		}
		vehicle.run();
		// Vehicle 인터페이스를 구현한 Bus 클래스의 run() 메소드 호출
	}
}