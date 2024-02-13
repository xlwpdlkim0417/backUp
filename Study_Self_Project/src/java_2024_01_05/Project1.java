package java_2024_01_05;

import java.util.Scanner;

public class Project1 {
	public static void login(boolean loginStatus, Scanner scanner, String memberName, String memberSSN ) {
//		if (loginStatus) { // 로그인 여부 확인
//			System.out.println("이미 로그인 상태입니다.");
//			continue; // 이 부분에서 반복문의 시작으로 돌아감
//		}
		
		System.out.print("아이디:"); // 출력문
		String name = scanner.nextLine(); // name 변수의 값 입력
		System.out.print("패스워드:");
		String strPassword = scanner.nextLine();// 패스워드입력
		int password = Integer.parseInt(strPassword); // strpassword값을 정수로 변환
		if (name.equals(memberName)) {
			if (strPassword.equals(memberSSN)) {
				System.out.println("로그인 성공");
				loginStatus = true;
			} else {
				System.out.println("로그인 실패:패스워드가 틀림");
			}
		} else {
			System.out.println("로그인 실패:아이디 존재하지 않음");
		}
	}
	
	
	public static void main(String[] args) {

		String memberName = ""; // 회원 이름
//		String memberName;	//위랑 아래랑 뭐가 다른거임? ㅇㅋ 초기값을 설정하는거임 선언만 하면 초기값 설정하라고 하기 때문에 이거 근데 ""; 값이라서 문자열이라 비번은 나중에 Integer.parseInt() 해줘야 함
		String memberSSN = ""; // 회원 생년원일 (패스워드로 사용)
		String memberTel = ""; // 회원 전화번호

		boolean loginStatus = false; // 로그인 여부
		boolean membershipStatus = false; // 회원가입 여부

		boolean run2 = false;
		
		Scanner scanner = new Scanner(System.in);

		boolean run = true;

		aaa: while (run) { // 어떤 문자를 쓰고 콜론을 쓰면 레이블이 됨 어떤 위치에 대한 정보
			System.out.println("-------------------------------------");
			System.out.println("1.로그인 | 2.회원가입 | 3.예금/출금 | 4.종료");
			System.out.println("-------------------------------------");
			System.out.print("선택> ");

			int menuNum = Integer.parseInt(scanner.nextLine());

			switch (menuNum) {

			case 1:
				// 로그인 처리
//				System.out.println("로그인 처리");

				if (loginStatus) { // 로그인 여부 확인
					System.out.println("이미 로그인 상태입니다.");
					continue; // 이 부분에서 반복문의 시작으로 돌아감
				}

				System.out.print("아이디:"); // 출력문
				String name = scanner.nextLine(); // name 변수의 값 입력
				System.out.print("패스워드:");
				String strPassword = scanner.nextLine();// 패스워드입력
				int password = Integer.parseInt(strPassword); // strpassword값을 정수로 변환
				if (name.equals(memberName)) {
					if (strPassword.equals(memberSSN)) {
						System.out.println("로그인 성공");
						loginStatus = true;
					} else {
						System.out.println("로그인 실패:패스워드가 틀림");
					}
				} else {
					System.out.println("로그인 실패:아이디 존재하지 않음");
				}
				break;
			case 2:
				// 회원 가입
//				System.out.println("회원 가입");

				if (membershipStatus) { // 회원가입 여부 확인
					System.out.println("이미 회원가입을 하셨습니다.");
					System.out.println("n회원이름: " + memberName);
//					continue;		//이 부분에서 반복문의 시작으로 돌아감
					do {
						System.out.print("가입절차를 계속 진행 하시겠습니까? (y/n)");
						String answer = scanner.nextLine();
						if (answer.equals("n") || answer.equals("N")) {
//							run = true;
							continue aaa;
						} else if (answer.equals("y") || answer.equals("Y")) {
							break;
						}
					} while (true);
				}

				System.out.println("[필수 정보 입력]");
				System.out.print("1. 이름: ");
				memberName = scanner.nextLine(); // 이거 String으로 정의하지말고 변수로 적어야 연동할 수 있음
				System.out.print("2. 주민번호 앞 6자리: ");
				memberSSN = scanner.nextLine();
				System.out.print("3. 전화번호: ");
				memberTel = scanner.nextLine();
				System.out.println();
				System.out.println("[입력된 내용]");
				System.out.println("1. 이름: " + memberName);
				System.out.println("2. 주민번호 앞 6자리: " + memberSSN);
				System.out.println("3. 전화번호: " + memberTel);

				membershipStatus = true;

				break;
			case 3:
				// 예금 출금
				
				if (loginStatus) {
					run2 = true;
				} else {
					System.out.println("로그인 하시기 바립니다.");
				}
				
//				boolean run2 = true;
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
						balance += Integer.parseInt(scanner.nextLine());
						break;
					case 2:
						System.out.print("출금액> ");
						balance -= Integer.parseInt(scanner.nextLine());
						break;
					case 3:
						System.out.print("잔고> ");
						System.out.println(balance);
						break;
					case 4:
						run2 = false;
						break;
					}
					System.out.println();
				}
				System.out.println("프로그램 종료");
				break;
			case 4:
				run = false;
				break;
			}
		}
		System.out.println("프로그램 종료");
	}
}