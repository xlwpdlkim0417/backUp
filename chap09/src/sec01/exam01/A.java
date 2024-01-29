package sec01.exam01;
//중첩 클래스

/*바깥 클래스*/
public class A { // 바깥 클래스
	A() { // 바깥 클래스 A의 생성자
		System.out.println("A 객체가 생성됨");

	}

	class B { // 바깥 클래스 A $ 중첩 클래스 B
		B() { // 중첩 클래스 B의 생성자
			System.out.println("B 객체가 생성됨");
		}

		int field1;
		// 중첩 클래스가 인스턴스 멤버 클래스이므로 인스턴스 필드 선언 가능
//		static int field2;
		// The field field2 cannot be declared static in a non-static inner type, unless
		// initialized with a constant expression
		// 인스턴스 멤버 클래스는 정적 필드 선언 불가능

		void method1() {
			// 중첩 클래스가 인스턴스 멤버 클래스이므로 인스턴스 메소드 선언 가능

		}

//		static void method2() {
		// The method method2 cannot be declared static; static methods can only be
		// declared in a static or top level type
		// 인스턴스 멤버 클래스는 정적 메소드 선언 불가능

//		}
	}

	/* 정적 멤버 클래스 */
	static class C { // 바깥 클래스 A $ 중첩 클래스 C
		C() { // 중첩 클래스 C의 생성자
			System.out.println("C 객체 생성됨");
		}

		int field1;
		// 정적 멤버 클래스 C의 인스턴스 필드 선언
		static int field2;
		// 정적 멤버 클래스 C의 정적 필드 선언

		void method1() {
			// 정적 멤버 클래스 C의 인스턴스 메소드 선언

		}

		static void method2() {
			// 정적 멤버 클래스 C의 정적 메소드 선언

		}
	}

	/* 로컬 클래스 */
	void method() { // 바깥 클래스 A의 메소드 선언
		class D { // 바깥 클래스 A $1 로컬 클래스 D
			D() { // 로컬 클래스 D의 생성자
				System.out.println("D 객체 생성됨");
			}

			int field1;

			// 로컬 클래스의 인스턴스 필드 선언
//			static int field2;
			// The field field2 cannot be declared static in a non-static inner type, unless
			// initialized with a constant expression
			// 로컬 클래스는 정적 필드 선언 불가능

			void method1() {
				// 로컬 클래스의 인스턴스 메소드 선언

			}

//			static void method2() {
			// The method method2 cannot be declared static; static methods can only be
			// declared in a static or top level type
			// 로컬 클래스의 정적 메소드 선언
//			}
		}
		D d = new D();
		// D 로컬 클래스의 객체를 참조하는 변수 d 선언
		// D 로컬 클래스의 생성자로 인스턴스 생성 후 메모리 주소 저장
		d.field1 = 3;
		// 변수 d.로 D 로컬 클래스의 인스턴스 필드에 접근
		d.method1();
		// 변수 d.로 D 로컬 클래스의 인스턴스 메소드 호출
	}
}