package sec04.exam01;
//메소드 선언

public class Calculator {

	// 메소드
	void powerOn() {
		// 리턴타입 : void
		// 매개변수 :
		// 메소드 실행 블록 시작
		System.out.println("전원을 켭니다.");
	} // 메소드 실행 블록 종료

	int plus(int x, int y) {
		// 리턴타입 : int
		// 매개 변수 : int x, int y
		// 메소드 실행 블록 시작
		int result = x + y;
		return result; // 메소드 결과값 리턴
	} // 메소드 실행 블록 종료

	double divide(int x, int y) {
		// 리턴 타입 : double
		// 매개변수 : int x, int y
		// 메소드 실행 블록 시작
		double result = (double) x / (double) y;
		return result; // 메소드 결과값 리턴
	} // 메소드 실행 블록 종료

	void powerOff() {
		// 리턴 타입 : void
		// 매개 변수 :
		// 메소드 실행 블록 시작
		System.out.println("전원을 끕니다.");
	} // 메소드 실행 블록 종료
}