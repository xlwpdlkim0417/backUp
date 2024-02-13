package chap05.sec02.exam04;
//배열의 length 필드

public class ArrayLengthExample {

	public static void main(String[] args) {

		int[] scores = { 83, 90, 87 };
		// int 타입 배열을 참조하는 참조 타입 변수 scores에 값 목록 저장

		int sum = 0; // int 타입 변수 sum에 0 저장
		for (int i = 0; i < scores.length; i++) { // for문 시작
			// 초기화식
			// 조건식 : int 타입 변수 i는 참조 타입 변수 scores가 참조하는 int 타입 배열 객체 길이보다 작다
			// 증감식
			sum += scores[i];
			// int 타입 변수 sum에 (sum + 참조 타입 변수 scores가 참조하는 int 타입 배열 객체 인덱스 [i]) 연산식 값 저장
		} // for문 종료
		System.out.println("총합 : " + sum);

		double avg = (double) sum / scores.length;
		// double 타입 변수 avg에 (double 타입) 강제 타입 변환한 int 타입 변수 sum / 참조 타입 변수 scores가 참조하는
		// int 타입 배열 객체의 길이
		System.out.println("평균 : " + avg);
	}
}