package _2024_01_08;

import java.util.Scanner;

public class Project_with_JJW {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		boolean run = true;
		int studentNum = 0;
		int[] score = null;

		while (run) {
			System.out.println("──────────────────────────────────────────────────");
			System.out.println("1.학생 수 | 2.점수 입력 | 3.점수 리스트 | 4.분석 | 5.종료");
			System.out.println("──────────────────────────────────────────────────");
			System.out.print("선택> ");

			int menuNum = Integer.parseInt(scanner.nextLine());

			switch (menuNum) {

			case 1:
				// 학생수

				System.out.print("학생 수> ");
				studentNum = Integer.parseInt(scanner.nextLine());
				score = new int[studentNum];

				break;

			case 2:
				// 점수입력

				for (int i = 0; i < score.length; i++) {
					System.out.print("scores[" + (i + 1) + "]>");
					score[i] = Integer.parseInt(scanner.nextLine());
				}

				break;

			case 3:
				// 점수리스트

				for (int i = 0; i < score.length; i++) {
					System.out.println("scores[" + (i + 1) + "]:" + score[i]);
				}

				break;

			case 4:
				// 분석
				int max = 0, sum = 0;
				double avg = 0.0;
								
				for (int num : score) {
					if(max < num) {
						max = num;
					}
					sum += num;
					
					avg = sum / (double) studentNum;
					
					System.out.println("최고 점수 : " + max);
					
					System.out.println("총합 : " + sum);

					System.out.println("평균 : " + avg);
				}
				break;

			case 5:
				run = false;
				break;
			}
		}
		System.out.println("프로그램 종료");
	}
}
//각 파트 변수설정하는 방법 확인