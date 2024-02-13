package chap07.sec01.exam07.pack2;
//protected 접근 제한자 테스트

import chap07.sec01.exam07.pack1.A;

public class C {

	public void method() {
		// public 접근 제한자
		// 리턴 타입 : void

//		A a = new A();
		// The constructor A() is not visible
		// A 클래스의 생성자가 protected 접근 제한자 ▷ SAME PACKAGE CHILD CLASS
//		a.field = "value";
		// The field A.field is not visible
		// A 클래스의 생성자/필드가 protected 접근 제한자 ▷ SAME PACKAGE CHILD CLASS
//		a.method();
		// The method method() from the type A is not visible
		// A 클래스의 생성자/메소드가 protected 접근 제한자 ▷ SAME PACKAGE CHILD CLASS
	}
}