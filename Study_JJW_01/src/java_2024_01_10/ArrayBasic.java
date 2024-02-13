package java_2024_01_10;

import java.util.Scanner;

public class ArrayBasic {

	public static void main(String[] args) {

		int[] arr1 = new int[] { 1, 2, 3, 4, 5 };
		int[] arr2 = new int[5]; // 위의 리터럴 값 넣는 것보다 아래와 같이 공간만 만들어두는 형식을 많이 쓸거임 심지어는 저 "5"라는 숫자도 스캐너로 입력받을 수 있음

		Scanner scanner = new Scanner(System.in);

		System.out.print("크기: ");
		int size = scanner.nextInt();

		int[] arr3 = null;
		arr3 = new int[size]; // 가능하면 이렇게 쓰는 걸 알아두거나 연습해두시게 왜? 선언과 초기화를 분리해서 쓸 경우가 있을거임

		int[] arr4 = null;
		arr4 = arr3; // 힙에 있는 메모리 주소값을 복사 = 레퍼런스 치환으로 두 레퍼런스가 같은 번지값을 갖는다
		arr4[1] = 100;
		System.out.println(arr3[1]); // arr4=arr3; 이라고 정의했기 때문에 arr4의 두 번째 값을 100으로 저장하면 자동으로 arr3의 두 번째 값도 100으로 바뀜
										// 만약 arr4[1]=100; 아래에 arr3[1]=200; 을 넣으면 두 배열의 두 번째 값은 200으로 변경됨

//		for (int i=0; i<arr3.length; i++) {
//			System.out.println(arr3[i]);
//		}

	}

}
