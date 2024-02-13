package chap05.sec02.exam02;
//값 목록으로 배열 생성

public class ArrayCreateByValueListExample2 {

	public static int add(int[] scores) {
		// pulic 접근 제한자 ▷ 정적 ▷ 리턴 ▷ 메소드 ▷ 매개값 : 참조 타입 변수 scores에 int 타입 배열 객체 생성 저장

		int sum = 0; // int 타입 변수 sum에 정수 리터럴 값 0 저장
		for (int i = 0; i < 3; i++) { // for문 시작
			// 초기화값 : int 타입 변수 i에 정수 리터럴 값 0 저장
			// 조건식 : int 타입 변수 i는 정수 리터럴 닶 3보다 작다
			// 증감식 : int 타입 변수 i 증가 연산식
			sum += scores[i];
			// int 타입 변수 sum에 {(int 타입 변수 sum + int 타입 배열을 참조하는 참조 타입 변수 scores의 배열 객체 인덱스
			// [i]값} 연산식 값 저장
		} // for문 종료
		return sum; // add() 메소드 결과값 리턴
	}

	public static void main(String[] args) {

		int[] scores; // int 타입 배열을 참조하는 참조 타입 변수 scores 선언
		scores = new int[] { 83, 90, 87 };
		// int 타입 배열을 참조하는 참조 타입 변수 scores에 new 연산자로 int 타입 배열 객체 생성 후 값 목록 저장
		int sum1 = 0; // int 타입 변수 sim1에 정수 리터럴 값 = 저장
		for (int i = 0; i < 3; i++) { // for문 시작
			// 초기화식 : int 타입 변수 i에 정수 리터럴 값 0 저장
			// 조건식 : int 타입 변수 i는 정수 리터럴 3보다 작다
			// 증감식 : int 타입 변수 i 증가 연산자
			sum1 += scores[i];
			// int 타입 변수 sum1에 {(int 타입 변수 sum1 + int 타입 배열을 참조하는 참조 타입 변수 scores의 배열 객체
			// 인덱스[i] 값) 연산식 값 저장}
		} // for문 종료
		System.out.println("총합 : " + sum1);

		int sum2 = add(new int[] { 83, 90, 87 });
		// add 글자 모양 ▷ static ▷ 메소드() 직접 호출
		// int 타입 변수 sum2에 new 연산자로 값 목록 저장하는 int 타입 배열 객체 생성 후 add() 메소드의 매개변수로 활용 저장

		System.out.println("총합 : " + sum2);
		System.out.println();
	}
}