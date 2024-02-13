package sec01.exam06;
//재정의 할 수 없는 final 메소드

public class SportsCar extends Car { // 상속
	// 부모 클래스 : Car
	// 자식 클래스 : SportsCar
	@Override // 메소드 재정의
	public void speedUp() {
		// public 접근자
		// 리턴 타입 void
		speed += 10;
	}

//	@Override
//	public void stop() {
//		// Cannot override the final method from Car
//		// public 제한 접근자
//		// 리턴 타입 : void
//		// Car 클래스의 stop() 메소드는 final 메소드 ▷ 상속 불가
//		System.out.println("스포츠카를 멈춤");
//		speed = 0;
//	}
}