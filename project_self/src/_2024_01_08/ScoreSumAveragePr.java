package _2024_01_08;

import java.util.Scanner;

public class ScoreSumAveragePr {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int sum = 0;
		int max = 0;

		System.out.print("학생 수를 입력하세요: ");
		int numStudent = scanner.nextInt();

//		int numScore = scanner.nextInt();

		int[] array1 = new int[numStudent];

		for (int i = 0; i < array1.length; i++) {
			System.out.print("점수를 입력하세요: ");
			array1[i] = scanner.nextInt();

			sum += array1[i];

			if (max <= array1[i]) {
				max = array1[i];

			}

		}
		
		double avgScore = (double) sum / array1.length;

		System.out.println("점수 총합 = " + sum);
		System.out.println("평균 점수 = " + avgScore);
		System.out.println("최대 점수 = " + max);

	}

}
