package sec01.exam02;

public class BeepPrintExample2 {

	public static void main(String[] args) {

		Runnable beepTask = new BeepTask();
		Thread thread = new Thread(beepTask);
		thread.start(); // BeepTask 클래스에서 재정의 된 run() 메소드 실행할 스레드

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
//Runnable beepTask = new BeepTask();에서 BeepTask 객체를 생성하고 = Runnable 인터페이스의 구현 객체 생성
//이것을 매개값으로 해서 Thread thread = new Thread(beepTask); 작업 스레드를 생성
//thread.start();로 작업 스레드의 start() 메소드를 호출하면 작업 스레드에 의해 BeepTask 객체의 run() 메소드가 실행되어 비프음 발생
//그와 동시에 메인 스레드는 for문 실행