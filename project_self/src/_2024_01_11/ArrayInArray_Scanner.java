package _2024_01_11;

import java.util.Scanner;

public class ArrayInArray_Scanner {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("2차원 배열의 크기를 입력하시오");
		System.out.print("입력> ");
		int num1 = scan.nextInt();
		System.out.print("입력> ");
		int num2 = scan.nextInt();

		int sum = 0;
		int count = num1 * num2; // 이걸로는 안되나
		double avg = 0;

		int[][] scores = new int[num1][num2]; // 2차원 배열
		for (int i = 0; i < scores.length; i++) {
//			System.out.println(scores[i]);
			for (int j = 0; j < scores[i].length; j++) {
				System.out.printf("(%d, %d) 입력 : ", i, j);
				scores[i][j] = scan.nextInt();

			}

		}
		// 총합, 평균을 계산하여 출력해보세요

		for (int i = 0; i < scores.length; i++) {
			for (int j = 0; j < scores[i].length; j++) {
				sum += scores[i][j];
//				count++

			}

		}

		avg = sum / (double) count;
		System.out.println(sum);
		System.out.println(avg);

//		for (int[] arr : scores) {
//			for (int val : arr){
//				sum +=val;
//		향상된 for문
	}
}
