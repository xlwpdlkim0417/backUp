package Bank;

import java.util.Scanner;

public class Bank_Basic_System {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String inputName;
		String inputResidentNumber;
		String inputPhoneNumber;

		Bank accountInfo = null;
		Bank[] data = new Bank[10];

		boolean run1 = true;

		boolean login = true;
		boolean signUp = true;
		boolean signIn = false;

		int idx = 0;
//		int s1 = 0;

		while (run1) {
			System.out.println("-------------------------------------");
			if (signIn) {
				System.out.println(accountInfo.name + "고객님으로 로그인 상태입니다.");
			}
			System.out.println("1.로그인 | 2.회원가입 | 3.예금/출금 | 4.종료");
			System.out.println("-------------------------------------");
			System.out.print("선택> ");

			int menuNum = Integer.parseInt(scanner.nextLine());

			switch (menuNum) {

			case 1:
				// 로그인 처리
				while (login) {
					System.out.println("<로그인>");
					System.out.print("아이디:");
					String id = scanner.nextLine();
					System.out.print("패스워드:");
					String pw = scanner.nextLine();

					for (int i=0; i<idx; i++) {
					if (id.equals(data[i].name) && pw.equals(data[i].residentNumber)) {
						System.out.println("로그인 성공");
//							idx = i;
						login = false;
						signIn = true;
						break;
					} else {
						System.out.println("로그인 실패");
						System.out.println("1.로그인 재시도 2.메인화면으로 돌아가기");
						System.out.print("선택> ");
						menuNum = Integer.parseInt(scanner.nextLine());
						switch (menuNum) {
						case 1:
							break;
						case 2:
							login = false;
						} // switch문의 괄호
					}
					}	//for문의 괄호					
				}
				login = true;
				signIn = true;
				break;

			case 2:
				// 회원 가입 //회원가입을 할 때마다 idx 값을 늘릴 방법을 찾아보자

//				while (signUp) {	//idx=1;

//					for (s1 = idx; s1 < idx+1; idx++, s1++) {

				System.out.println("<회원 가입>");

				System.out.println("[필수 정보 입력]");
				System.out.print("1. 아이디: ");
				String name = scanner.nextLine();
				System.out.print("2. 패스워드: ");
				String residentNumber = scanner.nextLine();
				System.out.print("3. 전화번호: ");
				String phoneNumber = scanner.nextLine();

				accountInfo = new Bank(idx, name, residentNumber, phoneNumber, 0);
//						String accountInfoname = accountInfo.name;
//						String accountInfonumber = accountInfo.residentNumber;
				data[idx] = accountInfo;

				System.out.println(accountInfo);
//						break;

//					}
				idx++;
//					s1++;
				signUp = false;

//				}
				signUp = true;
				break;

			case 3:
				// 예금 출금

				if (!signIn) {
					System.out.println("로그인 후 사용하세요.");
					break;
				}
				System.out.println("<예금/출금>");

				boolean run2 = true;
				int balance = 0;

				while (run2) {
					System.out.println("-------------------------------------");
					System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
					System.out.println("-------------------------------------");
					System.out.print("선택> ");
					int menuNum2 = Integer.parseInt(scanner.nextLine());
					switch (menuNum2) {
					case 1:
						System.out.print("예금액> ");
						accountInfo.balance += Integer.parseInt(scanner.nextLine());
						break;
					case 2:
						System.out.print("출금액> ");
						data[idx].balance -= Integer.parseInt(scanner.nextLine());
						break;
					case 3:
						System.out.print("잔고> ");
						System.out.println(data[idx].balance);
						break;
					case 4:
						run2 = false;
						break;
					}
					System.out.println();
				}

				break;

			case 4:
				run1 = false;
				break;
			}
		}
		System.out.println("프로그램 종료");
	}
}
