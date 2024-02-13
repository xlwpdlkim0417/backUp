package sec01.exam04;

import java.awt.Toolkit;

public class BeepThread extends Thread { // 메소드 재정의하라는 경고 밑줄이 생성되지 않으나 run 메소드 재정의 가능

	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit(); // Toolkit 객체 얻기
		for (int i = 0; i < 5; i++) {
			toolkit.beep(); // 비프음 발생
			System.out.println("beep"); // 비프음 발생하지 않으므로 프린트문으로 대체
			try {
				Thread.sleep(500); // 0.5초간 일시 정지
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
//여기서 run() 메소드를 재정의할 수 있는 이유는 Thread 클래스에 이미 run() 메소드가 정의되어 있기 때문입니다.
//BeepThread 클래스가 Thread 클래스를 확장(상속)하고 있으므로, Thread 클래스에 정의된 모든 메소드를 재정의(오버라이드)할 수 있습니다.
//thread.start();에서 start() 메소드 호출하여 BeepThread의 run() 메소드를 실행