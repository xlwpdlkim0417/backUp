package chap02.sec03.exam05;

public class OperationsPromotionExample {

	public static void main(String[] args) {

		byte byteValue1 = 10; // byte 타입 변수 byteValue1에 정수 리터럴 값 10 저장
		byte byteValue2 = 20; // byte 타입 변수 byteValue2에 정수 리터럴 값 20 저장

//		byte byteValue3 = byteValue1 + byteValue1;	//Type mismatch: cannot convert from int to byte
		// byte 타입 변수 byteValue3에 (byte 타입 변수 byteValue1 + byte 타입 변수 byteValue2) 연산식 값
		// 저장
		// 연산 전 (괄호) 내부의 모든 타입은 int 타입으로 자동 변환
		// byte 타입 변수 byteValue3에 int 타입 값 저장 시도 ▷ 컴파일 에러

		int intValue1 = byteValue1 + byteValue2; // int 타입 변수 intValue1에 (byte 타입 변수 byteValue1 + byte 타입 변수 byteValue2)
													// 연산식의 값을 저장
		// 연산 전 (괄호) 내부의 모든 타입은 int 타입으로 자동 변환

		System.out.println(intValue1); // int 타입 변수 intValue1에 저장된 값 출력

		char charValue1 = 'A'; // char 타입 변수 charValue1에 문자 리터럴 'A' 저장
		char charValue2 = 1; // char 타입 변수 charValue2에 정수 리터럴 값 1 저장

//		char charValue3 = charValue1 + charValue2;	//Type mismatch: cannot convert from int to char
		// char 타입 변수 charValue3에 (char 타입 변수 charValue1 + char 타입 변수 charValue2) 연산식 값
		// 저장
		// 연산 전 (괄호) 내부의 모든 타입은 int 타입으로 자동 변환
		// char 타입 변수 charValue3에 int 타입 값 저장 시도 ▷ 컴파일 에러

		int intValue2 = charValue1 + charValue2; // int 타입 변수 intValue2에 (char 타입 변수 charValue1 + char 타입 변수 charValue2)
													// 연산식 값 저장
		// 연산 전 (괄호) 내부의 모든 타입은 int 타입으로 자동 변환
		System.out.println("유니코드=" + intValue2); // int 타입 변수 intValue2에 저장된 값 출력
		System.out.println("출력문자=" + (char) intValue2); // int 타입 변수 intValue2에 저장된 값을 char 타입으로 캐스팅 후 출력

		int intValue3 = 10; // int 타입 변수 intValue3에 정수 리터럴 값 10 저장
		int intValue4 = intValue3 / 4; // int 타입 변수 intValue4에 (int 타입 변수 intValue3 / 4) 연산식 값 저장
		// (괄호) 내부 연산은 int 타입 정수 리터럴 사이의 연산
		// 결과값 2.5 ▷ 2

		System.out.println(intValue4); // int 타입 변수 intValue4에 저장된 값 출력

		int intValue5 = 10; // int 타입 변수 intValue5에 정수 리터럴 값 10 저장
//		int intValue6 = 10 / 4.0;	//Type mismatch: cannot convert from double to int
		// int 타입 변수 intValue6에 (정수 리터럴 값 10 / 실수 리터럴 값 4.0) 연산식 값 저장
		// (괄호) 내부 연산은 정수 리터럴과 실수 리터럴 사이의 연산
		// 결과값 2.5 ▷ 2.5
		// int 타입 변수에 저장할 수 없음
		double doubleValue = intValue5 / 4.0; // double 타입 변수 doubleValue에 (int 타입 변수 intValue5 / 실수 리터럴 값 4.0) 연산식 값 저장
		// (괄호) 내부 연산은 정수 리터럴과 실수 리터럴 사이의 연산
		// 결과값 2.5 ▷ 2.5
		System.out.println(doubleValue); // double 타입 변수 doubleValue에 저장된 값 출력

		int x = 1; // int 타입 변수 x에 정수 리터럴 값 1 저장
		int y = 2; // int 타입 변수 y에 정수 리터럴 값 2 저장
		double result = (double) x / y; // double 타입 변수 result에 (double 타입 캐스팅) x / y 연산식 값 저장
		// x / y 연산 후 (double 타입 캐스팅) 적용
		// 결과값 1/2 ▷ 0.5
		System.out.println(result); // double 타입 변수 result에 저장된 값 출력
	}
}