package _2024_01_12;

public class Car {

	// 필드
	int gas;

	// 생성자

	// 메소드
	void setGas(int gas) { // 리턴값이 없는 메소드로 매개값을 받아서 gas 필드값 변경
		this.gas = gas;
	}

	boolean isLeftGas() { // 리턴값이 boolean인 메소드로 gas 필드값이 0이면 false를, 0이 아니면 true를 리턴
		if (gas == 0) {
			System.out.println("gas가 없습니다.");
			return false; // false를 리턴
		}
		System.out.println("가스가 있습니다.");
		return true; // true를 리턴

	}

	void run() { // 리턴값이 없는 메소드로 gas 필드값이 0이면 return문으로 메소드 강제 종료
		while (true) {
			if (gas > 0) {
				System.out.println("달립니다.(gas 잔량:" + gas + ")");
				gas -= 1;
			} else {
				System.out.println("멈춥니다.(gas 잔량:" + gas + ")");
				return; // 메소드 실행 종료 = 반복문 실행이 끝남 이거 break의 기능이라고 생각하면 됨. 메소드니까 리턴을 쓴거임.
						// break라면 while문 밖으로 빠져 나간다음에 돌아갈거고 return은 그 순간에 바로 돌아감.
			}
		}
	}

}
// 메소드가 하는 일은 무엇일까?
// 필드값 수정, 검색, 넘겨주기.