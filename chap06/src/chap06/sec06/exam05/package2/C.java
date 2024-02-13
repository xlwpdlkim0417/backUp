package sec06.exam05.package2;
//필드와 메소드의 접근 제한(3)

//package2

import sec06.exam05.package1.A; //패키지 달라서 import 필요

public class C {

	public C() {
		A a = new A();
		// A 클래스 의 객체를 참조하는 변수 a 선언
		// new 연산자와 A 클래스의 행성자로 인스턴스 생성 후 메모리 주소 저장

		a.field1 = 1; // (O)
//		a.field2 = 1; // (X) default 필드 접근 불가
		// The field A.field2 is not visible
		// 접근 제한자 default ▷ SAME PACKAGE
//		a.field3 = 1; // (X) private 필드 접근 불가
		// The field A.field3 is not visible
		// 접근 제한자 private ▷ SAME CLASS

		a.method1(); // (O)
//		a.method2(); // (X) default 메소드 접근 불가
		// The method method2() from the type A is not visible
//		a.method3(); // (X) private 메소드 접근 불가
		// The method method3() from the type A is not visible
	}
}