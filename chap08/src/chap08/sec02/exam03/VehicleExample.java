package sec02.exam03;
//강제 타입 변환

public class VehicleExample {

	public static void main(String[] args) {
		Vehicle vehicle = new Bus();

		vehicle.run();
//		vehicle.checkFare(); // Vehicle 인터페이스에는 checkFare()가 없음
		// The method checkFare() is undefined for the type Vehicle
		// 강제 타입 변환 이전 사용 불가능 메소드

		Bus bus = (Bus) vehicle; // 강제 타입 변환
		// Vehicle vehicle = new Bus(); 자동 타입 변환이 이루어졌으므로 강제 타입 변환 가능

		bus.run();
		bus.checkFare(); // Bus 클래스에는 checkFare()가 있음
		// 강제 타입 변환 이후 사용 가능 메소드
	}
}