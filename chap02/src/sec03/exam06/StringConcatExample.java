package sec03.exam06;
//문자열 결합 연산

public class StringConcatExample {

	public static void main(String[] args) {

		// 숫자 연산
		int value = 10 + 2 + 8; // int 타입 변수 value에 10 + 2 + 8 연산식 값 저장
		// 숫자 + 숫자 + 숫자 ▷ 덧셈
		System.out.println("value: " + value); // int 타입 변수 value에 저장된 값 출력

		// 문자열 결합 연산
		String str1 = 10 + 2 + "8"; // String 타입 변수 str1에 10 + 2 + "8" 연산식 값 저장
		// 숫자 + 숫자 + 문자열 ▷ 숫자문자열
		// 12 + "8" ▷ "12" + "8" ▷ "128"
		System.out.println("str1: " + str1); // String 타입 변수 str1에 저장된 값 출력

		String str2 = 10 + "2" + 8; // String 타입 변수 str2에 10 + "2" + 8 연산식 값 저장
		// 숫자 + 문자열 + 숫자 ▷ 숫자문자열
		// "10" + "2" + 8 ▷ "102" + "8" ▷ "1028"
		System.out.println("str2: " + str2); // String 타입 변수 str2에 저장된 값 출력

		String str3 = "10" + 2 + 8; // String 타입 변수 str3에 "10" + 2 + 8 연산식 값 저장
		// 문자 + 숫자 + 숫자 ▷ 문자숫자열
		// "10" + "2" + 8 ▷ "102" + "8" ▷ "1028"
		System.out.println("str3: " + str3); // String 타입 변수 str3에 저장된 값 출력

		String str4 = "10" + (2 + 8); // String 타입 변수 str4에 "10" + (2 + 8) 연산식 값 저장
		// 문자 + (숫자 + 숫자) ▷문자숫자열
		// "10" + (10) ▷ "10" + "10" ▷ "1010"
		System.out.println("str4: " + str4); // String 타입 변수 str4에 저장된 값 출력
	}
}