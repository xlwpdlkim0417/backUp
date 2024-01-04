package _2024_01_03;

import java.util.Scanner;

public class P130_Example_11 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("아이디:");
		String name = scanner.nextLine();
		
		System.out.print("패스워드");
		String strPassword = scanner.nextLine();
		int password = Integer.parseInt(strPassword);
		
		if(name.equals("java")) {
			if (password == 12345) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("로그인 실패 : 패스워드가 틀림");
			}
		} else {
			System.out.println("로그인 실패 : 아이디 존재하지 않음");
		}
		

	}

}
// 문자열 동등한지 비교할 때는 == 쓸 수 없는건가? yes 쓸 수 없음 문자열에는 .equals() 쓰는게 맞다