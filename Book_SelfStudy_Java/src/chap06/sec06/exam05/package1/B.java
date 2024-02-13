package chap06.sec06.exam05.package1;
//필드와 메소드의 접근 제한(2)

//package1

public class B {

	public B() {
		A a = new A();
		// A 클래스의 객체를 참조하는 변수 a 선언
		// new 연산자롸 A 클래스의 생성자로 인스턴스 생성 후 메모리 주소 저장
		// 왜 객체 생성을 해줬을까?
		// 외부 클래스에서 인스턴스 멤버에 접근하려면 객체 생성 필요
		a.field1 = 1; // (O)
		a.field2 = 1; // (O)
//		a.field3 = 1; // (X) private 필드 접근 불가
		// The field A.field3 is not visible

		a.method1(); // (O)
		a.method2(); // (O)
//		a.method3(); // (X) private 메소드 접근 불가
		// The method method3() from the type A is not visible
	}
}