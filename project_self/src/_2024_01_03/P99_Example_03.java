package _2024_01_03;

import java.util.Scanner;

public class P99_Example_03 {// 예금

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String inputName;
		String inputResidentNumber;
		String inputPhoneNumber;

		System.out.println("[필수 정보 입력]");
		System.out.print("1. 이름: ");
		inputName = sc.nextLine();
		System.out.print("2. 주민번호 앞 6자리: ");
		inputResidentNumber = sc.nextLine();
		System.out.print("3. 전화번호: ");
		inputPhoneNumber = sc.nextLine();
		System.out.println("종료");

	}

}
// 보완점 01 : 주민번호, 전화번호 int 타입으로 입력해야되는거 같음
// 보완점 02 : 주민번호 입력할 때 자릿수 제한 있어야 하는지?
// 보완점 03 : 전화번호 폼펙터 필요한가? 예를 들면 중간에 미리 하이픈같은거 넣어야 되는건가?

// sc.nextLine();
