package java_2024_01_04;

import java.util.Scanner;

public class MiniProject {

	public static void moneyleft(Scanner scanner) {

		boolean run = true;
		int balance = 0;

		while (run) {
			System.out.println("──────────────────────────────");
			System.out.println("1.예금 │ 2.출금 │ 3.잔고 │ 4.종료");
			System.out.println("──────────────────────────────");
			System.out.print("선택> ");

			int num = scanner.nextInt();

			if (num == 1)
				System.out.println("예금액> 10000 \n");

			if (num == 2)
				System.out.println("출금액> 2000 \n");

			if (num == 3)
				System.out.println("잔고> 8000 \n");

			if (num == 4)
				System.out.println("");
		}

	}

	public static void join (Scanner scanner) {

		String inputName;
		String inputResidentNumber;
		String inputPhoneNumber;

		System.out.println();
		System.out.println("[필수 정보 입력]");
		System.out.print("1. 이름: ");
		inputName = scanner.nextLine();
		System.out.print("2. 주민번호 앞 6자리: ");
		inputResidentNumber = scanner.nextLine();
		System.out.print("3. 전화번호: ");
		inputPhoneNumber = scanner.nextLine();
		System.out.println();
		
		int residentNumberAsInt = Integer.parseInt(inputResidentNumber);
		
		boolean run = true;
		
//		while (run) {
			System.out.println("-------------------------------------");
			System.out.println("1.로그인 | 2.회원가입 | 3.예금/출금 | 4.종료");
			System.out.println("-------------------------------------");
			System.out.print("선택> ");
			
			int menuNum = Integer.parseInt(scanner.nextLine());

			switch (menuNum) {

			case 1:
				
				System.out.print("아이디:");
				String name = scanner.nextLine();

				System.out.print("패스워드");
				String strPassword = scanner.nextLine();
				int password = Integer.parseInt(strPassword);

				if (name.equals(inputName)) {
					if (password == residentNumberAsInt) {
						System.out.println("로그인 성공");
					} else {
						System.out.println("로그인 실패 : 패스워드가 틀림");
					}
				} else {
					System.out.println("로그인 실패 : 아이디 존재하지 않음");
				}
				menu1(scanner);
				break;
			case 2:
				
	
				
				break;
			case 3:
				// 예금 출금
				break;
			case 4:
				run = false;
				break;
			}
		}

	//}

	public static void login(Scanner scanner) {

		System.out.print("아이디:");
		String name = scanner.nextLine();

		System.out.print("패스워드");
		String strPassword = scanner.nextLine();
		int password = Integer.parseInt(strPassword);

		if (name.equals("inputName")) {
			if (password == 1234) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("로그인 실패 : 패스워드가 틀림");
			}
		} else {
			System.out.println("로그인 실패 : 아이디 존재하지 않음");
		}

	}

	public static void menu1 (Scanner scanner) {
		
		boolean run = true;
		
		while (run) {
			System.out.println("-------------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.로그아웃 | 4.종료");
			System.out.println("-------------------------------------");
			System.out.print("선택> ");

			int menuNum = Integer.parseInt(scanner.nextLine());

			switch (menuNum) {

			case 1:
				// 
				break;
			case 2:
				// 회원 가입
				break;
			case 3:
				// 예금 출금
				switch (menuNum) {
				
				case 1:
					//회원가입 O = 로그인 창 안내
					System.out.println("로그인 연결");
					
				case 2:
					//회원가입 X = 회원가입 창 안내
					System.out.println("회원가입 연결");
				
				}
				break;
			case 4:
				run = false;
				break;
			}
		}
		System.out.println("프로그램 종료");
		
	}
	
	
	public static void main(String[] args) {

		String inputName;
		String inputResidentNumber;
		String inputPhoneNumber;
		
		Scanner scanner = new Scanner(System.in);

		boolean run = true;

//		while (run) {
			System.out.println("-------------------------------------");
			System.out.println("1.로그인 | 2.회원가입 | 3.예금/출금 | 4.종료");
			System.out.println("-------------------------------------");
			System.out.print("선택> ");

			int menuNum1 = Integer.parseInt(scanner.nextLine());
//			int menuNum2 = Integer.parseInt(scanner.nextLine());
			
			switch (menuNum1) {

			case 1:
				// 로그인 처리
				login(scanner);
				break;
			case 2:
				// 회원 가입
				join(scanner);
				
				break;
			case 3:
				// 예금 출금
				
				System.out.println("기존회원은 1, 회원가입을 희망하시면 2를 눌러주세요");
				int menuNum2 = Integer.parseInt(scanner.nextLine());
				
				switch (menuNum2) {
				
				case 1:
					//회원가입 O = 로그인 창 안내
					login(scanner);
					menu1(scanner);
					break;
					
				case 2:
					//회원가입 X = 회원가입 창 안내
					join(scanner);
					login(scanner);
					menu1(scanner);
					
				break;
			case 4:
				run = false;
				break;
			}
		}
//		System.out.println("프로그램 종료");
	}
}
//}
