package _2024_01_03;

import java.util.Random;
import java.util.Scanner;

public class RandomMultiplication {

	public static void main(String[] args) {

		Scanner sc1 = new Scanner(System.in);
//		String inputData;	이거 Scanner할 때는 문자 입력이낚

//			Random rd1 = new Random();
//			System.out.print(rd1.nextInt(9+1));	

//			Random rd2 = new Random();
//			System.out.print(rd2.nextInt(9+1));

		while (true) {

			int num1 = (int) (Math.random() * 9 + 1);
			int num2 = (int) (Math.random() * 9 + 1);

			int num3 = num1 * num2;

			System.out.printf("%d X %d = ", num1, num2);
			int inputData = sc1.nextInt(); // nextint인점 if nextLine 쓰려면 integer.parseInt 이거 서야됨 캡쳐해둠
			if (inputData == num3) {
				System.out.println("정답입니다");
			} else {
				System.out.println("오답입니다");
				break;
			}

		}
	}
}
