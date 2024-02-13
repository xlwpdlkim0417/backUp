package chap03.sec02.exam07;
//비교 연산자

public class CompareOperatorExample1 {

	public static void main(String[] args) {

		int num1 = 10; // int 타입 변수 num1에 정수 리터럴 값 10 저장
		int num2 = 10; // int 타입 변수 num2에 정수 리터럴 값 10 저장

		boolean result1 = (num1 == num2); // boolean 타입 변수 result1에 (괄호) 내부 비교 연산식의 결과에 따라 true/false 값 저장
		// 10 같다 10 ▷ true
		boolean result2 = (num1 != num2); // boolean 타입 변수 result2에 (괄호) 내부 비교 연산식의 결과에 따라 true/false 값 저장
		// 10 다르다 10 ▷ false
		boolean result3 = (num1 <= num2); // boolean 타입 변수 result3에 (괄호) 내부 비교 연산식의 결과에 따라 true/false 값 저장
		// 10이 작거나 같다 10보다 ▷ true

		System.out.println("result1=" + result1);
		System.out.println("result2=" + result2);
		System.out.println("result3=" + result3);

		char char1 = 'A'; // char 타입 변수 char1에 문자 리터럴 'A' 값 저장 ▷ 65
		char char2 = 'B'; // char 타입 변수 char2에 문자 리터럴 'B' 값 저장 ▷ 66
		boolean result4 = (char1 < char2); // boolean 타입 변수 result4에 (괄호) 내부 연산식 결과에 따라 true/false 값 저장
		// ('A' < 'B') ▷ 65 < 66 ▷ True
		System.out.println("result4=" + result4);
	}
}