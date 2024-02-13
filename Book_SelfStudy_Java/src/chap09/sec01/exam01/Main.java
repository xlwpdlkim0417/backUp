package chap09.sec01.exam01;
//중첩 클래스의 객체 생성

public class Main {

	public static void main(String[] args) {
		A a = new A();

		// 인스턴스 멤버 클래스 객체 생성
		// 바깥 클래스 A 외부에서 인스턴스 멤버 클래스 B의 객체 생성하려면?
		// 먼저 클래스 A의 객체를 생성하고 클래스 B의 객체를 생성해야 함
		A.B b = a.new B();
//		A.B b = new A().new B(); // 위의 내용은 이렇게 이해하면 편함
		b.field1 = 3;
		b.method1();

		// 정적 멤버 클래스 객체 생성
		A.C c = new A.C();
		// 바깥 클래스 A 외부에서 정적 멤버 클래스 C의 객체 생성하려면?
		// 곧바로 C 객체 생성
		c.field1 = 3;
		c.method1();
		A.C.field2 = 3; // 정적 멤버 클래스.필드로 필드값 접근
		A.C.method2();

		// 로컬 클래스 객체 생성을 위한 메소드 호출
		a.method();
	}
}