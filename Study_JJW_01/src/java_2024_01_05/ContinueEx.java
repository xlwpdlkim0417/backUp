package java_2024_01_05;

public class ContinueEx {

	public static void main(String[] args) {

		aaa: for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (i == 3 && j == 3) {
					continue aaa;
				}
				System.out.printf("(%d, %d)\n", i, j);
			}
		}

	}

}
