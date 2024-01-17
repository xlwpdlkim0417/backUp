package sec02.exam08;
//boolean 타입

public class BooleanExample {

	public static void main(String[] args) {

		boolean stop = true; // 논리 타입 변수 stop의 초기값 논리 리터럴 true 설정
		if (stop) { // 만약 논리 타입 변수 stop의 논리 리터럴 값이 true면 if 블록을 실행하고
					// 그게 아니면(=논리 리터럴 값이 false) else 블록을 실행
			System.out.println("중지합니다."); // String 타입의 문자 리터럴 출력
		} else {
			System.out.println("시작합니다."); // String 타입의 문자 리터럴 출력
		}
	}
}