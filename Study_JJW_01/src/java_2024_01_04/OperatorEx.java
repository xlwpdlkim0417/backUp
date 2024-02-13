package java_2024_01_04;

public class OperatorEx {

	public static void main(String[] args) {

		System.out.println(0.1 == 0.1F); // false인 이유? 왼쪽은 double 값, 오른쪽은 float 값이라서 해결방법? 1.왼쪽을 float로 casting 2.오른쪽을
											// double로? 이건 안돼 이미 뒤에 F 붙은 시점에서 double보다 값이 작아져서 한정됐음
		System.out.println(3 == 3.0);
		System.out.println('A' == 65);
		System.out.println("=====================");

		boolean b1 = 'A' < 'B';
		System.out.println(b1);
		// 그렇다면?
		int num2 = 'B' - 'A';
		System.out.println(num2);
		// "문자열 타입"으로는 안되지만 '프리미티브 타입'인 char는 가능

		String str = "JDK" + (3 + 3.0);
		System.out.println(str);

		for (int i = 0; i < 10; i++) {
			char c1 = (char) ('A' + i); // p.117 'A' + i 이 부분이 인티저 처리가 되기 때문에 앞에 char casting이 필요함
			System.out.print(c1);
		}

		System.out.println();
		System.out.println("────────────────────");

		char c1 = 'A' + 1;
		System.out.println(c1);
		System.out.println("────────────────────");

		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) { // 2의 수
				System.out.println(i);
			}
		}

		System.out.println("────────────────────");

		int num = 10 % 3;
		System.out.println(num); // 10을 3으로 나눈 나머지 : 1

		boolean play = true;
		System.out.println(!play);

		int x = 1;
		int y = 1;
		int result1 = ++x + 10; // ++x : x에 1만큼 증가 답은 12
		System.out.println(result1);
		int result2 = y++ + 10; // 얘는 답이 11 왜? 위에 있는 건 x=1일 때 1을 더해서 (앞에 ++붙어서) 그 다음에 10을 더함 얘는? 1이랑 10이랑 더하고 그
								// 다음에 ++하는 것 (p.112 참고)

		System.out.println(result2);
		System.out.println("x: " + x + ", y: " + y);

//		byte b = 100;
//		byte result = -b; // -1 * b 연산 결과가 정수임

	}

}
