package java_2024_01_22.sec01.exam02;

public class A {

	int x;
	static int y;

	// 타입은 동일한데 하나는 static이 붙었고 하나는 아니잖음?
	// 그래서 취급이 다름

	B field1 = new B();
	C field2 = new C();

	static B field3 = new A().new B(); // A도 객체 생성하고 B의 객체 생성하면 B 클래스를 static으로 만들 수 있음
//	static B field3 = new B();
	// No enclosing instance of type A is accessible. Must qualify the allocation
	// with an enclosing instance of type A (e.g. x.new A() where x is an instance
	// of A).

	// 원래 클래스B는 static이 아니기 때문에 객체 생성이 되어야 갖다 쓸 수 있음??
	// A가 객체 생성이 되어야 B도 객체 생성이 된다

	static C field4 = new C();

	void method() {
		B var1 = new B();
		C var2 = new C();

	}

	static void method2() {
//		B var1 = new B(); // 클래스A에서 객체를 생성해야 B의 객체 생성이 가능하고 이 부분의 오류가 사라짐
		B var1 = new A().new B(); // A의 객체를 만들면서 동시에 B의 객체를 만드는 것
		// No enclosing instance of type A is accessible. Must qualify the allocation
		// with an enclosing instance of type A (e.g. x.new A() where x is an instance
		// of A).
		C var2 = new C();
	}

	class B { // 인스턴스 멤버 클래스
	}

	static class C { // static 멤버 클래스
	}
}
