package chap09.sec02.exam02;

public class AnonymousExample {

	public static void main(String[] args) {

		Anonymous anony = new Anonymous();

		// 익명 객체 필드 사용
		anony.field.turnOn();
		// Anonymous 클래스의 인스턴스 필드에 접근
		// 저장되어 있는 익명 구현 객체의 turnOn() 호출

		// 익명 객체 로컬 변수 사용
		anony.method1();
		// Anonymous 클래스의 method1() 호출
		// RemoteControl 인터페이스 타입 로컬 변수 localVar 선언
		// 익명 구현 객체 생성 후 turnOn() 메소드 실행

		// 익명 객체 매개값 사용
		anony.method2(new RemoteControl() {
			// Anonymous 클래스의 method2() 메소드 호출
			// 매개 변수 : new RemoteControl()로 시작하는 익명 구현 객체
			// 익명 구현 객체에서 재정의한 turnOn() 메소드 실행

			@Override
			public void turnOn() {
				System.out.println("Smart TV를 켭니다.");
			}

			@Override
			public void turnOff() {
				System.out.println("Smart TV를 끕니다.");
			}

		});
	}
}