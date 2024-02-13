package java_2024_01_08;

import java.util.Scanner;

public class ArrayEx {

	public static void main(String[] args) {

//		int[] scores = {83, 90, 87}; //int[] 자체가 선언부임 정수타입의 + 배열 int는 프리미티브 타입이지만 대괄호[] 붙이면서 참조타입이 되는거임
//		System.out.println(scores);

//		int[] scores = new int[3]; // 여기 숫자 3은 몇 개인지를 나타내는 표현임 → 합 영역 생성 개수

//		System.out.println(scores[0]);
//		System.out.println(scores[1]);
//		System.out.println(scores[2]);

//		System.out.println(scores[3]); //인덱스 범위를 벗어난 오류 왜? 힙영역에 [3]이 없어서

		Scanner scanner = new Scanner(System.in);
		System.out.println("생성할 정수 배열의 개수:");
		int num = scanner.nextInt(); // 아래와 같이 사용 가능

		int[] scores = new int[num]; // 여기 숫자 3은 몇 개인지를 나타내는 표현임 → 합 영역 생성 개수

		for (int i = 0; i < scores.length; i++) { // .length가 좋은 이유는 scanner랑도 쓸 수 있고 확장성이 좋다는 말임 배열은 힙영역에 자신의 길이를 나타내는
													// 필드를 담고있음 메소드인 length()랑은 다름
			System.out.println(scores[i]); // 여기 i는 index를 의미함
		}

		String str = "abc";
//		System.out.println(str.length());

		String[] names = new String[5];
		names[0] = str;
		names[1] = "김하나";
		names[2] = "강하나";

		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}

	}

}
