package chap02.sec04.exam01;
//printf() 메소드 사용 방법

public class PrintfExample {

	public static void main(String[] args) {

		int value = 123; // int 타입 변수 value에 정수 리터럴 123 값 저장
		System.out.printf("상품의 가격:%d원\n", value); // int 타입 변수 value 값을 그대로(%d) 대입하고 개행한 것을 출력
		System.out.printf("상품의 가격:%6d원\n", value); // int 타입 변수 value 값을 왼쪽 빈 자리 공백을 둔 6자리 정수(%6d)로 대입하고 개행한 것을 출력
		System.out.printf("상품의 가격:%-6d원\n", value); // int 타입 변수 value 값을 오른쪽 빈 자리 공백을 둔 6자리 정수(%-6d)로 대입하고 개행한 것을 출력
		System.out.printf("상품의 가격:%06d원\n", value); // int 타입 변수 value 값을 왼쪽 빈 자리 0으로 채운 6자리 정수(%06d)로 대입하고 개행한 것을 출력

		double area = 3.14159 * 10 * 10; // double 타입 변수 area에 실수 리터럴이 포함된 연산식 3.14159 * 10 * 10 값 저장
		System.out.printf("반지름이 %d인 원의 넓이:%10.2f\n", 10, area); // 정수 리터럴 10 값을 (%d)로 대입하고 double 타입 변수 area 값을 왼쪽 빈 자리
																// 공백을 둔 소수점 이상 7자리, 소수점 이하 2자리 실수(%10.2f)로 대입하고 개행한 것을
																// 출력

		String name = "홍길동"; // String 타입 변수 name에 문자열 "홍길동" 저장
		String job = "도적"; // String 타입 변수 job에 문자열 "도적" 저장
		System.out.printf("%6d | %-10s | %10s\n", 1, name, job); // 정수 리터럴 1 값을 왼쪽 빈 자리 공백을 둔 6자리 정수(%6d)로 대입하고 String
																	// 타입 변수 name에 저장된 문자열을 오른쪽 빈 자리 공백을 둔 10자리
																	// 문자열(%-10s)로 대입하고 String 타입 변수 job에 저장된 문자열을 왼쪽 빈
																	// 자리 공백을 둔 10자리 문자열(%10s\n)로 대입하고 개행한 것을 출력
	}
}