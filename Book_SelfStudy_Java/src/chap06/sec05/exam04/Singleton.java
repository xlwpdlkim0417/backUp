package chap06.sec05.exam04;
//싱글톤

public class Singleton {

	private static Singleton singleton = new Singleton();
	// Singleton 클래스의 정적 필드 선언
	// new 연산자와 Singleton 클래스의 생성자로 인스턴스 생성
	// 필드 선언 + 객체 생성
	// private 접근 제한자 ▷ 외부 클래스에서 접근 제한

	private Singleton() {
		// Singleton 클래스의 생성자에 private 접근 제한자
		// 외부에서 생성자 호출 불가능 ▷ 객체 생성 제한

	}

	static Singleton getInstance() {
		// 외부 클래스에서 Singleton 클래스의 인스턴스에 접근할 수 있도록 정적 메소드 선언
		// 리턴 타입 : Singleton
		// 정적 메소드인 이유는? ▷ 인스턴스 메소드이면 객체를 생성해야 호출할 수 있음 ▷ Not Singleton
		return singleton;
		// 외부에서 접근할 수 있도록
	}
}