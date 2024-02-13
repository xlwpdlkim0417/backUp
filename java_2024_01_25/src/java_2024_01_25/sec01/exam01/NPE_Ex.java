package sec01.exam01;

class MyClass {
	void method() {
	}
}

public class NPE_Ex {

	public static void main(String[] args) {

		MyClass mc = null; // 객체 생성은 안했음
		System.out.println(mc);
		mc.method();
		// java.lang.NullPointerException
		// 객체가 생성이 되지 않았기 때문에 메모리 주소가 없어서 오류난 거임

//		String data = null;
//		System.out.println(data.toString());
		// java.lang.NullPointerException
		// 변수 data에 문자열 리터럴을 저장하면 오류 해결 가능
	}
}
