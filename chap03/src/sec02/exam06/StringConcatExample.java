package sec02.exam06;
// 문자열 결합 연산자

public class StringConcatExample {

	public static void main(String[] args) {

		String str1 = "JDK" + 6.0; // String 타입 변수 str1에 (문자열 + 실수 리터럴) 연산식 값 저장
		// "JDK" + "6.0" ▷ "JDK6.0"
		String str2 = str1 + " 특징"; // String 타입 변수 str2에 (String 타입 변수 + 문자열) 연산식 값 저장
		// "JDK6.0" + " 특징" ▷ "JDK6.0 특징"
		System.out.println(str2);

		String str3 = "JDK" + 3 + 3.0; // String 타입 변수 str3에 (문자열 + 정수 리터럴 + 실수 리터럴) 연산식 값 저장
		// "JDK" + "3" + 3.0 ▷ "JDK3" + "3.0" ▷ "JDK33.0"
		String str4 = 3 + 3.0 + "JDK"; // String 타입 변수 str4dp (정수 리터럴 + 실수 리터럴 + 문자열) 연산식 값 저장
		// 6.0 + "JDK" ▷ "6.0" + "JDK" ▷ "6.0JDK"
		System.out.println(str3);
		System.out.println(str4);
	}
}