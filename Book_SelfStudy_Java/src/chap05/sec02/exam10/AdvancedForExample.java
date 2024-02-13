package chap05.sec02.exam10;
//향상된 for문

public class AdvancedForExample {

	public static void main(String[] args) {

		int[] scores = { 95, 71, 84, 93, 87 };
		// int 타입 배열을 참조하는 참조 변수 scores에
		// 배열 객체 생성 후 값 목록 저장

		int sum = 0; // int 타입 변수 sum에 0 저장
		for (int score : scores) {
			// 타입 변수 : int 타입 변수 scrore에 참조 변수 scores가 참조하는 배열 객체 값 저장
			sum = sum + score;
			// sum += score; 라고 쓰지 않고 이렇게 굳이 쓴 이유가 있을까?
			// 참조 변수 scores가 참조하는 배열 객체 인덱스 처음부터 끝까지 반복하여 합산
		}
		System.out.println("점수 총합 = " + sum);

		double avg = (double) sum / scores.length;
		// double 타입 변수 avg에
		// (double 타입으로) 강제 타입 변환한 int 타입 변수 sum / 참조 변수 scores가 참조하는 배열 객체의 길이
		System.out.println("점수 평균 = " + avg);
	}
}