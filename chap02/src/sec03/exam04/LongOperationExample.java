package sec03.exam04;
//정수 타입 연산

public class LongOperationExample {

	public static void main(String[] args) {

		byte value1 = 10; // byte 타입 변수 value1에 정수 리터럴 값 10 저장
		int value2 = 100; // int 타입 변수 value2에 정수 리터럴 값 100 저장
		long value3 = 1000L; // long 타입 변수 value3에 정수 리터럴 값 1000L 저장
		long result = value1 + value2 + value3; // long 타입 변수 result에 (byte 타입 변수 + int 타입 변수 + long 타입 변수) 연산식 값 저장
												// ▷ 연산 전 (괄호) 내부의 모든 타입은 long 타입으로 자동 변환
		System.out.println(result); // long 타입 변수 result에 저장된 값 출력
	}
}