package sec02.exam02;

class AnyClass3 {
	void anyMethod() {
		throw new RuntimeException(); // 예외 발생시키는 코드
	}

}

public class Ex3 {

	public static void main(String[] args) {

		AnyClass3 ac = new AnyClass3();

		ac.anyMethod(); // try-catch로 감싸면 오류 나도 진행은 계속 가능함

	}

}
