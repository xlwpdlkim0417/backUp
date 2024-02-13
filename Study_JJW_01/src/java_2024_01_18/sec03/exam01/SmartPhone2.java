package java_2024_01_18.sec03.exam01;

public class SmartPhone2 extends Phone {

	int y;

	public SmartPhone2(int x, int y) { // 생성자
		super(x); // 부모의 생성자 호출 // 추상 클래스 객체 생성이 가능해지는 순간
		this.y = y;
	}

	public void printX() {
		System.out.println(x);
	}

	@Override
	public void ring() {
	}

}
