package java_2024_01_22.sec01.exam01;

public class A {
	A() {
		System.out.println("A 객체 생성");
	}

	class B {
		B() {
			System.out.println("B 객체 생성");
		}

		int field1; // 중첩클래스 B의 필드값
//		static field2;	//중첩 클래스가 static 클래스면 가능한데 아니니까 안됨

		void method1() { // method도 static 붙은 건 안됨

		}

	}

	static class C { // 클래스A 내부의 정적클래스C
		C() {
			System.out.println("C 객체 생성");
		}

		int field1;
		static int field2;

		void method1() {

		}

		static void method2() {

		}

	}

	void method() { // 클래스A 내부의 메소드

		class D {
			D() {
				System.out.println("D 객체 생성");

			}

			int field1; // 로컬 변수
//			static int field2; // static 없어서 안됨

			void method() { // method()도 static 없어서 안됨

			}
		}
	}

}
