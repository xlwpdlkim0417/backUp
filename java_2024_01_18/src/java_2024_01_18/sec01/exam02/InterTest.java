package sec01.exam02;

public interface InterTest {

	void test(); // 이건 추상 메소드

	default void test1() { // 앞에 [public] 생략되어 있음 이거 abstract 아니고 default이기 때문에 메소드 실행 블록 필요함
		System.out.println("test1()");
		test3(); // private 메소드는 이런 식으로 내부에서 사용 가능
	}

	default void test2() {
	} // 이렇게 메소드 내용은 아예 없어도 괜찮음 어차피 재정의할 거니까 재정의 강제성도 없고 필요한 부분에서만 재정의하고 쓰면 됨

//	private void test3();	//This method requires a body instead of a semicolon
	private void test3() { // 인터페이스 내부에서 호출할 용도
		System.out.println("test3()");
	}

	static void test4() { // static 메소드
//		test3();	//Cannot make a static reference to the non-static method test3() from the type InterTest
		System.out.println("test4()");
	}

}
