package chap04.sec02.exam01;
//1부터 10까지 출력

public class ForPrintFrom1To10Example {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) { // for문 시작
			// 초기화식 : int 타입 변수 i에 정수 리터럴 값 1저장
			// 조건식 : int 타입 변수 i는 정수 리터럴 10보다 작거나 같다
			// 증감식 : int 타입 변수 i 증가 연산식
			System.out.println(i);
		} // for문 종료
	}
}