package _2024_01_04;

import java.util.Scanner;

public class Sum {

	public static void sum(Scanner scanner) {

		System.out.print("첫번째 수:");
		String strNum1 = scanner.nextLine();

		System.out.print("두번째 수:");
		String strNum2 = scanner.nextLine();

		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		int result = num1 + num2;

		System.out.println("덧셈 결과:" + result);
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in); // 메모리를 쓰는 공간이 다르기 때문에 여기에서 선언한다고 해서 하위의 별도 메소드에서 선언되는 것은 아님 대신에 서커스에서
													// 공중그네 넘어가듯이 매개변수로 하위 메소드에서 선언하면 메인에서 한 번 실행하면서 메모리 사용량을 낮출 수 있음
													// 메인에서 선언한 변수를 '받아서 넘겨주겠다'는 개념임

		sum(scanner); // 하위 메소드의 매개변수랑 다른 이유? 메모리를 별도로 쓴다그랬지? 그래서 하위 메소드에서 설정한 매개변수가 들어가는게 아니라 main에서
						// 설정한 변수가 들어가는 거임

	}

}
