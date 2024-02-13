package chap04.sec02.exam02;
//1부터 100까지 합을 출력

public class ForSumFor1To100Example1 {

	public static void main(String[] args) {

		int sum = 0; // int 타입 변수 sum에 정수 리터럴 값 0 저장

		for (int i = 1; i <= 100; i++) { // for문 시작
			// 초기화식 : int 타입 변수 i에 정수 리터럴 값 1 저장
			// 조건식 : int 타입 변수 i는 정수 리터럴 100보다 작거나 같다
			// 증감식 : int 타입 변수 i 증가 연산식
			sum += i; // int 타입 변수 sum에 (int 타입 변수 sum + int 타입 변수 i) 값 저장 ▷ 조건식 false 될 때까지
		} // for문 종료
		System.out.println("1~100 합 : " + sum);
	}
}