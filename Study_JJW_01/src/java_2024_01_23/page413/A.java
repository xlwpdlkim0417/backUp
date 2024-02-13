package java_2024_01_23.page413;

public class A {

	public static void main(String[] args) {

		B b = new B(); // static이라 A가 객체 생성 못해도 B가 ㅐㄱㄱ

		A a = new A();
//		B b = a.new B();
//		B c = new A().new B();
//		b.method();

		System.out.println("실행");

	}

	int field1; // STATIC으로 B가 객체 생성한다고 해도 이건 못씀 왜?
	// 이거는 클래스 A의 인스턴스 멤버라 객체 생성 안하면 못씀

	void method1() {
		System.out.println("method1()");

	}

	static class B { // A 클래스 생성되지 않아도 단독 생성 가능 (객체 이야기인듯)
		void method() {

//			field1 = 10;
//			method1();
//			System.out.println("method() ," + field1);
		}
	}

}
