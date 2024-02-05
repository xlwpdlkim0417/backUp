package thread;

public class Ex5 {

	public static void main(String[] agrs) {
		Thread th = new Thread() {
			// 익명 클래스를 사용하여 Thread 클래스의 인스턴스를 생성합니다.
			// 익명 클래스는 클래스 선언과 인스턴스 생성을 동시에 하는 방법으로,
			// 여기서는 Thread 클래스를 상속받은 하위 클래스를 정의하고 바로 객체를 생성합니다.

			@Override
			public void run() {
				// run 메서드를 오버라이드합니다.
				// Thread 클래스에서 run 메서드는 스레드가 시작되었을 때 호출되는 메서드로,
				// 여기에 스레드가 수행할 작업을 정의합니다.
				// 현재 예제에서는 run 메서드 내부가 비어 있으므로, 스레드는 아무 작업도 수행하지 않습니다.
			}

		};
		th.start();
		// 스레드 시작. start 메서드 호출을 통해 run 메서드가 별도의 실행 흐름에서 실행됩니다.
		// 스레드가 시작되면 Java 런타임은 run 메서드 내부의 코드를 실행합니다.
		mainTask();
		// mainTask 메서드를 호출합니다.
		// 이 메서드는 메인 스레드에서 실행되며, 병렬적으로 수행되어야 하는 작업이 아닌, 메인 스레드의 작업을 정의합니다.
	}

	public static void mainTask() {
	}
}