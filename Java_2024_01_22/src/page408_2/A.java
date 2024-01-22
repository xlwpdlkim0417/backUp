package page408_2;

public class A {
	static class C {
		C() { // 클래스 C의 생성자
		}

		int field1;
		static int field2;

		void method1() {
		}

		static void method2() {
		}
	}

	void methodA() {
		C c = new C();
		c.field1 = 3;
		c.field2 = 10; // 이거 제대로 쓰라고 노란색 줄 준거임 static이라서 클래스 + 도트연산자로 불러올 수 있음 그게 아래임
		C.field2 = 10;
	}
}