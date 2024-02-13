package sec04.exam03;
//return문

public class Car {

	// 필드
	int gas;
	// int 타입 필드 gas 선언

	// 생성자

	// 메소드
	void setGas(int gas) {
		// 리턴값이 없는 메소드 (void) ▷ 매개 변수로 gas 필드값 변경
		this.gas = gas;
		// Car 클래스의 인스턴스 필드 gas에
		// Car 클래스의 메소드로 전달된 매개 변수 gas 저장
	}

	boolean isLeftGas() {
		// 리턴 타입 : true/false
		// 매개 변수 :
		if (gas == 0) {
			// 조건식 : Car 클래스의 인스턴스 필드 gas의 값이 0일 때
			System.out.println("gas가 없습니다.");
			return false; // 메소드의 결과값 false를 리턴
		}
		System.out.println("가스가 있습니다.");
		return true; // 메소드의 결과값 true를 리턴

	}

	void run() {
		// 리턴값이 없는 메소드 (void) ▷ return문으로 메소드 실행 종료
		while (true) { // while 반복문 시작
			if (gas > 0) {
				// 조건식 : Car 클래스의 인스턴스 필드 gas가 0보다 크다
				System.out.println("달립니다.(gas 잔량:" + gas + ")");
				gas -= 1; // 증감식 : gas에 (gas - 1) 연산식 값 저장
			} else {
				System.out.println("멈춥니다.(gas 잔량:" + gas + ")");
				return; // 메소드 실행 종료
			}
		} // while 반복문 종료
	}
}