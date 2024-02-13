package sec01.exam01;
//부모 클래스

public class CellPhone {

	// 필드

	String model;
	// CellPhone 클래스 필드 선언
	// default 접근 제한자
	String color;
	// CellPhone 클래스 필드 선언
	// default 접근 제한자

	// 생성자

	// 메소드
	void powerOn() {
		// 메소드 선언
		// 리턴 타입 : void
		System.out.println("전원을 켭니다.");
	}

	void powerOff() {
		// 메소드 선언
		// 리턴 타입 : void
		System.out.println("전원을 끕니다.");
	}

	void bell() {
		// 메소드 선언
		// 리턴 타입 : void
		System.out.println("벨이 울립니다.");
	}

	void sendVoice(String message) {
		// 메소드 선언
		// 리턴 타입 : void
		// 매개 변수 : String message
		System.out.println("자기: " + message);
	}

	void receiveVoice(String message) {
		// 메소드 선언
		// 리턴 타입 : void
		// 매개 변수 : String message
		System.out.println("상대방: " + message);
	}

	void hangUp() {
		// 메소드 선언
		// 리턴 타입 : void
		System.out.println("전화를 끊습니다.");
	}
}