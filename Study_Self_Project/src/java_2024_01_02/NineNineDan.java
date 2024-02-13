package java_2024_01_02;

import java.util.Scanner;

public class NineNineDan {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); //입력을 위한 준비

		
		
		System.out.print("단을 입력하시오. > ");
		int x = Integer.parseInt(scan.nextLine());
		
		//for (int x = 2; x <= 9; x++) {
			for (int y = 1; y <=9; y++) {
				//System.out.print(x);
				//System.out.print(" X ");
				//System.out.print(y);
				//System.out.print(" = ");
				//System.out.println(x*y);
				
				System.out.printf("%d X %d = %d\n", x, y, x*y);
			//}
		}
	}
	}
