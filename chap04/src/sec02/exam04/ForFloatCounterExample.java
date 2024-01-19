package sec02.exam04;
//float 타입 카운터 변수

public class ForFloatCounterExample {

	public static void main(String[] args) {

		for (float x = 0.1F; x <= 1.0F; x += 0.1F) { // for문 시작
			// 초기화식 : float 타입 변수 x에 float 타입 실수 리터럴 값 0.1F 저장
			// 조건식 : float 타입 변수 x는 float 타입 실수 리터럴 1.0F보다 작거나 같다 ▷
			// 증감식 : float 타입 변수 x 증가 연산자
			System.out.println(x);
		} // for문 종료
	}
}
// float 타입은 부동 소수점을 쓰기 때문에 0.1을 정확하게 표현할 수 없음
// 증감식이 반복될 수록 증가하는 값이 커짐