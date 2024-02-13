package sec01.exam02;
//바깥 필드와 메소드에서 사용 제한

public class A {

	// 인스턴스 필드
	B field1 = new B();
	// 인스턴스 멤버 클래스 B의 객체를 참조하는 필드 field1 선언
	// 내부 인스턴스 멤버 클래스는 바깥 클래스의 인스턴스 필드에 접근 가능
	C field2 = new C();
	// 내부 정적 멤버 클래스는 바깥 클래스의 인스턴스 필드에 접근 가능

	// 인스턴스 메소드
	void method1() {
		B var1 = new B();
		// 내부 인스턴스 멤버 클래스는 바깥 클래스의 인스턴스 메소드에 접근 가능
		C var2 = new C();
		// 내부 정적 멤버 클래스는 바깥 클래스의 인스턴스 메소드에 접근 가능
	}

	// 정적 필드 초기화
//	static B field3 = new B();
	// No enclosing instance of type A is accessible. Must qualify the allocation
	// with an enclosing instance of type A (e.g. x.new A() where x is an instance
	// of A).
	// 내부 인스턴스 멤버 클래스는 바깥 클래스의 정적 필드에 접근 불가
	static C field4 = new C();
	// 내부 정적 멤버 클래스는 바깥 클래스의 정적 필드에 접근 가능

	// 정적 메소드
	static void method2() {
//		B var1 = new B();
		// No enclosing instance of type A is accessible. Must qualify the allocation
		// with an enclosing instance of type A (e.g. x.new A() where x is an instance
		// of A).
		// 내부 인스턴스 멤버 클래스는 바깥 클래스의 정적 메소드에 접근 불가
		C var2 = new C();
		// 내부 정적 멤버 클래스는 바깥 클래스의 정적 메소드에 접근 가능
	}

	// 인스턴스 멤버 클래스
	class B {

	}

	// 정적 멤버 클래스
	static class C {

	}
}