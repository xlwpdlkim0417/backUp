package sec06.exam05.package1;

public class A {

	// 필드

	public int field1; // public 접근 제한
	int field2; // default 접근 제한
	private int field3; // private 접근 제한

	// 생성자

	public A() {
		field1 = 1; // (O) 클래스 내부일 경우 접근 제한자의 영향을 받지 않음
		field2 = 1; // (O)
		field3 = 1; // (O)

		method1(); // (O) 클래스 내부일 경우 접근 제한자의 영향을 받지 않음
		method2(); // (O)
		method3(); // (O)

	}

	public void method1() { // public 접근 제한

	}

	void method2() { // default 접근 제한

	}

	private void method3() { // private 접근 제한

	}

}
