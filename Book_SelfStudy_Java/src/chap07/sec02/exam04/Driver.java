package chap07.sec02.exam04;
//Vehicle을 이용하는 클래스

public class Driver {

	public void driver(Vehicle vehicle) { // 괄호 안은 지역변수처럼 변수임
		// 리턴 타입 : void
		// 매개 변수 Vehicle vehicle ▷ Vehicle 클래스 타입의 변수 vehicle
		vehicle.run(); // 도트 연산자를 통해서 vehicle 지역 변수로 연결되어 있는 Vehicle의 run() 메소드를 활용
		// vehicle.로 Vehicle 클래스의 인스턴스 메소드 run() 호출
	}
}