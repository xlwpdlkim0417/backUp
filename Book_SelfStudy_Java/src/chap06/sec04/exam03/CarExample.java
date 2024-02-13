package chap06.sec04.exam03;
//return문

public class CarExample {

	public static void main(String[] args) {

		Car myCar = new Car();
		// Car 클래스의 객체를 참조하는 myCar에
		// new 연산자로 인스턴스 생성 후 메모리 주소 저장

		myCar.setGas(5); // Car의 setGas() 메소드 호출
		// myCar + (.)로 Car 클래스의 setGas() 메소드 호출
		// 매개변수로 전달된 값으로 gas 필드값을 변경

		boolean gasState = myCar.isLeftGas(); // Car의 isLeftGas() 메소드 호출
		// boolean 타입 gasState에 myCar + (.)로 Car 클래스의 isLeftGas() 메소드 호출
		// isLeftGas() 메소드 실행 후 결과값 리턴
		if (gasState) {
			// 조건식 : Car 클래스의 인스턴스 필드 gas의 값이 0일 때
			// 메소드의 결과값 false를 리턴
			// gas의 값이 0이 아닐 때 ▷ true 리턴
			System.out.println("출발합니다.");
			myCar.run(); // Car의 run() 메소드 호출
			// gas의 값이 0이 아닐 때 ▷ myCar + (.)로 Car 클래스의 run() 메소드 호출
			// 리턴값이 없는 메소드
		}

		if (myCar.isLeftGas()) { // Car의 isLeftGas() 메소드 호출
			// myCar.로 Car 클래스의 isLeftGas() 메소드 호출
			System.out.println("가스를 주입할 필요가 없습니다."); // 메소드 실행 결과값 true 리턴
		} else {
			System.out.println("가스를 주입하세요."); // 메소드 실행 결과값 false 리턴
		}
	}
}
// 7라인에서 Car 객체의 setGas(5) 메소드를 호출해서 Car 객체의 gas 필드값을 5로 변경
// 9라인에서 isLeftGas()메소드를 호출해서 리턴값을 gasState 변수에 저장
// 10라인에서 gasState 변수값이 true일 경우 12라인에서 run() 메소드를 호출
// 15라인을 보면 if문의 조건식으로 isLeftGas 메소드 호출이 들어가있는데, 이것이 가능한 이유는 isLeftGas() 메소드가 boolean 값을 리턴하기 때문 → 리턴값이 true일 경우 if 블록을 실행하고, flase일 경우 else 블록을 실행