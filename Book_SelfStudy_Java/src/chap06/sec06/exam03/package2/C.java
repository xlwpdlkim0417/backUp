package chap06.sec06.exam03.package2;

import chap06.sec06.exam03.package1.B;

//클래스의 접근 제한(3)


public class C {

//	A a;
	// A 클래스의 객체를 참조하는 필드 a 선언
	// A 클래스 접근 제한자 default ▷ SAME PACKAGE
	B b;
	// B 클래스의 객체를 참조하는 필드 b 선언
	// B 클래스 접근 제한자 public ▷ ALL FREE (필드 선언 + 생성자/메소드 내부에서 변수 선언)
}