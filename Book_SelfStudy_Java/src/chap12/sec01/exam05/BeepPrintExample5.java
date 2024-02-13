package chap12.sec01.exam05;

import java.awt.Toolkit;

public class BeepPrintExample5 {

	public static void main(String[] args) {
		Thread thread = new Thread() {

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

		};
		thread.start();

		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500); // 0.5초간 일시 정지
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
//sec01.exam04의 Thread thread = new BeepThread(); 대신에 Thread 익명 자식 객체를 이용해서 작업 스레드 생성