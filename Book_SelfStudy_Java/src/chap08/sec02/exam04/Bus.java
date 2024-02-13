package chap08.sec02.exam04;
//구현 클래스

public class Bus implements Vehicle {

	@Override
	public void run() {
		// 실체 메소드
		System.out.println("버스가 달립니다.");
	}

	public void checkFare() {
		// Bus 클래스의 메소드 선언
		System.out.println("승차요금을 체크합니다.");
	}
}