package sec04.exam02;
//매개 변수의 개수를 모를 경우

public class Computer {

	int sum1(int[] values) { // 메소드
		// 리턴 타입 : int
		// 매개 변수 : int 타입 배열 values
		// 메소드 실행 블록

		int sum = 0;

		for (int i = 0; i < values.length; i++) {
			// 초기화값
			// 조건식 : int 타입 i는 int 타입 배열 values 길이보다 작다
			// 증감식
			sum += values[i];
			// sum에 (sum + int 타입 배열 values[인덱스]) 연산식 값 저장
		}
		return sum; // 메소드 결과값 리턴

	} // 메소드 종료

	int sum2(int... values) { // 메소드
		// 리턴 타입 : int
		// 매개 변수 : int 타입 배열 values
		// 메소드 실행 블록
		int sum = 0;
		for (int i = 0; i < values.length; i++) {
			// 초기화값
			// 조건식 : int 타입 i는 int 타입 배열 values 길이보다 작다
			// 증감식
			sum += values[i];
			// sum에 (sum + int 타입 배열 values[인덱스]) 연산식 값 저장
		}
		return sum; // 메소드 결과값 리턴
	} // 메소드 종료
}
// sum1()과 sum2() 메소드의 실행문이 완전 일치하는 것을 볼 수 있습니다.
// 매개 변수의 선언 방법만 다를 뿐이지 매개 변수의 타입이 배열이므로 처리 내용이 같을 수밖에 없습니다.