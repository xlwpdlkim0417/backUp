package java_2024_01_03;

import java.util.Random;

public class RandomMultiplication_Question {

	public static void main(String[] args) {

		Random rd1 = new Random();
		int num1 = rd1.nextInt(9) + 1; // 1~9값이 출력되는 건데, 0~9까지 넣으려면 그냥 10쓰면 됨

		Random rd2 = new Random();
		int num2 = rd2.nextInt(10);

		System.out.printf("%d X %d = ", num1, num2);
	}

}
