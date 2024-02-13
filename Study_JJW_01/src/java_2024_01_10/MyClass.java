package java_2024_01_10;

public class MyClass {

	int x, y, z;

	public MyClass(int x) {
//		super();
//		this.x = x;
		this(x, 0, 0);

		System.out.println("1번째 생성자");
	}

	public MyClass(int x, int y) {
//		super();
//		this.x = x;
//		this.y = y;
		this(x, y, 0);

		System.out.println("2번째 생성자");
	}

	public MyClass(int x, int y, int z) {
//		super();
		this.x = x;
		this.y = y;
		this.z = z;

		System.out.println("특별 명령");
		System.out.println("3번째 생성자");
	}

	@Override
	public String toString() {
		return "MyClass [x=" + x + ", y=" + y + ", z=" + z + "]";
	}

	public static void main(String[] args) { // 왜 3번 다음에 1번일까? 3은 필드값을 초기화하니까 맨 처음에 프린트 되는 거고 그 다음에 100이 들어가니까 int x에
												// 들어가서 1번이 출력되는거임?

		MyClass mc = new MyClass(100);
		System.out.println();

		MyClass mc2 = new MyClass(100, 200);
		System.out.println(mc2);

	}

}
