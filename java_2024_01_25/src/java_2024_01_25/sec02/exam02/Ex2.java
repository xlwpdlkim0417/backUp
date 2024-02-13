package sec02.exam02;

class AnyClass2 {
	void anyMethod() throws ClassNotFoundException {
		throw new ClassNotFoundException(); // 예외 발생시키는 코드
	}

}

public class Ex2 {

	public static void main(String[] args) {

		AnyClass2 ac = new AnyClass2();

		try {
			ac.anyMethod();
		} catch (ClassNotFoundException e) { // 우리가 발생시켰고 throws 했던 오류가 자동으로 들어감
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
