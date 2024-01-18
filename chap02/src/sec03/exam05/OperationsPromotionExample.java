package sec03.exam05;

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
		System.out.println("유니코드=" + intValue2);	//int 타입 변수 intValue2에 저장된 값 출력
		System.out.println("출력문자=" + (char) intValue2);	//int 타입 변수 intValue2에 저장된 값을 char 타입으로 캐스팅 후 출력
		
		int intValue3 = 10;	//int 타입 변수 intValue3에 정수 리터럴 값 10 저장
		int intValue4 = intValue3 / 4;	//int 타입 변수 intValue4에 (int 타입 변수 intValue3 / 4) 연산식 값 저장
		//(괄호) 내부의 연산은 (10 / 4)이고 int 타입 정수 리터럴 사이의 연산이기 때문에 결과값은 2.5이고
		System.out.println(intValue4);

		int intValue5 = 10;
		// int intValue6 = 10 / 4.0; 컴파일 에러
		double doubleValue = intValue5 / 4.0;
		System.out.println(doubleValue);

		int x = 1;
		int y = 2;
		double result = (double) x / y;
		System.out.println(result);

	}

}
