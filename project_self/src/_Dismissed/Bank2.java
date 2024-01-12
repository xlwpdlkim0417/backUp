package _Dismissed;

import java.util.Scanner;

//public class BankSystem {
public class Bank2 {

	int idx;
	String name;
	String residentNumber;
	String phoneNumber;
	int balance;

	public Bank2(int idx, String name, String residentNumber, String phoneNumber, int balance) {
//			super();
		this.idx = idx;
		this.name = name;
		this.residentNumber = residentNumber;
		this.phoneNumber = phoneNumber;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Bank [idx=" + idx + ", name=" + name + ", residentNumber=" + residentNumber + ", phoneNumber="
				+ phoneNumber + ", balance=" + balance + "]";
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		boolean run1 = true;
		int idx = 0; // 회원 번호 부여를 위한 변수

		Bank[] data = new Bank[100]; // 최대 100명의 회원을 저장할 수 있는 배열
		Bank accountInfo;

		boolean signIn = false; // 로그인 상태를 나타내는 변수
		boolean login; // 로그인 중인지 여부를 나타내는 변수
		boolean signUp; // 회원 가입 중인지 여부를 나타내는 변수

		while (run1) {
			System.out.println("-------------------------------------");
			if (signIn && idx > 0) {
				System.out.println(data[idx - 1].name + "고객님으로 로그인 상태입니다.");
			}
			System.out.println("1.로그인 | 2.회원가입 | 3.예금/출금 | 4.종료");
			System.out.println("-------------------------------------");
			System.out.print("선택> ");

			int menuNum = Integer.parseInt(scanner.nextLine());

			switch (menuNum) {
			case 1:
				// 로그인 처리
				login = true;
				while (login) {
					System.out.println("<로그인>");
					System.out.print("아이디:");
					String id = scanner.nextLine();
					System.out.print("패스워드:");
					String pw = scanner.nextLine();

					for (int i = 0; i < idx; i++) {
						if (id.equals(data[i].name) && pw.equals(data[i].residentNumber)) {
							System.out.println("로그인 성공");
							signIn = true;
							login = false;
							break;
						}
					}

					if (login) {
						System.out.println("로그인 실패");
						System.out.println("1.로그인 재시도 2.메인화면으로 돌아가기");
						System.out.print("선택> ");
						int retryChoice = Integer.parseInt(scanner.nextLine());
						switch (retryChoice) {
						case 1:
							break;
						case 2:
							login = false;
							break;
						}
					}
				}
				break;

			case 2:
				// 회원 가입
				signUp = true;
				while (signUp) {
					System.out.println("<회원 가입>");

					System.out.println("[필수 정보 입력]");
					System.out.print("1. 아이디: ");
					String name = scanner.nextLine();
					System.out.print("2. 패스워드: ");
					String residentNumber = scanner.nextLine();
					System.out.print("3. 전화번호: ");
					String phoneNumber = scanner.nextLine();

					// 회원 정보 저장
					accountInfo = new Bank(idx + 1, name, residentNumber, phoneNumber, 0);
					data[idx] = accountInfo;

					System.out.println(accountInfo);
					idx++; // 다음 회원에게 새로운 번호 부여

					System.out.println("1.계속 회원가입 2.메인화면으로 돌아가기");
					System.out.print("선택> ");
					int continueChoice = Integer.parseInt(scanner.nextLine());
					if (continueChoice != 1) {
						signUp = false;
					}
				}
				break;

			// ... (다른 case에 대한 처리 추가)

			default:
				run1 = false; // 종료
				break;
			}
		}
	}
}
