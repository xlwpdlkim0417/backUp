package chap03.sec02.exam10;
//대입 연산자

public class AssignmentOperatorExample {

	public static void main(String[] args) {

		int result = 0; // int 타입 변수 result에 정수 리터럴 값 0 저장

		result += 10; // int 타입 변수 result에 (int 타입 변수 result값 + 정수 리터럴 10) 연산식 값 저장 ▷ (0 + 10) ▷ 10
		System.out.println("result=" + result);

		result -= 5; // int 타입 변수 result에 (int 타입 변수 result값 - 정수 리터럴 5) 연산식 값 저장 ▷ (10 - 5) ▷ 5
		System.out.println("result=" + result);

		result *= 3; // int 타입 변수 result에 (int 타입 변수 result값 * 정수 리터럴 3) 연산식 값 저장 ▷ (5 * 3) ▷ 15
		System.out.println("result=" + result);

		result /= 5; // int 타입 변수 result에 (int 타입 변수 result값 / 정수 리터럴 5) 연산식 값 저장 ▷ (15 / 5) ▷ 3
		System.out.println("result=" + result);

		result %= 3; // int 타입 변수 result에 (int 타입 변수 result값을 정수 리터럴 3으로 나눈 나머지) 연산식 값 저장 ▷ (3 / 3)의
						// 나머지 ▷ 0
		System.out.println("result=" + result);
	}
}