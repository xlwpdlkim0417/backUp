package sec03.exam03;
//정수 타입의 연산

public class ByteOperationExample {

	public static void main(String[] args) {

		byte result1 = 10 + 20; // byte 타입 변수 result1에 정수 리터럴 값 (10 + 20) 저장 ▷ reulst1은 byte 타입
		System.out.println(result1); // byte 타입 변수 result1에 저장된 값 출력

		byte x = 10; // byte 타입 변수 x에 정수 리터럴 값 10 저장
		byte y = 20; // byte 타입 변수 y에 정수 리터럴 값 20 저장
		int result2 = x + y; // int 타입 변수 result2에 (byte 타입 변수 + byte 타입 변수) 연산식 값 저장
								// ▷ 연산 전 (괄호) 내부의 모든 타입은 int 타입으로 자동 변환
		System.out.println(result2); // int 타입 변수 result2에 저장된 값 출력
	}
}