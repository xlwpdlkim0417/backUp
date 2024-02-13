package java_2024_01_12;

import java.util.Scanner;

public class ProjectBasic {

	static Scanner scanner = new Scanner(System.in); // static필드 = 정적필드

	public static void disp1() {
		System.out.println("-------------------------------------");
		System.out.println("1.로그인 | 2.회원가입 | 3.예금/출금 | 4.종료");
		System.out.println("-------------------------------------");
	}

	public static void disp2() {
		System.out.println("-------------------------------------");
		System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.상위메뉴");
		System.out.println("-------------------------------------");
	}

	public static void menu2(Session session) {
//		boolean run = true;
		while (session.isRun2()) { //// menu1에서 3으로 들어갔다가 나올 때 프로그램이 종료되는 문제가 발생하는데 그거 menu1이랑 menu2의 run 변수가 같아서
									//// 그럼 run2로 바꾸면 해결
			disp2();
			System.out.print("선택> ");
			int menuNum = Integer.parseInt(scanner.nextLine());
			switch (menuNum) {
			case 1:
				// 로그인 처리
				System.out.println("로그인 처리");
				break;
			case 2:
				// 회원 가입
				System.out.println("회원 가입");
				break;
			case 3:
				// 예금 출금
				System.out.println("예금 출금");
				break;
			case 4:
//				session.run = false;	//캡슐화(매립=숨김) 하고 싶었는데 클래스에 메소드가 없어서 캡슐화가 안되네
//				session.setRun2(false); // 도트 연산자를 메소드에만 쓰는게 좋음 //menu1에서 3으로 들어갔다가 나올 때 프로그램이 종료되는 문제가 발생하는데 그거 menu1이랑
										// menu2의 run 변수가 같아서 그럼 run2로 바꾸면 해결
				session.setMenuState(MenuState.DEPOSI_EXIT);
				break;

			}
		}
	}

	public static void menu1(Session session) {
//		boolean run = true;
		while (session.isRun()) {

			disp1();
			System.out.print("선택> ");
			int menuNum = Integer.parseInt(scanner.nextLine());
			switch (menuNum) {
			case 1:
				// 로그인 처리
				System.out.println("로그인 처리");
				break;
			case 2:
				// 회원 가입
				System.out.println("회원 가입");
				break;
			case 3:
				// 예금 출금
				System.out.println("예금 출금");
				if (session.getLoginInfo() != null) { // 로그인이 성공 후 (loginInfo != null)
//					session.setRun2(true);
					session.setMenuState(MenuState.DEPOSIT); // 세션의 메소드를 따라가보면 session.setRun2(true); 이거랑 같은 기능을 하는거임 /
																// 열거타입의 올바른 사용법
					menu2(session); // 메소드를 만들어서 메인에 갖다 박는게 아니라 다른 메소드에 넣을 수도 있네

				}

				break;
			case 4:
//				session.run = false;	//캡슐화(매립=숨김) 하고 싶었는데 클래스에 메소드가 없어서 캡슐화가 안되네
//				session.setRun(false); // 도트 연산자를 메소드에만 쓰는게 좋음
				session.setMenuState(MenuState.TOP_EXIT);
				System.out.println("프로그램 종료");

				break;
			}
		}
	}

	public static void main(String[] args) {

		LoginInfo loginInfo = new LoginInfo("id", "pass"); // 객체 만듦

		Session session = new Session(true, false, loginInfo);
//		session.run = true;

		menu1(session);

	}
}
