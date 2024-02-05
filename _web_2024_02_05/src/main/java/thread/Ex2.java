package thread;

public class Ex2 {

	public static void main(String[] args) {

		Task task = new Task();
		// 'Task' 클래스의 인스턴스를 생성합니다.
		// Task 클래스는 Runnable 인터페이스를 구현해야 합니다.
		// Runnable 인터페이스는 run() 메서드를 정의하며, 스레드가 실행할 코드를 포함합니다.
		Thread th = new Thread(task);
		// 'task'를 실행할 새로운 스레드 객체를 생성합니다.
		// Thread 클래스는 Java에서 스레드를 생성하고 관리하는 데 사용됩니다.
		// 이 경우, 'task' 객체가 Runnable 인터페이스를 구현하므로, 이를 Thread 생성자에 전달합니다.
		th.start();
		// 'th' 스레드를 시작합니다.
		// start() 메서드 호출 시, Java는 스레드를 시작하고,
		// Runnable 인터페이스의 run() 메서드에 정의된 코드를 별도의 실행 흐름에서 실행합니다.
		mainTask();
		// 메인 스레드에서 'mainTask' 메서드를 호출합니다.
		// 'mainTask'는 현재 클래스에 정의된 다른 메서드로, 메인 스레드의 작업을 정의합니다.

	}

	public static void mainTask() {

	}

}
//Runnable 구현 클래스(Task 클래스)를 작성하고 Runnable 구현 객체를 생성한 후, 이것을 매개값으로 해서 Thread 생성자를 호출해야 비로소 작업 스레드가 생성됩니다.
//Runnable task = new Task();
//Thread thread = new Thread(task);

//Task task = new Task(); 구문이 사용된 이유는 Task 클래스가 Runnable 인터페이스를 구현하고 있을 것이라는 가정 하에 작성된 것입니다.
//Task 클래스가 Runnable 인터페이스를 구현하고 있다면, 이 코드는 유효합니다.
//그러나 일반적으로 Runnable 인터페이스 타입의 참조 변수를 사용하여 구현 객체를 생성하는 것이 더 일반적인 방식입니다.

//Task task = new Task(); 사용 이유
//구체적 클래스 메서드 사용: 만약 Task 클래스에 Runnable 인터페이스에 정의되지 않은 추가 메서드가 있다면, Task 타입을 사용함으로써 이러한 메서드에 접근할 수 있습니다.
//코드의 명확성: Task 클래스가 Runnable을 구현한다는 것이 명확히 알려져 있고, Task 클래스에 특정한 기능이 필요한 경우, 직접적으로 Task 타입을 사용하는 것이 코드의 의도를 더 명확하게 표현할 수 있습니다.