package sec04.exam03;

public class CarExample {

	public static void main(String[] args) {

		Car myCar = new Car();

		myCar.setGas(5); // Car의 setGas() 메소드 호출

		boolean gasState = myCar.isLeftGas(); // Car의 isLeftGas() 메소드 호출
		if (gasState) {
			System.out.println("출발합니다.");
			myCar.run(); // Car의 run() 메소드 호출
		}

		if (myCar.isLeftGas()) { // Car의 isLeftGas() 메소드 호출
			System.out.println("가스를 주입할 필요가 없습니다.");
		} else {
			System.out.println("가스를 주입하세요.");
		}

	}

}
// 7라인에서 Car 객체의 setGas(5) 메소드를 호출해서 Car 객체의 gas 필드값을 5로 변경
// 9라인에서 isLeftGas()메소드를 호출해서 리턴값을 gasState 변수에 저장
// 10라인에서 gasState 변수값이 true일 경우 12라인에서 run() 메소드를 호출
// 15라인을 보면 if문의 조건식으로 isLeftGas 메소드 호출이 들어가있는데, 이것이 가능한 이유는 isLeftGas() 메소드가 boolean 값을 리턴하기 때문 → 리턴값이 true일 경우 if 블록을 실행하고, flase일 경우 else 블록을 실행