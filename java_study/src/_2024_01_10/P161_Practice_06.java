package _2024_01_10;

public class P161_Practice_06 {

	public static void main(String[] args) {

		for (int i = 0; i < 4; i++) {
			for (int j = 3; j >= 0; j--) {
				if (i < j) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}

			}
			System.out.println();
		}

	}

}
