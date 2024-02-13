package java_2024_01_08;

public class Exam05 {

	public static void main(String[] ar) {

		int[] array2 = { 80, 78, 97 };
		int[] array = new int[] { 80, 78, 97 };

		int sum = 0;
		double avg;

		for (int i = 0; i < array.length; i++) {
			sum += i;

		}
		System.out.println("총합:" + sum);
		avg = (double) sum / array.length;
		System.out.println("평균:" + avg);

	}
}
