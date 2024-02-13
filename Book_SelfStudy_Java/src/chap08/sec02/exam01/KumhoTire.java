package chap08.sec02.exam01;
//구현 클래스

public class KumhoTire implements Tire {

	@Override
	public void roll() { // Tire 인터페이스 구현
		// Tire 인터페이스의 추상 메소드를 재정의한 KumhoTire 클래스의 실체 메소드
		System.out.println("금호 타이어가 굴러갑니다.");
	}
}