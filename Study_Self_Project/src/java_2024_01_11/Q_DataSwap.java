package java_2024_01_11;

public class Q_DataSwap {

	public static void main(String[] args) {

		int x = 10;
		int y = 20;

		// x와 y값을 바꾸는 (교환하는) 프로그램을 만드세요.

		int tmp = x;
		x = y;
		y = tmp;

		System.out.println(x);
		System.out.println(y);

	}

}
