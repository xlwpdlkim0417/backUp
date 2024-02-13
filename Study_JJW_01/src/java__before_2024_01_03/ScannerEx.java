package java__before_2024_01_03;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String inputData;

		while (true) {
			System.out.print("입력>");
			inputData = scan.nextLine(); // 엔터를 치면
			System.out.printf("입력된 문자열:%s\n", inputData);
			if (inputData.equals("q")) { // 입력된 문자열이 q이면
				break; // 반복문을 빠져나감
			}
		}
		System.out.println("종료");
	}

}
