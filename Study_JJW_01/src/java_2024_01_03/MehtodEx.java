package java_2024_01_03;

public class MehtodEx {

	public static void main(String[] args) { // void = 리턴값이 없다
		method(100, 200); // 호출
		int ret = method2(300, 400);
		System.out.println(ret);

	}

	public static int method2(int x, int y) { // int x, int y 등을 매개변수라고 함
		return x + y;

	}

	public static void method(int x, int y) { // main 밖 class 안에 써야함
		System.out.println(x + y);

	}
}
