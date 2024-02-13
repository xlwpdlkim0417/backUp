package sec02.exam02;
//매개 변수의 인터페이스화

public class Driver {
	public void drive(Vehicle vehicle) {
		vehicle.run();
		// 구현 클래스가 아니고 그냥 매개 변수로 썼을 뿐임
		// 그래서 실체 클래스로 재정의가 이루어지는 건 아님
		// 모양이 헷갈릴 수 있는데 이거 생성자 아니고 메소드 선언임
	}
}