package java_2024_01_11;

public class Exam05 {

	public static void main(String[] args) {

		int[][] array = { { 95, 86 }, { 83, 92, 96 }, { 78, 83, 93, 87, 88 } };

		int sum = 0;
		double avg = 0.0;

		// 작성위치

		int count = 0;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.println(array[i][j]);
				sum += array[i][j];
			}
			count += array[i].length;
			System.out.println(array[i].length);
		}
		avg = sum / (double) count;

//		System.out.println(array.length);

		// 작성위치

		System.out.println("sum: " + sum);
		System.out.println("avg: " + avg);

	}

}
