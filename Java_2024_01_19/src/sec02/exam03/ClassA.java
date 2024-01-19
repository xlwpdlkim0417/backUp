package sec02.exam03;

interface InterA {
	void method();
}

class ClassB implements InterA {

	@Override
	public void method() {
	}

}

public class ClassA extends ClassB {

	public static void main(String[] args) {

		InterA intera = new ClassA(); // 부모클래스가 인터페이스를 구현하면 자식클래소부터 생성된 객체는 인터페이스 타입으로 자동 변환할 수 없다 (X) ▷ 자동 변환 가능

	}

}
