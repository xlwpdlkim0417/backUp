package sec01.exam07;

public class Calculator {
	private int memory;

	public int getMemory() {
		return memory;
	}

	public synchronized void setMemory(int memory) {
		// 동시 실행이 안되고 순차 실행만 허용하겠다는 말
		// 객체 잠금이란 화장실문 잠그는 거랑 같은 의미임
		this.memory = memory;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + ": " + this.memory);
	}
	

}
