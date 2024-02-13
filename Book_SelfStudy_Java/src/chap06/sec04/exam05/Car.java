package chap06.sec04.exam05;
//클래스 외부에서 메소드 호출

public class Car {

	// 필드
	int speed;

	// 생성자

	// 메소드
	int getSpeed() {
		// 리턴 타입 : int
		// 매개 변수 :
		return speed; // 메소드 실행 결과값 리턴
	}

	void keyTurnOn() {
		// 리턴 타입 : void
		// 매개 변수 :
		System.out.println("키를 돌립니다.");
	}

	void run() {
		for (int i = 10; i <= 50; i += 10) {
			// 초기화식
			// 조건식
			// 증감식
			speed = i;
			// Car 클래스의 필드 speed에 루프 카운터 변수 i 저장 ▷ 필드값 저장
			System.out.println("달립니다.(시속:" + speed + "km/h)");
		}
	}
}
// ★ 지역 변수에 의미를 부여해서 필드값에 저장하기 위해서 speed = i; 코드가 들어간거임
// keyTurnOn() 메소드가 별로인 이유 : 필드값에 변화를 주지 않음 굳이 메소드로?