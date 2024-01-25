package sec01.exam04_Extra;

class MyClass {
	void method() throws MyException {
		throw new MyException("나의 예외 상황");
		// 여기 MyException은 임의의 예외를 발생시키기 위해 만들어낸 변수같은 개념인가? 뭐든 들어가도 됨?
		// 아님 이 이름의 클래스 있음
	}
}

public class ExceptionEx {

	public static void main(String[] args) {

		MyClass mc = new MyClass();

		try {
			mc.method();
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
