package sec01.exam03;

import java.awt.Toolkit;

public class BeepPrintExample3 {

	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() {

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
		});
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
//sec01.exam02에서 Runnable beepTask = new BeepTask();에서 BeepTask 객체를 생성하고, 이것을 매개값으로 해서 Thread thread = new Thread(beepTask); 작업 스레드 생성
//이 과정을 여기서는 익명 구현 객체로 대체해서 작업 스레드를 만들었음
