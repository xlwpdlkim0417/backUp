package sec01.exam01;
//if문

public class IfExample {

	public static void main(String[] args) {

		int score = 93; // int 타입 변수 score에 정수 리터럴 값 93 저장

		if (score >= 90) { // if문 시작
			// 조건식 : int 타입 변수 score 값이 정수 리터럴 90보다 크거나 같다
			// 조건식 true
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다.");
		} // if문 종료

		if (score < 90) // if문 시작 (괄호 없이 시작 가능)
			// 조건식 : int 타입 정수 score가 90보다 작다
			// false
			System.out.println("점수가 90보다 작습니다."); // if문 종료
		System.out.println("등급은 B입니다."); // main 메소드 내부의 print문으로 조건 없이 출력
	}
}