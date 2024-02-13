package java_2024_01_18.sec03.exam01;

public abstract class SmartPhone extends Phone {

	public SmartPhone(int x) {
		super(x);
	}

	@Override
	public void ring() {
	}

	public abstract void test();

}
