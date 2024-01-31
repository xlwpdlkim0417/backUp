package sec01.exam01;

public class BeepPrintEx2 {

	public static void main(String[] args) {

		Thread th = new Thread(new BeepTask());
		th.start(); // 여기 run 아니고 start임 run 메소드는 내가 실행하는게 아니고 프로세스가 자동으로 실행하는 거임

		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500); // 잠시 멈춤 0.5초
			} catch (InterruptedException e) {
			}
		}
		System.out.println("main 종료");
	}
}