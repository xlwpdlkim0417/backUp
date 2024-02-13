package java_2024_01_22.page408_1;

public class A {
	static int field2; // 객체 생성 없어도 직접적 접근 가능

	class B {

		B() { // 클래스 B의 생성자 (클래스 이름과 동일)

		}

		int field1; // int 타입 필드
//		static int field2; // 클래스 B에 객체 생성이 되어야 선언 가능
		// The field field2 cannot be declared static in a non-static inner type, unless
		// initialized with a constant expression

		void method1() {

		}

//		static void method2() {
		// The method method2 cannot be declared static; static methods can only be
		// declared in a static or top level type

//		}
	}

	void methodA() { // 클래스A 내부의 methodA() 메소드
		B b = new B();
		b.field1 = 3;
		b.method1();

	}

}
//static을 어렵게 생각하지 말고 바로 사용 가능하다고 / 바로 접근 가능하다고 생각하면 됨 객체 생성 없이!