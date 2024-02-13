package chap08.sec02.exam02;
//구현 클래스

public class Taxi implements Vehicle {
	// 구현 클래스

	@Override
	public void run() {
		// Vehicle 인터페이스의 추상 메소드를 재정의한 실체 메소드 선언
		System.out.println("택시가 달립니다");
	}
}