package java_2024_01_25.sec01.exam04_Extra;

class ThrowClass {
	void method(int x) throws Exception {
		if (x > 10) {
			throw new Exception("예외 발생"); // Unhandled exception type Exception
			// 이거 throws 아님 주의!!!!!!!!!!!!!!!!!!!!!
			// throws는 메소드 옆에 붙는거
		} else {
			System.out.println(x);
		}
	}
}

public class Ex {

	public static void main(String[] args) {

		ThrowClass tc = new ThrowClass();
		try {
			tc.method(10); // 숫자가 11이면 예외 발생할거임
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
