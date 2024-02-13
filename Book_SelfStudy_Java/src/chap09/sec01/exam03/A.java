package chap09.sec01.exam03;
//멤버 클래스에서 사용 제한

public class A {

	int field1;

	void method1() {
	}

	static int field2;

	static void method2() {
	}

	class B { // 모든 필드와 메소드에 접근할 수 있음
		// 인스턴스 멤버 클래스 B
		void method() {
			field1 = 10;
			method1();

			field2 = 10;
			method2();
		}
	}

	static class C { // 인스턴스 필드와 메소드는 접근할 수 없음
		// 정적 멤버 클래스 C
		void method() {
//			field1 = 10;
			// Cannot make a static reference to the non-static field field1
//			method1();
			// Cannot make a static reference to the non-static method method1() from the
			// type A

			field2 = 10;
			method2();
		}
	}
}
// 바깥 클래스에서 정의된 인스턴스 필드/메소드는 인스턴스 멤버 클래스 내부에서 선언/호출/접근 가능
// 바깥 클래스에서 정의된 정적 필드/메소드는 인스턴스 멤버 클래스 내부에서 선언/호출/접근 가능
// 바깥 클래스에서 정의되지 않은 인스턴스 필드/메소드는 인스턴스 멤버 클래스 내부에서 선언/호출/접근 가능
// 바깥 클래스에서 정의되지 않은 정적 필드/메소드는 인스턴스 멤버 클래스 내부에서 선언/호출/접근 불가

// 바깥 클래스에서 정의된 인스턴스 필드/메소드는 정적 멤버 클래스 내부에서 선언/호출/접근 불가
// 바깥 클래스에서 정의된 정적 필드/메소드는 정적 멤버 클래스 내부에서 선언/호출/접근 가능
// 바깥 클래스에서 정의되지 않은 인스턴스 필드/메소드는 정적 멤버 클래스 내부에서 선언/호출/접근 가능
// 바깥 클래스에서 정의되지 않은 정적 필드/메소드는 정적 멤버 클래스 내부에서 선언/호출/접근 가능