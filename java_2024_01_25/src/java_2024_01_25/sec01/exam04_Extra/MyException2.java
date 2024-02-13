package sec01.exam04_Extra;

public class MyException2 extends RuntimeException {

	public MyException2(String msg) {
		super(msg);
	}

}
//Exception 일반 예외 포함
//RuntimeException 실행 시점에 발생하는 예외만