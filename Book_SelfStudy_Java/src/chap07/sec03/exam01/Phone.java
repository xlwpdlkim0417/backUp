package chap07.sec03.exam01;
//추상 클래스

public abstract class Phone {
	// 추상 클래스

	// 필드
	public String owner;
	// Phone 클래스의 필드 선언

	// 생성자
	public Phone(String owner) {
		// Phone 클래스의 생성자 선언
		// 매개 변수 : String owner
		this.owner = owner;
		// Phone 클래스에서 선언한 필드에 매개 변수 값 저장
	}

	// 메소드
	public void turnOn() {
		// Phone 클래스의 메소드 선언
		// 리턴 타입 : void
		System.out.println("폰 전원을 켭니다.");
	}

	public void turnOff() {
		// Phone 클래스의 메소드 선언
		// 리턴 타입 : void
		System.out.println("폰 전원을 끕니다.");
	}
}