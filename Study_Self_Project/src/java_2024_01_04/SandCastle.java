package java_2024_01_04;

import java.util.Scanner;

public class SandCastle {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		boolean run = true;

		while (run) {

			System.out.println("-------------------------------------");
			System.out.println("1.로그인 | 2.회원가입 | 3.예금/출금 | 4.종료");
			System.out.println("-------------------------------------");
			System.out.print("선택> ");

			int menuNum = Integer.parseInt(scanner.nextLine());

			switch (menuNum) {

			case 1:
				// 로그인 전에 회원가입 진행 > 회원가입 데이터 기반으로 로그인 진행

				System.out.println();
				System.out.println("회원가입을 진행해주세요 \n");
				join(scanner);
				money(scanner);

				break;

			case 2:
				// 회원가입 데이터 기반으로 로그인 진행

				join(scanner);
				money(scanner);

				break;

			case 3:
				// 예금 출금

				System.out.println("회원가입을 진행해주세요");
				join(scanner);
				money(scanner);

				break;

			case 4:
				run = false;
				break;
			}
		}
		System.out.println("프로그램 종료");

	}

	public static void join(Scanner scanner) {

		String inputName;
		String inputResidentNumber;
		String inputPhoneNumber;
		String name;
		String strPassword;
		int residentNumberAsInt;

		System.out.println("[필수 정보 입력]");
		System.out.print("1. 이름: ");
		inputName = scanner.nextLine();
		System.out.print("2. 주민번호 앞 6자리: ");
		inputResidentNumber = scanner.nextLine();
		System.out.print("3. 전화번호: ");
		inputPhoneNumber = scanner.nextLine();
		System.out.println();
		System.out.println("로그인 하십시오");

		System.out.print("아이디:");
		name = scanner.nextLine();
		System.out.print("패스워드");
		strPassword = scanner.nextLine();

		int password = Integer.parseInt(strPassword);
		residentNumberAsInt = Integer.parseInt(inputResidentNumber);

		if (name.equals(inputName) && password == residentNumberAsInt) {

			System.out.println();
			System.out.println("로그인 성공");

		} else {
			System.out.println();
			System.out.println("로그인 실패");
			
		

		}
		

	}

	public static void money(Scanner scanner) {

		boolean run = true;

		while (run) {

			System.out.println("-------------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔액 | 4.종료");
			System.out.println("-------------------------------------");
			System.out.print("선택> ");

			int menuNum = Integer.parseInt(scanner.nextLine());

			switch (menuNum) {

			case 1:
				// 예금
				System.out.println("예금 기능 업데이트 예정");
				break;

			case 2:
				System.out.println("예금 기능 업데이트 예정");
				break;

			case 3:
				System.out.println("예금 기능 업데이트 예정");
				break;

			case 4:
				run = false;
				break;

			}

		}
	}
}