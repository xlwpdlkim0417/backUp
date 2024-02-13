package java_2024_01_04;

import java.util.Scanner;

public class MultipleTwoNum {

	public static void multi(Scanner scanner) { // 곱하기

		System.out.print("첫번째 수:");
		String strNum1 = scanner.nextLine();

		System.out.print("두번째 수:");
		String strNum2 = scanner.nextLine();

		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		int result = num1 * num2;

		System.out.println("곱셈 결과:" + result);

	}

	public static void main(String[] args) { // 메소드 호출

		Scanner scanner = new Scanner(System.in);

		multi(scanner);

	}

}
