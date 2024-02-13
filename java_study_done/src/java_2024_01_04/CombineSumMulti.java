package _2024_01_04;

import java.util.Scanner;

public class CombineSumMulti {

	public static void sumMulti(Scanner scanner) {

		System.out.print("첫번째 수:");
		String strNum1 = scanner.nextLine();

		System.out.print("두번째 수:");
		String strNum2 = scanner.nextLine();

		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		int result1 = num1 + num2;
		int result2 = num1 * num2;

		System.out.println("덧셈 결과:" + result1);
		System.out.println("곱셈 결과:" + result2);

	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		sumMulti(scanner);

	}

}
