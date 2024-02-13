package chap12.sec01.exam01;

import java.awt.Toolkit;

public class BeepPrintExample1 {

	public static void main(String[] args) {
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
// Console의 결과로 미루어 짐작하건데 비프음이 먼저 다섯 번 발생한 뒤에 글자가 다섯 번 보여질 거 같음 왜냐하면 그냥 for문 순서대로 돌아가는 거니까