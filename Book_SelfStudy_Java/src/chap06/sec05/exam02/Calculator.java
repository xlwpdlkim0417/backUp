package chap06.sec05.exam02;
//정적 멤버 사용

public class Calculator {

	static double pi = 3.14159;
	// 정적 필드
	// double 타입 정적 필드 pi에
	// 실수 리터럴 값 저장

	static int plus(int x, int y) {
		// 정적 메소드
		// 리턴 타입 : int
		// 매개 변수 : int x, int y
		return x + y;
	}

	static int minus(int x, int y) {
		// 정적 메소드
		// 리턴 타입 : int
		// 매개 변수 : int x, int y
		return x - y;
	}
}