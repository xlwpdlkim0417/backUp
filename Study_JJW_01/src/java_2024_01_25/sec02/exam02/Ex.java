package java_2024_01_25.sec02.exam02;

class AnyClass {
	void anyMethod() throws Exception {

	}

	void method() {
		try {
			anyMethod();	// 호출의 호출이라는 말이 여기 보고 한 말임
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

public class Ex {

	public static void main(String[] args) {

		AnyClass ac = new AnyClass();

//		ac.anyMethod(); // 떠넘겼다는건 네가 이것 좀 처리해줘라는 의미임 그래서 메소드 호출했다가 짐을 떠안았다고 보면됨

		ac.method();

	}

}
