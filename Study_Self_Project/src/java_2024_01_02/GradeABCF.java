package java_2024_01_02;

import java.util.Scanner;

public class GradeABCF {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("점수를 입력하시오 = ");
		int score1 = Integer.parseInt(scan.nextLine());
		System.out.print("점수를 입력하시오 = ");
		int score2 = Integer.parseInt(scan.nextLine());
		System.out.print("점수를 입력하시오 = ");
		int score3 = Integer.parseInt(scan.nextLine());
		System.out.print("점수를 입력하시오 = ");
		int score4 = Integer.parseInt(scan.nextLine());
		System.out.print("점수를 입력하시오 = ");
		int score5 = Integer.parseInt(scan.nextLine());
		
		if(score1 >= 90 && score1 <=100) {
			System.out.print("A");
		} else if (score1 >= 80 && score1 <= 89) {
			System.out.print("B");
		} else if (score1 >= 70 && score1 <= 79) {
			System.out.print("C");
		} else if (score1 < 70) {
			System.out.print("F");
			
			if(score2 >= 90 && score2 <=100) {
				System.out.print("A");
			} else if (score2 >= 80 && score2 <= 89) {
				System.out.print("B");
			} else if (score2 >= 70 && score2 <= 79) {
				System.out.print("C");
			} else if (score2 < 70) {
				System.out.print("F");
				
				if(score3 >= 90 && score3 <=100) {
					System.out.print("A");
				} else if (score3 >= 80 && score3 <= 89) {
					System.out.print("B");
				} else if (score3 >= 70 && score3 <= 79) {
					System.out.print("C");
				} else if (score3 < 70) {
					System.out.print("F");
					
					if(score4 >= 90 && score4 <=100) {
						System.out.print("A");
					} else if (score4 >= 80 && score4 <= 89) {
						System.out.print("B");
					} else if (score4 >= 70 && score4 <= 79) {
						System.out.print("C");
					} else if (score4 < 70) {
						System.out.print("F");
						
						if(score5 >= 90 && score5 <=100) {
							System.out.print("A");
						} else if (score5 >= 80 && score5 <= 89) {
							System.out.print("B");
						} else if (score5 >= 70 && score5 <= 79) {
							System.out.print("C");
						} else if (score5 < 70) {
							System.out.print("F");
						}
					}
				}
			}
		}
	}
}
