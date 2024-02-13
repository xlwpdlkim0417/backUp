package chap09.sec02.exam03;
//실행 클래스

public class Main {

	public static void main(String[] args) {
		Window w = new Window();
		// Window 클래스의 객체를 참조하는 변수 w 선언
		// Window 클래스의 생성자로 인스턴스 생성 후 메모리 주소 저장

		w.button1.touch();
		// Window 클래스의 인스턴스 필드 button1이 참조하는 Button 클래스의 touch() 호출
		//
		w.button2.touch();
	}

}
