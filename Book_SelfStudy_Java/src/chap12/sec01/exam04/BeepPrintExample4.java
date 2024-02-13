package chap12.sec01.exam04;

public class BeepPrintExample4 {

	public static void main(String[] args) {
		Thread thread = new BeepThread();
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
//BeepThread 클래스를 이용해서 작업 스레드 객체 생성 후 실행
//Thread thread = new BeepThread();에서 BeepThread 객체 생성