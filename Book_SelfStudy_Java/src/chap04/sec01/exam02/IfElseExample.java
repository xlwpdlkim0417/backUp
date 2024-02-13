package chap04.sec01.exam02;
//if-else문

public class IfElseExample {

	public static void main(String[] args) {

		int score = 85; // int 타입 변수 score에 정수 리터럴 값 85 저장

		if (score >= 90) { // if-else문 시작
			// 조건식 : int 타입 변수 score가 90보다 크거나 같다
			// false ▷ else 블록 실행
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다.");

		} else { // else 블록
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B입니다.");
		} // if-else문 종료
	}
}