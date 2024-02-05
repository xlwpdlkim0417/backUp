package thread;

public class Ex3 {

	public static void main(String[] args) {
		Thread th = new Thread(new Runnable() {
			// Thread 인스턴스 생성.
			// 여기서는 익명 클래스를 사용하여 Runnable 인터페이스를 구현합니다.
			// 익명 클래스: 이름이 없는 클래스로, 일회성으로 사용되는 클래스를 간단하게 정의할 때 사용됩니다.

			@Override
			public void run() {
				// Runnable 인터페이스의 run 메서드 구현.
				// 이 메서드는 스레드가 실행할 작업을 정의합니다.
				// 현재 예제에서는 내용이 비어 있습니다.
			}
		});
		// 이렇게 생성된 스레드(th)는 run 메서드에서 정의된 작업을 수행합니다.
		th.start();
		// 스레드 시작. start 메서드 호출을 통해 run 메서드가 실행됩니다.
		mainTask();
		// 메인 스레드에서 별도로 정의된 'mainTask' 메서드를 호출합니다.
		// 이 메서드는 메인 스레드에서 동시에 실행될 작업을 정의합니다.
	}

	public static void mainTask() {
		// 'mainTask' 메서드: 메인 스레드에서 실행할 추가 작업을 여기에 정의합니다.
		// 현재 예제에서는 이 메서드가 비어 있습니다.
	}

}
//Thread 생성자 호출할 때 Runnable 익명 객체를 매개값으로 사용할 수 있습니다.
//Runnable의 익명 구현 객체 이용
//익명 클래스 (Anonymous Class): 이 클래스는 이름이 없으며, 주로 일회성의 작은 작업을 위해 사용됩니다.
//여기서는 Runnable 인터페이스를 구현하기 위해 사용되었습니다.
//익명 클래스를 사용하면 코드를 더 간결하게 만들 수 있지만, 복잡하거나 재사용이 필요한 로직에는 적합하지 않을 수 있습니다.