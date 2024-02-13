package chap12.sec01.exam02;

import java.awt.Toolkit;

public class BeepTask implements Runnable {

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
//작업을 정의하는 Runnable 구현 클래스 작성