package java_2024_01_11;

public class Q_04_ArrayIndex {

	public static void main(String[] args) {

		int[] a = { 10, 3, 1, 4, 2 };

		int idx = 0; // 프린트를 못할 수도 있기 때문에 변수를 설정해서 확실하게 값을 저장해두는 거임

		for (int i = 0; i < a.length; i++) {
			if (a[i] == 4) {
				idx = i; // 이게 진짜 안되네
			}
		}
		System.out.println("인덱스 값: " + idx);
	}
}
// 인덱스