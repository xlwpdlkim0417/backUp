package chap04.sec01.exam03;
//if-else if-else문

public class IfElseIfElseExample {

	public static void main(String[] args) {

		int score = 75; // int 타입 변수 score에 정수 리터럴 값 75

		if (score >= 90) { // if-else문 시작
			// 조건식 : int 타입 변수 score에 저장된 값이 90보다 크거나 같다
			// false
			System.out.println("점수가 100~90입니다.");
			System.out.println("등급은 A입니다.");
		} else if (score >= 80) { // if-else문 시작
			// 조건식 : int 타입 변수 score에 저장된 값이 80보다 크거나 같다
			// false
			System.out.println("점수가 80~89입니다.");
			System.out.println("등급은 B입니다.");
		} else if (score >= 70) { // if-else문 시작
			// 조건식 : int 타입 변수 score에 저장된 값이 70보다 크거나 같다
			// true
			System.out.println("점수가 70~79입니다.");
			System.out.println("등급은 C입니다.");
		} else { // else 실행블록 ▷ 이전 if-else문의 조건식에서 true가 되는 블록이 없을 경우 실행
			System.out.println("점수가 70 미만입니다.");
			System.out.println("등급은 D입니다.");
		} // if-else문 전체 종료
		System.out.println("올바른 숫자를 입력해주세요."); // main 메소드 내부 프린트문 ▷ 출력
	}
}