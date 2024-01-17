package sec03.exam01;
//자동 타입 변환

public class PromotionExample {

	public static void main(String[] args) {
		// 자동 타입 변환
		byte byteValue = 10; // byte 타입 변수 byteValue에 정수 리터럴 값 10 저장
		int intValue = byteValue; // int 타입 변수 intValue에 초기화 된 byte 타입 변수 byteValue 저장
									// byte 타입 → int 타입 프로모션
		System.out.println("intValue: " + intValue); // int 타입 변수 intValue에 저장된 값 출력

		char charValue = '가'; // char 타입 변수 charValue에 문자 리터럴 '가' 저장
		intValue = charValue; // int 타입 변수 intValue에 초기화 된 char 타입 변수 charValue 값 저장
								// char 타입 → int 타입 프로모션 ▷ int 타입 변수에 유니코드 값 저장
		System.out.println("가의 유니코드: " + intValue); // int 타입 변수 intValue에 저장된 유니코드 값 출력

		intValue = 50; // int 타입 변수 intValue에 정수 리터럴 값 50 저장
		long longValue = intValue; // long 타입 변수 longValue에 초기화 된 int 타입 변수 intValue 값 저장
									// int 타입 → long 타입 프로모션
		System.out.println("longValue: " + longValue); // long 타입 변수 longValue에 저장된 값 출력

		longValue = 100; // long 타입 변수 longValue에 int 타입 정수 리터럴 값 100 저장
		float floatValue = longValue; // float 타입 변수 floatValue에 초기화 된 long 타입 변수 longValue 값 저장
										// long 타입 → float 타입 프로모션
		System.out.println("folatValue: " + floatValue); // float 타입 변수 floatValue에 저장된 값 출력

		floatValue = 100.5F; // float 타입 변수 floatValue에 float 타입 실수 리터럴 100.5F 값 저장
		double doubleValue = floatValue; // double 타입 변수 doubleValue에 초기화 된 float 타입 변수 floatValue 값 저장
											// float 타입 → double 타입 프로모션
		System.out.println("doubleValue: " + doubleValue); // double 타입 변수 doubleValue에 저장된 값 출력
	}
}