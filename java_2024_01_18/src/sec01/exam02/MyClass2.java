package sec01.exam02;

public class MyClass2 implements InterTest2 {

	@Override
	public void test() { // InterTest2(서브클래스)의 InterTest(슈퍼클래스)가 보유하고 있는 추상 메소드
	}

	@Override
	public void test5() { // InterTest(슈퍼클래스)를 상속하는 InterTest2(서브클래스)가 보유하고 있는 추상 메소드
	}

}
