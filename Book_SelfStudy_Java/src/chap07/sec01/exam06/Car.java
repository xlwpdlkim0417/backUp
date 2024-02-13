package chap07.sec01.exam06;
//재정의 할 수 없는 final 메소드

public class Car {

	// 필드
	public int speed;
	// piblic 접근 제한자
	// Car 클래스의 필드 선언

	// 메소드
	public void speedUp() {
		// public 접근 제한자
		// 리턴 타입 : void
		speed += 1; // 메소드 실행 내용
	}

	// final 메소드
	public final void stop() {
		// public 접근 제한자
		// final 메소드 ▷ 상속 불가
		// 리턴 타입 : void
		System.out.println("차를 멈춤");
		speed = 0;
	}
}