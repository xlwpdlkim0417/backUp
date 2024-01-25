package sec02.exam02;

public class Prob_P463_01_3 {

	void method() {
		System.out.println("method()");
	}

	void method2() {
		try {
			method();

			return; // 여기에 리턴을 넣어도 finally는 실행함
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println("method2()-finally");
		}
	}

	public static void main(String[] args) {
		Prob_P463_01_3 p3 = new Prob_P463_01_3();
		p3.method2();

	}

}
