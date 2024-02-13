package java_2024_01_16;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Project_3rd_Week {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Scanner scanner = new Scanner(System.in);

		Account acc = new Account();

		Session session = new Session(true, false, false);

		ArrayList<Account> list = new ArrayList<>();

		while (session.isRun1()) {
			System.out.println("──────────────────────────────────────────────────────");
			System.out.println("1.회원출력 2.회원등록 3.로그인 4.예금/출금 5.종료");
			System.out.println("──────────────────────────────────────────────────────");
			System.out.print("입력> ");

			int num = Integer.parseInt(scanner.nextLine());

			switch (num) {

			case 1:
				// 회원출력
				System.out.println("<회원출력>");
				for (Account account : list) {
					System.out.println(account);
				}

				break;

			case 2:
				// 회원등록
				System.out.println("<회원등록>");
				System.out.print("1.이름: ");
				acc.name = scanner.nextLine();
				System.out.print("2.생년원일: ");
				acc.ssn = scanner.nextLine();
				System.out.print("3.전화번호: ");
				acc.phn = scanner.nextLine();
				System.out.print("4.아이디: ");
				acc.id = scanner.nextLine();
				System.out.print("5.비밀번호: ");
				acc.pw = scanner.nextLine();

				System.out.println(acc);

				list.add(new Account(acc.name, acc.ssn, acc.phn, acc.id, acc.pw, acc.balance));

				break;

			case 3:
				// 로그인
				session.setLoginInfo(false);

				System.out.println("<로그인>");
				System.out.print("아이디: ");
				String userID = scanner.nextLine();
				System.out.print("비밀번호: ");
				String userPW = scanner.nextLine();

				for (int i = 0; i < list.size(); i++) {
					list.get(i);
					if (userID.equals(list.get(i).id) && userPW.equals(list.get(i).pw)) {
						System.out.println(list.get(i).name + "회원님으로 로그인");
						break;
					}
//					else if (!userID.equals(list.get(i).id) || !userPW.equals(list.get(i).pw)) {
//						System.out.println("로그인 재시도");
//					}

				}

//				if (userID.equals(account.id) && userPW.equals(account.pw)) {
//					System.out.println(account.name + "님 환영합니다.");
//					session.setLoginInfo(true);

//				}

				break;

			case 4:
				// 잔고

				session.setMenu(MenuState.DEPOSIT_START);

				while (session.isRun2()) {
					System.out.println("────────────────────────────────────────────");
					System.out.println("1.예금 2.출금 3.이체 4.잔고 5.종료");
					System.out.println("────────────────────────────────────────────");
					System.out.print("입력> ");

					int num2 = Integer.parseInt(scanner.nextLine());

					switch (num2) {
					case 5:
						// 종료
						session.setMenu(MenuState.DEPOSIT_END);
						break;

					}
				}

			case 5:
				// 파일저장
				System.out.println("<파일저장>");
				FileOutputStream fos = new FileOutputStream("C:/temp/prj_3rd.db");
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				oos.writeObject(list);
				oos.flush();
				oos.close();

				break;

			case 6:
				// 파일 읽기
				FileInputStream fis = new FileInputStream("C:/temp/prj_3rd.db");
				ObjectInputStream ois = new ObjectInputStream(fis);

				list = (ArrayList<Account>) ois.readObject();

//				for (Account account : list) {
//					System.out.println(account);
//				}
				ois.close();

				break;

			case 7:
				// 종료
				System.out.println("<종료>");
				session.setMenu(MenuState.MENU_END);

				break;

			}
		}

	}

}
