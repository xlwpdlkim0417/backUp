package sec02.exam05;
//구구단 출력하기

public class ForMultiplicationTableExample {

	public static void main(String[] args) {

		for (int m = 2; m <= 9; m++) { // 바깥 for문 시작
			// 초기화식 : int 타입 변수 m에 정수 리터럴 값 2 저장
			// 조건식 : int 타입 변수 m은 정수 리터럴 9보다 작거나 같다
			// 증감식 : int 타입 변수 m 증가 연산식
			System.out.println("***" + m + "단 ***");
			for (int n = 1; n <= 9; n++) { // 중첩 for문 시작
				// 초기화식 : int 타입 변수 n에 정수 리터럴 값 1 저장
				// 조건식 : int 타입 변수 n은 정수 리터럴 9보다 작거나 같다
				// 증감식 : int 타입 변수 n 증가 연산식
				System.out.println(m + " X " + n + " = " + (m * n));
			} // 중첩 for문 종료
		} // 바깥 for문 종료
	}
}
// 바깥 for문 실행할 때마다 중첩 for문은 지정된 횟수(=조건식)만큼 반복 실행 후 바깥 for문으로 돌아감