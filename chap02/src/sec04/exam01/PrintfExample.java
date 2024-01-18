package sec04.exam01;
//printf() 메소드 사용 방법

public class PrintfExample {

	public static void main(String[] args) {

		int value = 123;	//int 타입 변수 value에 정수 리터럴 123 값 저장
		System.out.printf("상품의 가격:%d원\n", value);	//int 타입 변수 value 값을 그대로(%d) 대입하고 개행한 것을 출력
		System.out.printf("상품의 가격:%6d원\n", value);	//int 타입 변수 value 값을 왼쪽 빈 자리 공백을 둔 6자리 정수(%6d)로 대입하고 개행한 것을 출력 
		System.out.printf("상품의 가격:%-6d원\n", value);	//int 타입 변수 value 값을 오른쪽 빈 자리 공백을 둔 6자리 정수(%-6d)로 대입하고 개행한 것을 출력
		System.out.printf("상품의 가격:%06d원\n", value);	//int 타입 변수 value 값을 왼쪽 빈 자리 0으로 채운 6자리 정수(%06d)로 대입하고 개행한 것을 출력

		double area = 3.14159 * 10 * 10;	//double 타입 변수 area에 실수 리터럴이 포함된 연산식 3.14159 * 10 * 10 값 저장
		System.out.printf("반지름이 %d인 원의 넓이:%10.2f\n", 10, area);	//double 타입 변수 

		String name = "홍길동";
		String job = "도적";
		System.out.printf("%6d | %-10s | %10s\n", 1, name, job);

	}

}
