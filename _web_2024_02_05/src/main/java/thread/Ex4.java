package thread;

public class Ex4 {

	public static void main(String[] args) {
		WorkerThread wt = new WorkerThread();
		// WorkerThread 클래스의 인스턴스를 생성합니다.
		// WorkerThread는 Thread 클래스를 상속받아 멀티스레딩을 지원합니다.

		wt.start();
		// WorkerThread 인스턴스의 start 메서드를 호출합니다.
		// 이 메서드는 새로운 스레드를 생성하고, 이 스레드에서 WorkerThread의 run 메서드를 실행시킵니다.
		// start 메서드 호출은 실제 스레드를 시작하는 것으로, run 메서드가 별도의 실행 흐름에서 실행됩니다.
		mainTask();
		// mainTask 메서드를 호출합니다.
		// 이 메서드는 메인 스레드에서 실행되며, 병렬적으로 수행되어야 하는 작업이 아닌, 메인 스레드의 작업을 정의합니다.
	}

	public static void mainTask() {
	}

}
//Thread 클래스를 상속받은 WorkerThread 클래스의 객체 생성

//여기서 WorkerThread 클래스는 별도로 정의되어야 하며, Thread 클래스를 상속받아 run 메서드를 오버라이드해야 합니다.
//run 메서드에는 WorkerThread 스레드에서 수행할 작업을 정의합니다.

//WorkerThread가 Thread 클래스를 상속받는다면, WorkerThread는 Thread의 모든 메서드와 속성을 상속받습니다.
//이 경우 WorkerThread 인스턴스는 Thread 인스턴스로도 간주될 수 있습니다.
//WorkerThread wt = new WorkerThread();와 Thread wt = new WorkerThread(); 둘 다 유효하며, 사용하는 상황에 따라 적절한 방법을 선택할 수 있습니다.
//상황에 따라 클래스의 특정 기능에 접근할 필요가 있는지, 아니면 클래스 계층구조의 다형성을 활용할 필요가 있는지에 따라 결정됩니다.