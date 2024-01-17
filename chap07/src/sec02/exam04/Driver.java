package sec02.exam04;

public class Driver {

	public void driver(Vehicle vehicle) { // 괄호 안은 지역변수처럼 변수임
		vehicle.run(); // 도트 연산자를 통해서 vehicle 지역 변수로 연결되어 있는 Vehicle의 run() 메소드를 활용
	}

}
