package _2024_01_11;

class MyClass {
	int n; // 객체 안의 필드는 별도의 값을 지정하지 않으면 초기값이 0

}

public class CallByValue {

	public static void increase(int n, MyClass mc) { // 여기의 n은 아래 main의 n과 다른 변수임
		n = n + 1;
		System.out.println("increase: " + n);
		mc.n += 1;
		System.out.println("increase: " + mc.n);
	}

	public static void main(String[] args) {

		int n = 100;

		MyClass mc = new MyClass();

		System.out.println(mc.n);
//		increase(n, mc);
		increase(n, new MyClass()); // 얘는 mc가 아님 위에 있는 애랑은 동명이인임

		System.out.println(n);
		System.out.println(mc.n);

	}

}
