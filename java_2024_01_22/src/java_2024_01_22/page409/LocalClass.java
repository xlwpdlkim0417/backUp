package page409;

public class LocalClass {

	void method() {
		class D {
			D() {
			}

			int field1;
//			static int field2; // 로컬 클래스 안에 static 필드 못만듭니다

			void method1() {
			}

//			static void method2() { // 로컬 클래스 안에 static 메소드 못만듭니다
//			}
		}
		D d = new D();
		d.field1 = 3;
		d.method1();
	}
}