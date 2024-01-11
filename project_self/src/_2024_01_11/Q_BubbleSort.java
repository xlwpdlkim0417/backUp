package _2024_01_11;

public class Q_BubbleSort {

	public static void printArr(int a[]) {
		for (int n : a) {
			System.out.print(n + ",");
		}
		System.out.println();

	}

	public static void main(String[] args) {

		int[] a = { 10, 3, 1, 4, 2 };

		int tmp = 0;

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i] < a[j]) {

					tmp = a[j];
					a[j] = a[i];
					a[i] = tmp;

					printArr(a);

				}

			}

		}

	}

}

// a[i0] vs a[j0] a[j1] a[j2] a[j3] a[j4]

// a[i0]이랑 a[j0]
