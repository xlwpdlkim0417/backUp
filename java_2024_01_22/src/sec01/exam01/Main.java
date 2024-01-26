package sec01.exam01;
// 중첩 클래스 (인스턴스 클래스 / 정적 클래스) 이걸로 정리하면 됨

public class Main {

	public static void main(String[] args) {

		A a = new A();
		A.B b = a.new B();
		b.field1 = 3;
		b.method1();

		A.C.field2 = 3; // 객체 생성과 상관없이 접근 및 사용 가능
		A.C.method2(); // 객체 생성과 상관없이 접근 및 사용 가능

		A.C c = new A.C(); // 이건 static 클래스임
		c.field1 = 3;
		c.method1();

		a.method();

	}

}
