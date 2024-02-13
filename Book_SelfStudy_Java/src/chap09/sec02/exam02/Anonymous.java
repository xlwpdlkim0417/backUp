package chap09.sec02.exam02;
//익명 구현 객체 생성

public class Anonymous {

	RemoteControl field = new RemoteControl() {
		// RemoteControl 인터페이스 타입 필드 field 선언
		// 익명 구현 객체 생성 저장

		@Override
		public void turnOn() {
			System.out.println("TV를 켭니다.");
		}

		@Override
		public void turnOff() {
			System.out.println("TV를 끕니다.");
		}

	};

	void method1() {
		RemoteControl localVar = new RemoteControl() {
			// Anonymous 클래스의 method1() 메소드 내부
			// RemoteControl 인터페이스 타입 로컬 변수 localVar 선언
			// 익명 구현 객체 생성 저장

			@Override
			public void turnOn() {
				System.out.println("Audio를 켭니다.");
			}

			@Override
			public void turnOff() {
				System.out.println("Audio를 끕니다.");
			}

		};
		localVar.turnOn();
		// 익명 구현 객체의 turnOn() 메소드 실행
	}

	void method2(RemoteControl rc) {
		// Anonymous 클래스의 method2() 메소드 호출
		// 매개 변수 : RemoteControl rc
		rc.turnOn();
		// 매개 변수의 익명 구현 객체의 turnOn() 메소드 실행
	}
}