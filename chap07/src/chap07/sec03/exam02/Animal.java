package sec03.exam02;
//추상 메소드 선언

public abstract class Animal { // 추상 클래스

	public String kind;
	// 추상 클래스 Animal의 필드 선언

	public void breathe() {
		// 추상 클래스 Animal의 메소드 선언
		// 리턴 타입 : void
		System.out.println("숨을 쉽니다.");
	}

	public abstract void sound();
	// 추상 클래스 Animal의 추상 메소드 선언
}