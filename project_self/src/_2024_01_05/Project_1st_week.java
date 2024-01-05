package _2024_01_05;

import java.util.Scanner;

public class Project_1st_week {

	public static void login(Scanner scanner, String inputIDNum, String inputName, String savedID, String savedPassword,
			int savedpass) {

		System.out.print("아이디:");
		String name = scanner.nextLine();

		System.out.print("패스워드");
		String strPassword = scanner.nextLine();

		int password = Integer.parseInt(strPassword);
		int passNum = Integer.parseInt(inputIDNum);
		int savedPass = Integer.parseInt(savedPassword);

		if (name.equals(inputName) && password == passNum) {

			System.out.println();
			System.out.println("로그인 성공");
			System.out.println();
			money(scanner);
			return;

		} else if (name.equals(savedID) && password == savedPass) {

			System.out.println();
			System.out.println("로그인 성공");
			System.out.println();
			money(scanner);
			return;

		} else {

			System.out.println();
			System.out.println("로그인 실패, 다시 입력해주십시오");
			System.out.println();
			login(scanner, inputIDNum, inputName, savedID, savedPassword, savedpass);

			return;
		}

	}

	public static void join(Scanner scanner) {

		System.out.println();
		System.out.println("[필수 정보 입력]");

		System.out.print("1. 이름: ");
		String inputName = scanner.nextLine();

		System.out.print("2. 주민번호 앞 6자리: ");
		String inputIDNum = scanner.nextLine();

		System.out.print("3. 전화번호: ");
		String inputPhone = scanner.nextLine();
		System.out.println();

		String savedID = inputName;
		String savedPassword = inputIDNum;

		int savedPass = 0000;

		login(scanner, inputIDNum, inputName, savedID, savedPassword, savedPass);

	}

	public static void money(Scanner scanner) {

		int saveOrigin = 10000;
		int plusMoney = 0;
		int minusMoney = 0;

		boolean run = true;

		while (run) {

			System.out.println("-------------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔액 | 4.초기화면");
			System.out.println("-------------------------------------");
			System.out.print("선택> ");

			int menuNum = Integer.parseInt(scanner.nextLine());

			switch (menuNum) {

			case 1:
				// 예금
				System.out.println();
				System.out.println("예금액을 입력하십시오.");
				System.out.print("입력> ");
				plusMoney = Integer.parseInt(scanner.nextLine());
				System.out.println("예금액: " + plusMoney);

				break;

			case 2:
				// 출금
				System.out.println();
				System.out.println("출금액을 입력하십시오.");
				System.out.print("입력> ");
				minusMoney = Integer.parseInt(scanner.nextLine());
				System.out.println("출금액: " + minusMoney);

				break;

			case 3:
				// 잔액
				System.out.println();
				System.out.println("잔액: " + (saveOrigin + plusMoney - minusMoney));

				break;

			case 4:
				run = false;
				break;
			}
		}
	}

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
				// 로그인 처리
				System.out.println("회원가입을 진행해주십시오");
				break;

			case 2:
				// 회원 가입
				join(scanner);
				break;

			case 3:
				// 예금 출금
				System.out.println("회원가입을 진행해주십시오");
				break;

			case 4:
				run = false;
				break;
			}
		}
		System.out.println("프로그램 종료");
	}

}