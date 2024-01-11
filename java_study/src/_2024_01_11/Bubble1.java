package _2024_01_11;

public class Bubble1 {

	public static void printArr(int a[]) {
		for (int n : a) {
			System.out.print(n + ",");
		}
		System.out.println();
	}

	public static void main(String[] args) {

		int a[] = { 10, 3, 1, 4, 2 };

		printArr(a);
		for (int i = 0; i < a.length; i++) { // 반복 횟수
			for (int j = 0; j < a.length - 1; j++) { // a.length - 1; 이거 의미 한 번 더 파악하고 질문
				if (a[j] > a[j + 1]) { // 역순으로 하려면 여기 등호 바꿔주면 됨
					// 서로 값 바꾸기 (swap)
					int tmp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = tmp;
					printArr(a);
				}
			}
		}
		printArr(a);
//		for (int n : a) {
//			System.out.println(n + ",");
//		}
//		System.out.println();

	}

}
// 10, 3, 1, 4, 2 = 10, 3 비교
// 3, 10, 1, 4 ,2 = 10, 3 비교 + 교환 / 10, 1 비교
// 3, 1, 10, 4, 2 = 10, 1 비교 + 교환 / 10, 4 비교
// 3, 1, 4, 10, 2 = 10, 4 비교 + 교환 / 10, 2 비교
// 3, 1, 4, 2, 10 = 10, 2 비교 + 교환 / 3, 1 비교
// 1, 3, 4, 2, 10 = 3, 1 비교 + 교환 / 3, 4 비교
// 1, 3, 4, 2, 10 = 3, 4 비교 변화 없음 / 4, 2 비교
// 1, 3, 2, 4, 10 = 4, 2 비교 + 교환 / 4, 10 비교 
// 1, 3, 2, 4, 10 = 4, 10 비교 변화 없음 / 1, 3 비교 변화 없음
// 1, 2, 3, 4, 10 = 1, 3 비교 변화 없음

