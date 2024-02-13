package chap06.sec06.exam06;
//Getter와 Setter 메소드 선언

public class Car {

	// 필드

	private int speed;
	// private 접근 제한자 ▷ SAME CLASS
	// Car 클래스 필드 선언

	private boolean stop;
	// private 접근 제한자 ▷ SAME CLASS
	// Car 클래스 boolean 필드 선언

	// 생성자

	// 메소드
	public int getSpeed() {
		// Getter 메소드 선언
		// public 접근 제한자 ▷ ALL FREE
		// 리턴 타입 : speed

		return speed;
	}

	public void setSpeed(int speed) {
		// Setter 메소드 선언
		// public 접근 제한자
		// 리턴 타입 : void
		// 매개 변수 : int speed

		if (speed < 0) {
			// 조건식
			this.speed = 0;
			// Car 클래스의 인스턴스 필드값
			return; // 리턴값이 있는 메소드가 아니라 메소드 실행 종료 의미의 return
		} else {
			this.speed = speed;
			// Car 클래스의 생성자로 전달된 매개 변수 값을 필드에 저장
		}
	}

	public boolean isStop() {
		// 메소드 선언
		// public 접근 제한자 ▷ ALL FREE
		// 리턴 타입 : true/false
		return stop; // 자동차의 정지 여부를 반환하는 메소드
	}

	public void setStop(boolean stop) {
		// Setter 메소드
		// public 접근 제한자
		// 리턴 타입 : true/false
		this.stop = stop;
		// Car 클래스의 생성자로 전달된 매개 변수 값을 필드에 저장
		this.speed = 0;
	}
}