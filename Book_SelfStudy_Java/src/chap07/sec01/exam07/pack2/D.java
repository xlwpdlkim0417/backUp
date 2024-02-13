package chap07.sec01.exam07.pack2;
//protected 접근 제한자

import chap07.sec01.exam07.pack1.A;

public class D extends A { // 상속
	// public 클래스
	// 부모 클래스 : A
	// 자식 클래스 : D
	public D() {
		// D 클래스의 생성자
		super();
		// 부모 클래스 생성자 호출
		this.field = "value";
		// 상속받은 A 클래스의 필드에 문자열 리터럴 저장
		this.method();
		// 상속받은 A 클래스의 method() 호출
	}
}