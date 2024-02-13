package java_Bank;

import java.util.Scanner;

public class Methods {

	public static Scanner scanner = new Scanner(System.in);

	public void dsp1() {
		System.out.println("-------------------------------------");
		System.out.println("1.로그인 | 2.회원가입 | 3.예금/출금 | 4.종료");
		System.out.println("-------------------------------------");
	}

	public void dsp2() {
		System.out.println("-------------------------------------");
		System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.상위메뉴");
		System.out.println("-------------------------------------");
	}

	public void menu2(Session session) {
		while (session.isRun2()) {
			dsp2();
			System.out.print("선택> ");
			int menuNum = Integer.parseInt(scanner.nextLine());
			switch (menuNum) {
			case 1:
				// 예금
				System.out.println("예금");
				break;
			case 2:
				// 출금
				System.out.println("출금");
				break;
			case 3:
				// 잔고
				System.out.println("잔고");
				break;
			case 4:
//				session.setRun2(false);
				session.setMenuState(MenuState.DEPOSIT_EXIT);
				break;
			}
		}
	}

	public void menu1(Session session, Account accountInfo, Account member[], LoginInfor loginInfo) {

		while (session.isRun()) {
			dsp1();
			System.out.print("선택> ");
			int menuNum = Integer.parseInt(scanner.nextLine());
			switch (menuNum) {
			case 1:
				// 로그인 처리
				System.out.println("<로그인>");
				System.out.print("아이디: ");
				loginInfo.id = scanner.nextLine();
				System.out.print("패스워드: ");
				loginInfo.pw = scanner.nextLine();

				for (int i = 0; i < member.length; i++) {

					if (loginInfo.id.equals(member[i].name) && loginInfo.pw.equals(member[i].residentNum)) {
						session.setMenuState(MenuState.LOGIN);
//						accountInfo.idx = i;

						if (session.isLogin()) {
							System.out.println(member[i].name + "고객님으로 로그인 상태입니다.");
						}

					}
				}
				System.out.println("로그인 성공");
				break;
			case 2:
				// 회원 가입
				session.setMenuState(MenuState.SIGNIN);

				System.out.println("<회원 가입>");

				System.out.println("[필수 정보 입력]");
				System.out.print("1. 아이디: ");
				accountInfo.name = scanner.nextLine();
				System.out.print("2. 패스워드: ");
				accountInfo.residentNum = scanner.nextLine();
				System.out.print("3. 전화번호: ");
				accountInfo.phoneNum = scanner.nextLine();

				for (int i = 0; i < member.length; i++) {
					member[i] = accountInfo;
				}
//				
				System.out.println(member[accountInfo.idx]);
				accountInfo.idx++;

				break;
			case 3:
				// 예금 출금
				System.out.println("예금 출금");
				menu2(session);
				break;
			case 4:
				// 종료
				System.out.println("프로그램 종료");
//				session.setRun(false);
				session.setMenuState(MenuState.MAIN_EXIT);
				break;
			}
		}
	}
}
