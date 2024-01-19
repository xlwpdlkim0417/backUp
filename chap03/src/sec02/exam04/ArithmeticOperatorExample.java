package sec02.exam04;
//산술 연산자

public class ArithmeticOperatorExample {

	public static void main(String[] args) {

		int v1 = 5; // int 타입 변수 v1에 정수 리터럴 값 5 저장
		int v2 = 2; // int 타입 변수 v2에 정수 리터럴 값 2 저장

		int result1 = v1 + v2; // int타입 변수 result1에 (int 타입 변수 + int 타입 변수) 연산식 결과 값 저장
		// (괄호) 내부 연산은 int 타입끼리의 연산이므로 결과값 또한 int 타입
		// 5 + 2 ▷ 7
		System.out.println("result1=" + result1); // int 타입 변수 result1에 저장된 값 출력

		int result2 = v1 - v2; // int 타입 변수 result2에 (int 타입 변수 - int 타입 변수) 연산식 결과 값 저장
		// (괄호) 내부 연산은 int 타입끼리의 연산이므로 결과값 또한 int 타입
		// 5 - 2 ▷ 3
		System.out.println("result2=" + result2);

		int result3 = v1 * v2; // int 타입 변수 result3에 (int 타입 변수 * int 타입 변수) 연산식 결과 값 저장
		// (괄호) 내부 연산은 int 타입끼리의 연산이므로 결과값 또한 int 타입
		// 5 * 2 ▷ 10
		System.out.println("result3=" + result3);

		int result4 = v1 / v2; // int 타입 변수 result4에 (int 타입 변수 / int 타입 변수) 연산식 결과 값 저장
		// (괄호) 내부 연산은 int 타입끼리의 연산이므로 결과값 또한 int 타입
		// (5 / 2) ▷ 2.5 ▷ 결과값 정수화 ▷ 2
		System.out.println("result4=" + result4);

		int result5 = v1 % v2; // int 타입 변수 result5에 (int 타입 변수 v1을 int 타입 변수 v2로 나눈 나머지) 연산식 결과 값 저장
		// (5 / 2)의 나머지 ▷ (3 / 2)의 나머지 ▷ 1
		System.out.println("result5=" + result5);

		double result6 = (double) v1 / v2; // double 타입 변수 result5에 (double 타입으로 캐스팅 된 변수 v1 / int 타입 변수) 연산식 결과 값 저장
		// double 타입과 int 타입의 연산식이므로 결과값은 double 타입
		// (5 / 2) ▷ 2.5
		System.out.println("result6=" + result6);
	}
}