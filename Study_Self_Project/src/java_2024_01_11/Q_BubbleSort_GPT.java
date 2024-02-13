package java_2024_01_11;

public class Q_BubbleSort_GPT {

	public static void main(String[] args) {

		int[] arr = { 64, 34, 25, 12, 22, 11, 90 };

		System.out.println("정렬 전 배열:");
		printArray(arr);

		// 버블 소트 호출
		bubbleSort(arr);

		System.out.println("정렬 후 배열:");
		printArray(arr);
	}

	// 버블 소트 구현
	static void bubbleSort(int arr[]) {

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				// 현재 원소와 다음 원소를 비교하여 순서가 올바르지 않으면 교환
				if (arr[j] > arr[j + 1]) {
					// Swap arr[j] and arr[j+1]
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					printArray(arr);
				}
			}
		}
	}

	// 정렬된 배열 출력
	static void printArray(int arr[]) {

		for (int i = 0; i < arr.length; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();

	}

}
