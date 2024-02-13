package java_2024_01_11;

public class ArrayInArray {

	public static void main(String[] args) {

		int[][] scores = { { 95, 80 }, { 92, 96 } }; // 2차원 배열
		for (int i = 0; i < scores.length; i++) {
//			System.out.println(scores[i]);
			for (int j = 0; j < scores[i].length; j++) {
				System.out.printf("(%d, %d): ", i, j);
				System.out.println(scores[i][j]);
			}

		}

	}

}
