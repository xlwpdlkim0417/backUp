package sec04.exam03;
//입력된 키의 개수와 상관없이 키코드 읽기

public class ContinueKeyCodeReadExample {

	public static void main(String[] args) throws Exception { // 예외 처리

		int keyCode; // int 타입 변수 keyCode 선언

		while (true) { // while 반복문 시작 : 블록 내부 내용 무한 반복
			keyCode = System.in.read(); // System.in.read()로 입력받은 키코드를 int 타입 변수 keyCode에 저장
			System.out.println("keyCode: " + keyCode); // int 타입 변수 keyCode에 저장된 값 출력
		}
	}
}