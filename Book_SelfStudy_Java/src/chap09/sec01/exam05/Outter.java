package chap09.sec01.exam05;
//중첩 클래스에서 바깥 클래스 참조 얻기

public class Outter {

	String field = "Outter-field";
	// Outter 클래스의 필드 선언

	void method() {
		// Outter 클래스의 메소드 선언
		System.out.println("Outter-method");
	}

	class Nested { // 인스턴스 멤버 클래스
		String field = "Nested-field";
		// 인스턴스 멤버 클래스의 필드 선언

		void method() {
			// 인스턴스 멤버 클래스의 메소드 선언
			System.out.println("Nested-method");
		}

		void print() {
			System.out.println(this.field);
			// this = 인스턴스 멤버 클래스의 중첩 객체
			// String field = "Nested-field";
			this.method();
			// this = 인스턴스 멤버 클래스의 중첩 객체
			// System.out.println("Nested-method");
			System.out.println(Outter.this.field);
			// this = 바깥 클래스의 바깥 객체
			// String field = "Outter-field";
			Outter.this.method();
			// this = 바깥 클래스의 바깥 객체
			// System.out.println("Outter-method");
		}
	}
}