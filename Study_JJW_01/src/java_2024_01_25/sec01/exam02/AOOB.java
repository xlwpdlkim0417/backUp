package java_2024_01_25.sec01.exam02;

public class AOOB {

	public static void main(String[] args) {

		int[] arr = new int[4];

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);

		}
		System.out.println(arr[4]);
		// java.lang.ArrayIndexOutOfBoundsException:
		// Index 4 out of bounds for length 4

	}

}
