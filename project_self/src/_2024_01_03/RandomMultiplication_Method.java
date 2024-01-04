package _2024_01_03;

import java.util.Random;
import java.util.Scanner;

public class RandomMultiplication_Method {

	public static int createNumber(Random rd1) {
		//Random rd1 = new Random();
		return rd1.nextInt(10) + 1;
	}

	public static void multiplication() {

		Random rd1 = new Random();
		Scanner sc1 = new Scanner(System.in);

//		int num1 = rd1.nextInt(10) + 1;
		int num1 = createNumber(rd1);
		int num2 = rd1.nextInt(10) + 1;
		int num3 = num1 * num2;

		System.out.printf("%d X %d = ?\n", num1, num2);
		for (;;) {
			System.out.print("입력>");
			int answer = Integer.parseInt(sc1.nextLine());
			if (answer == num3) {
				System.out.println("정답입니다!");
				break;
			} else {
				System.out.println("오답입니다!");
			}
		}

	}

	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			multiplication();
		}
		System.out.println("종료");
	}

}
