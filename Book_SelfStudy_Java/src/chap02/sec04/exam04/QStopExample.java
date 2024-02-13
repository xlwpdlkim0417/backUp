package chap02.sec04.exam04;
//q를 입력하면 반복 종료

public class QStopExample {

	public static void main(String[] args) throws Exception { // 예외 처리

		int keyCode; // int 타입 변수 keyCode 선언

		while (true) { // while 반복문 시작
			keyCode = System.in.read(); // System.in.read()로 입력받은 키코드 값을 int 타입 변수 keyCode에 저장
			System.out.println("keyCode: " + keyCode); // int 타입 변수 keyCode에 저장된 값 출력
			if (keyCode == 113) { // if문 시작 : 괄호 내부 boolean 타입이 true일 경우 해당 블록 내부 실행 ▷ int 타입 변수 keyCode에 저장된 값 ==
									// 정수 리터럴 113일 때
				break; // while 반복문 중지
			}
		}
		System.out.println("종료"); // 문자열 "종료" 출력
	}
}