package _2024_01_10;

public class P161_Practice_05 {

	public static void main(String[] args) {

		for (int i = 1; i <= 4; i++) {
//			System.out.println(i);
			for (int j = 1; j <= i; j++) { // j<i 이렇게 적으면 false라서 값을 프린트하지 않음
				System.out.print("*");

			}
			System.out.println();

		}

	}

}
