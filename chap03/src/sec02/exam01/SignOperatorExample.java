package sec02.exam01;
//부호 연산자

public class SignOperatorExample {

	public static void main(String[] args) {

		int x = -100; // int 타입 변수 x에 정수 리터럴 -100 값 저장
		int result1 = +x; // int 타입 변수 result1에 부호 변동 없는 int 타입 변수 x 값 저장 ▷ -100
		int result2 = -x; // int 타입 변수 result2에 부호 변동 실행한 int 타입 변수 x 값 저장 ▷ 100
		System.out.println("result1=" + result1); // int 타입 변수 result1에 저장된 값 출력
		System.out.println("result2=" + result2); // int 타입 변수 result2에 저장된 값 출력

		byte b = 100; // byte 타입 변수 b에 정수 리터럴 값 100 저장
//		byte result3 = -b; ← byte 타입 값을 부호 연산하면 int 타입 값으로 바뀌므로 컴파일 에러 발생
		// Type mismatch: cannot convert from int to byte
		int result3 = -b; // int 타입 변수 result3에 부호 변동 실행한 byte 타입 변수 b 값 저장 ▷ 부호 연산 과정에서 byte 타입 변수 자동 타입
							// 변환 → int 타입 변수
		System.out.println("result3=" + result3); // int 타입 변수 result3에 저장된 값 출력
	}
}