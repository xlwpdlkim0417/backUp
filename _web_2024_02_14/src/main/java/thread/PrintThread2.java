package thread;

public class PrintThread2 extends Thread {

	private boolean stop; // false 왜? 초기값이 false여

	public void setStop(boolean stop) {
		this.stop = stop;
	}

	@Override
	public void run() {
		// 무한 루프
		try {
			while (true) {
				System.out.println("실행 중");
				Thread.sleep(1);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("자원 정리");
		System.out.println("실행 종료");
	}
}