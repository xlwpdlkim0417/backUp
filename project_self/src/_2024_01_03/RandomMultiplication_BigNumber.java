package _2024_01_03;

import java.util.Random;
import java.util.Scanner;

public class RandomMultiplication_BigNumber {

	public static void main(String[] args) {
		
		Random rd = new Random();
//		Random rd2 = new Random();
//		Random rd3 = new Random();
//		Random rd4 = new Random();

		Scanner sc1 = new Scanner(System.in);
		
		int num1 = rd.nextInt(10);
		int num2 = rd.nextInt(10);
		int num3 = num1*num2;
		
		System.out.printf("%d X %d = ?\n",num1,num2);
				
//		do {
			System.out.print("입력>");
			int answer = sc1.nextInt();
			
			if (answer == num3) {
				System.out.println("정답입니다.");
			} else {
				System.out.println("오답입니다.");
			}
		}
	}
//}
