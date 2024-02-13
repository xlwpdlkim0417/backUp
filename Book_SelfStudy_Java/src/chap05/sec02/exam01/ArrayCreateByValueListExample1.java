package chap05.sec02.exam01;
//값 목록으로 배열 생성

public class ArrayCreateByValueListExample1 {

	public static void main(String[] args) {

		int[] scores = { 83, 90, 87 };
		// int 타입 배열을 참조하는 참조 타입 변수 scores의 배열 객체에 목록 값 저장

		System.out.println("scores[0] : " + scores[0]);
		// int 타입 배열을 참조하는 참조 타입 변수 scores의 배열 객체 인덱스 0번 값 출력
		System.out.println("scores[1] : " + scores[1]);
		// int 타입 배열을 참조하는 참조 타입 변수 scores의 배열 객체 인덱스 1번 값 출력
		System.out.println("scores[2] : " + scores[2]);
		// int 타입 배열을 참조하는 참조 타입 변수 scores의 배열 객체 인덱스 2번 값 출력

		int sum = 0; // int 타입 변수 sum에 정수 리터럴 값 0 저장
		for (int i = 0; i < 3; i++) { // for문 시작
			// 초기화식 : int 타입 변수 i에 정수 리터럴 값 0 저장
			// 조건식 : int 타입 변수 i는 3보다 작다
			// 증감식 : int 타입 변수 i 증가 연산자
			sum += scores[i];
			// int 타입 변수 sum에 (int 타입 변수 sum + int 타입 배열을 참조하는 참조 타입 변수 scores의 배열 객체 인덱스
			// [i]값) 연산식 값 저장
		} // for문 종료
		System.out.println("총합 : " + sum);
		double avg = (double) sum / 3;
		// double 타입 변수 avg에 {(double)로 강제 타입 변환한 변수 sum / 정수 리터럴 3} 연산식 값 저장
		System.out.println("평균 : " + avg);
	}
}