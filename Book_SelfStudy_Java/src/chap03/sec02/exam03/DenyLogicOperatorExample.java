package chap03.sec02.exam03;
//논리 부정 연산자

public class DenyLogicOperatorExample {

	public static void main(String[] args) {

		boolean play = true; // boolean 타입 변수 play에 true 값 저장
		System.out.println(play); // boolean 타입 변수 play에 저장된 값 출력

		play = !play;
		// boolean 타입 변수 play에 저장된 값 true를 false로 변경
		// boolean 타입 변수 play에 false 값 저장
		System.out.println(play); // boolean 타입 변수 play에 저장된 값 출력

		play = !play;
		// boolean 타입 변수 play에 저장된 값 false를 true로 변경
		// boolean 타입 변수 play에 true 값 저장
		System.out.println(play); // boolean 타입 변수 play에 저장된 값 출력
	}
}