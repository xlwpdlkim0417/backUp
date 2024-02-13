package java_2024_01_08;

import java.util.Scanner;

public class Example_06_P201to202 {

	public static void main(String[] args) {

		boolean run = true;
		int studentNum = 0;
		int[] score = null;

		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("────────────────────────────────────────");
			System.out.println("1. 학생수 │ 2. 점수입력 │ 3. 점수리스트 │ 4. 분석 │ 5. 종료");
			System.out.println("────────────────────────────────────────");
			System.out.print("선택> ");

			int selectNo = Integer.parseInt(scanner.nextLine()); // 메뉴 선택 숫자 입력
//			int selectNo = scanner.nextInt();

			if (selectNo == 1) {

				System.out.print("학생 수> ");
//				studentNum = scanner.nextInt();

			} else if (selectNo == 2) {

				int[] array1 = new int[studentNum];

				for (int i = 0; i < array1.length; i++) {
					System.out.print("점수를 입력하세요: ");
//					array1[i] = scanner.nextInt();
				}

			} else if (selectNo == 3) {

			} else if (selectNo == 4) {

			} else if (selectNo == 5) {
				run = false;
			}

		}
		System.out.println("프로그램 종료");

	}

}
