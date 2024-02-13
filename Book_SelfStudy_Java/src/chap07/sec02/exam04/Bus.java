package chap07.sec02.exam04;
//자식 클래스

public class Bus extends Vehicle { // 상속
	// 부모 클래스 : Vehicle
	// 자식 클래스 : Bus

	@Override
	public void run() { // 메소드 재정의
		// 리턴 타입 : void
		System.out.println("버스가 달립니다.");
	}
}