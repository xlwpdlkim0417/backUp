package sec06.exam04.package2;
//생성자의 접근 제한 (3)

//package2

import sec06.exam04.package1.A; // 패키지가 달라서 import 필요

public class C {

	// 필드

	A a1 = new A(true); // (O)
//	A a2 = new A(1); // (X) default 생성자 접근 불가
	// The constructor A(int) is not visible
	// default 접근 제한자 ▷ SAME PACKAGE
//	A a3 = new A("문자열"); // (X) private 생성자 접근 불가
	// The constructor A(String) is not visible
	// private 접근 제한자 ▷ SAME CLASS
}