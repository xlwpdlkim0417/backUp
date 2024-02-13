package sec01.exam01;

public class BeepTask implements Runnable { // Runnable 인터페이스를 구현 run() 메소드를 반드시 실행해야함

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("beep");
			try {
				Thread.sleep(500); // 잠시 멈춤 0.5초
				// sleep() 메소드를 쓰기 위해 Thread에서 불러온 거임
			} catch (InterruptedException e) {
			}
		}System.out.println("Beep 종료");
	}

}
