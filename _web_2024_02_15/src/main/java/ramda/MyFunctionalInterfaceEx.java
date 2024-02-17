package ramda;

public class MyFunctionalInterfaceEx {

	public static void main(String[] args) {
		MyFunctionalInterface f1, f2;
		f1 = (x, y) -> {
			return x + y;
		};
		f1 = (x, y) -> x + y;
		// 위처럼 한 문장으로도 쓸 수 있음
		int z = f1.method(10, 20);
		System.out.println(z);

		f2 = new MyFunctionalInterface() {

			@Override
			public int method(int x, int y) {
				return sum(x, y);
			}
		};
		System.out.println(f2.method(100, 200));

		f1 = (x, y) -> {
			return sum(x, y);
		};

		f1 = (x, y) -> sum(x, y);
		// 이렇게도 가능

	}

	public static int sum(int x, int y) {
		return x + y;
	}

}
