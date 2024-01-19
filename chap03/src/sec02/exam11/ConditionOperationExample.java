package sec02.exam11;
//삼항 연산자

public class ConditionOperationExample {

	public static void main(String[] args) {

		int score = 85; // int 타입 변수 score에 정수 리터럴 값 85 저장
		char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C'); // char 타입 변수 grade에 삼항연산식 값 저장
		// 괄호가 있는 부분을 먼저 처리

		// 조건문 : int 타입 변수 score 값이 80보다 크다
		// true ▷ char 타입 변수 grade에 리터럴 값 'B' 저장할 준비
		// false ▷ char 타입 변수 grade에 문자 리터럴 값 'C' 저장할 준비

		// 조건문 true

		// 조건문 : int 타입 변수 score 값이 90보다 크다
		// true ▷ char 타입 변수 grade에 문자 리터럴 'A' 저장
		// false ▷ char 타입 변수 grade에 문자 리터럴 값 'B' 저장

		// 조건문 false

		System.out.println(score + "점은 " + grade + "등급입니다.");
	}
}