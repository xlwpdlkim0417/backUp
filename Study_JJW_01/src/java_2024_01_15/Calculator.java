package java_2024_01_15;

public class Calculator {

	static int x;

	static int p1() {
		return x + 100;

	}

	static int m1() {
		return x - 100;

	}

	static void m2() {
		System.out.println(x);
	}

	public static void main(String[] args) {

		x = 100;
		int y = p1();

		System.out.println(y);

		m2(); // 이거 아래거랑 차이가 뭐지? 둘이 같은 거임
		Calculator.m2(); // 클래스 이름 명시적으로 써주는게 다른 클래서에서 쓸 때는 좀 좋을듯?

		Calculator cal = new Calculator();
		cal.m2(); // 정상적인 사용법이 아님

	}

}
