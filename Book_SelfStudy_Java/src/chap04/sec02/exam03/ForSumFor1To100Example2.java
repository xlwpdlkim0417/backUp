package chap04.sec02.exam03;
//1부터 100까지 합 출력

public class ForSumFor1To100Example2 {

	public static void main(String[] args) {

		int sum = 0; // int 타입 변수 sum에 정수 리터럴 값 0 저장

		int i = 0; // int 타입 변수 sum에 정수 리터럴 값 0 저장

		for (i = 1; i <= 100; i++) { // for문 시작
			// 초기화식 : int 타입 변수 i에 정수 리터럴 값 1 저장
			// 조건식 : int 타입 변수 i는 정수 리터럴 100보다 작거나 같다
			// 증감식 : int 타입 변수 증가 연산식
			sum += i; // int 타입 변수 sum에 (int 타입 변수 sum + int 타입 변수 i) 연산식 값 저장 ▷ 조건식 false 될 때까지
		} // for문 종료
		System.out.println("1~" + (i - 1) + " 합 : " + sum);
	}
}
// 여기서 주목할 점
// for문이 종료됐는데 for문 내부의 초기화 식에서 사용했던 int 타입 변수 i를 사용할 수 있었던 이유는?
// int 타입 변수 i 선언과 초기화는 최초에 for문 외부에서 실행되었음 ▷ for문을 벗어나도 사용 가능
// 여기서 int 타입 변수 i를 "루프 카운터 변수"라고 함 ▷ 반복문에서 사용되는 변수 ▷ 루프 카운터 변수는 주로 반복문 내에서 반복의 횟수를 추적하거나 배열의 인덱스를 조작하는 데 사용됩니다