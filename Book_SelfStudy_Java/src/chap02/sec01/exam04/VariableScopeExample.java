package chap02.sec01.exam04;
//변수의 사용 범위

public class VariableScopeExample {

	public static void main(String[] args) {

		int v1 = 15; // 정수 타입 변수 v1에 값 15를 저장
		if (v1 > 10) { // 만약 변수 v1 값이 10보다 크면 정수 타입 변수 v2에 정수 타입 변수 v1 - 10값 저장
			int v2; // 정수 타입 변수 v2 선언
			v2 = v1 - 10; // 정수 타입 변수 v2에 v1 - 10값을 저장
		}
//		int v3 = v1 + v2 + 5; // v2 변수를 사용할 수 없기 때문에 컴파일 에러 발생(v2 cannot be resolved to a variable)
		// ▷ v2 변수는 if 조건문 블록 내부에서 선언되고 초기화되어서 블록 외부에서 사용 불가능

	}

}
