package chap07.sec01.exam07.pack1;
//protected 접근 제한자 테스트

public class B {

	public void method() {
		// public 접근 제한자
		// 리턴 타입 : void
		A a = new A();
		// A 클래스의 객체를 참조하는 변수 a 선언
		// new 연산자와 A 클래스의 생성자로 인스턴스 생성 후 메모리 주소 저장
		a.field = "value";
		// a.로 A 클래스의 필드 접근
		// 문자열 리터럴 값 저장
		a.method();
		// a.로 A 클래스의 메소드 호출
	}
}