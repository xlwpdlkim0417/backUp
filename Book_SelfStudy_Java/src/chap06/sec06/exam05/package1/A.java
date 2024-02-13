package chap06.sec06.exam05.package1;
//필드와 메소드의 접근 제한(1)

//package1

public class A {

	// 필드

	public int field1;
	// 필드 선언
	// public 접근 제한자 ▷ ALL FREE
	int field2;
	// 필드 선언
	// default 접근 제한자 ▷ SAME PACKAGE
	private int field3;
	// 필드 선언
	// private 접근 제한자 ▷ SAME CLASS

	// 생성자

	public A() {
		// 생성자 선언

		field1 = 1; // (O) 클래스 내부일 경우 접근 제한자의 영향을 받지 않음
		field2 = 1; // (O)
		field3 = 1; // (O)

		method1(); // (O) 클래스 내부일 경우 접근 제한자의 영향을 받지 않음
		method2(); // (O)
		method3(); // (O)

	}

	public void method1() {
		// 메소드 선언
		// public 접근 제한자 ▷ ALL FREE

	}

	void method2() {
		// 메소드 선언
		// default 접근 제한자 ▷ SAME PACKAGE

	}

	private void method3() {
		// 메소드 선언
		// private 접근 제한자 ▷ SAME CLASS
	}
}