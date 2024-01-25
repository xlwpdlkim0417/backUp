package sec01.exam04_Extra;

class MyClass3 {
	void method() {
		throw new MyException2("나의 실행 예외");
		// 여기 왜 throw new MyException 하면 오류남?
		// MyException이랑 MyException2가 상속하는 부분이 다름
		// 상속 차이가 오류 차이를 만듦
		// 실행 전까지는 모른다는 말임
		// 일반 MyException은 
	}
}

public class ExceptionEx2 {

	public static void main(String[] args) {

		MyClass mc = new MyClass();

		try {
			mc.method();
		} catch (MyException e) {
			System.out.println("내가 만든 실행 예외");
			e.printStackTrace();
		}

	}

}
// 여기 메인 메소드의 트라이-캐치 구문은 직접 적어넣은 것 자동 생성 안됨