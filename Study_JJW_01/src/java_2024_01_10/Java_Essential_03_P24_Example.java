package java_2024_01_10;

public class Java_Essential_03_P24_Example {

	public static int sum(int[] x) {

		int sum = 0;
		for (int i = 0; i < x.length; i++) {
			sum += x[i];
		}
		return sum;
	}

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5 };
		int n = sum(a);
		System.out.println(n);

	}

}
