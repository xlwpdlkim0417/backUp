package chap06.sec06.exam04.package1;
//생성자의 접근 제한 (1)
//package1

public class A {

	// 필드

	A a1 = new A(true); // (O)
	// A 클래스의 객체를 참조하는 필드 a1 선언
	// new 연산자와 A 클래스 생성자로 인스턴스 생성 후 메모리 주소 저장
	// 매개 변수 : true
	A a2 = new A(1); // (O)
	// A 클래스의 객체를 참조하는 필드 a2 선언
	// new 연산자와 A 클래스 생성자로 인스턴스 생성 후 메모리 주소 저장
	// 매개 변수 : 1
	A a3 = new A("문자열"); // (O)
	// A 클래스의 객체를 참조하는 필드 a3 선언
	// new 연산자와 A 클래스 생성자로 인스턴스 생성 후 메모리 주소 저장
	// 매개 변수 : "문자열"

	// 생성자 오버로딩

	public A(boolean b) {
		// 생성자 선언
		// public 접근 제한자 : ALL FREE
		// 매개변수 : boolean b

	}

	A(int b) {
		// 생성자 선언
		// default 접근 제한자 : SAME PACKAGE
		// 매개변수 : int b

	}

	private A(String s) {
		// 생성자 선언
		// private 접근 제한자 ▷ SAME CLASS
		// 매개 변수 : String s
	}
}