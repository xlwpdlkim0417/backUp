package __before_2024_01_03;

import java.util.Scanner;

public class Sum2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); //입력을 위한 준비
		
		int sum = 0;
		
		System.out.print("숫자 입력>"); //처리 UI
		int num1 = Integer.parseInt(scan.nextLine()); //입력
		System.out.print("숫자 입력>"); // 처리 UI
		int num2 = Integer.parseInt(scan.nextLine()); //입력
		//int sum = num1 + num2; //계산
		//System.out.printf("두 수의 합은 %d\n", sum); //출력
		
		for (int i = num1; i <= num2; i++)	{
			sum += i;
		}
		System.out.printf(num1 + "부터 " + num2 + "까지의 합은 %d\n", sum);

	}

}
