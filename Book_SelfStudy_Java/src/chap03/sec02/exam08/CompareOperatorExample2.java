package chap03.sec02.exam08;
//비교 연산자

public class CompareOperatorExample2 {

	public static void main(String[] args) {

		int v2 = 1; // int 타입 변수 v2에 정수 리터럴 값 1 저장
		double v3 = 1.0; // double 타입 변수 v3에 실수 리터럴 값 1.0 저장
		System.out.println(v2 == v3); // (int 타입 변수 == double 타입 변수) ▷ double 타입으로 자동 타입 변환
		// (double v2 == double v3) 연산식의 결과값 ▷ true

		double v4 = 0.1; // double 타입 변수 v4에 실수 리터럴 0.1 값 저장
		float v5 = 0.1F; // float 타입 변수 v5에 float 타입 실수 리터럴 0.1F 값 저장
		System.out.println(v4 == v5); // (double 타입 변수 == float 타입 변수) ▷ double 타입으로 자동 타입 변환이라고 착각할 수 있음
		// ▷ 예외
		// 실수의 저장 방식인 부동 소수점 방식이 0.1을 정확히 표현할 수 없기 때문입니다.
		// 0.1F는 0.1의 근사값으로 표현됩니다.
		// 따라서 0.1보다 큰 값이 되어 버립니다.

		// ▷Solution
		// 피연산자 Float 타입으로 강제 변환 후 비교
		// 피연산자 int 타입으로 강제 변환 후 비교

		System.out.println((float) v4 == v5); // (float 타입으로 강제 타입 변환된 double 타입 변수 == float 타입 변수)
		// ▷ true
	}
}