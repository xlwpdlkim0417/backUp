package _2024_01_16;

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
		Session session = new Session(true, false);

		ArrayList<Account> list = new ArrayList<>();

		boolean run1 = true;

		while (run1) {
			System.out.println("───────────────────────────────────────");
			System.out.println("1.회원출력 2.회원등록 3.파일저장 4.파일읽기 5.종료 ");
			System.out.println("───────────────────────────────────────");
			System.out.print("입력> ");

			int Enum = Integer.parseInt(scanner.nextLine());

			switch (Enum) {

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
				// 파일저장
				System.out.println("<파일저장>");

				FileOutputStream fos = new FileOutputStream("C:/temp/prj_3rd.db");
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				oos.writeObject(list);
				oos.flush();
				oos.close();

				break;

			case 4:
				// 파일읽기
				System.out.println("<파일읽기>");

				FileInputStream fis = new FileInputStream("C:/temp/prj_3rd.db");
				ObjectInputStream ois = new ObjectInputStream(fis);
				list = (ArrayList<Account>) ois.readObject();

				for (Account account : list) {
					System.out.println(account);
				}

				ois.close();

				break;

			case 5:
				// 종료
				System.out.println("종료");
				run1 = false;
				break;
			}
		}

	}

}
