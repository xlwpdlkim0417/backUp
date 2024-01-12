package sec04.exam05;

public class Car {

	// 필드
	int speed;

	// 생성자

	// 메소드
	int getSpeed() {	//리턴문을 쓰지 않으면 이클립스가 자동으로 추천하는 위치에 추천하는데 우리가 생각하고 집어넣어야지 무조건 이클립스의 추천을 따라가지는 말자
		return speed;
	}

	void keyTurnOn() {	// 이 메소드가 별로인 이유 : 필드값에 대해서 변화를 주지 않음 이런걸 굳이 메소드로?
		System.out.println("키를 돌립니다.");
	}

	void run() {
		for (int i = 10; i <= 50; i += 10) {
			speed = i;	//필드값을 변경하기 위해서 이거 Bank 프로젝트 idx = i; 랑 비슷한 느낌이네
			System.out.println("달립니다.(시속:" + speed + "km/h)");
		}
	}

}
//★ 지역 변수에 의미를 부여해서 필드값에 저장하기 위해서 speed = i; 코드가 들어간거임