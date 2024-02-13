package java_2024_01_08;

import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {

		int max = 0;
		int index = 0;
		int[] array = { 1, 5, 3, 8, 2 };

//		for (배열의타입 변수 : 배열의이름) {
//			if (max < num) {
//				max = num;
//			}
//		}

//		for (int i = 0; i < array.length; i++) {
//			for (int i = 0; i < array.length; i++) {
//				if (max <= array[i]) {// max 값과 배열의 값
//					max = array[i]; // max보다 큰 값을 max에 저장
//					index = i;
//				}
//
//			}
//		}

		System.out.println("최대값: " + max);
		System.out.println("인덱스: " + index);

		//

		Scanner scanner = new Scanner(System.in);
		System.out.print("입력할 개수 : ");

		int count = scanner.nextInt();

		int[] input = new int[count];

		for (int j = 0; j < input.length; j++) {
			System.out.print("정수입력 : ");
//			input[j] = scanner.nextInt();

		}

		for (int val : input) {
			if (max < val)
				max = val;
		}
		System.out.println("최대값 : " + max);

	}
}
