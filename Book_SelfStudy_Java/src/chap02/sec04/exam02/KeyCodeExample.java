package chap02.sec04.exam02;
//입력된 키코드를 변수에 저장

public class KeyCodeExample {

	public static void main(String[] args) throws Exception { // throws Exception ▷ 예외 처리 코드 / 모니터에 예외 내용을 출력만 함

		int keyCode; // int 타입 변수 keyCode 선언

		keyCode = System.in.read(); // System.in.read() ▷ 이클립스의 콘솔 뷰가 입력 대기 상태가 되며 입력된 키코드를 읽음
		System.out.println("keyCode: " + keyCode);

		keyCode = System.in.read();
		System.out.println("keyCode: " + keyCode);

		keyCode = System.in.read();
		System.out.println("keyCode: " + keyCode);
	}
}