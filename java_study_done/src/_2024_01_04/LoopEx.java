package _2024_01_04;

public class LoopEx {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}

		System.out.println("────────────────────");

		int i = 0;
		while (i < 10) { // 이렇게 쓴 for문과 while문은 기능이 같음 아래까지 출력값이 다 같음
			System.out.println(i);
			i++;
		}

		System.out.println("────────────────────");

		int j = 0;
		do {
			System.out.println(j);
			j++;
		} while (j < 10);

		System.out.println("────────────────────");

		int k = 0;
		for (; k < 10;) {
			System.out.println(k);
			k++;
		}

		System.out.println("────────────────────");

		int h = 0;
		for (;;) {
			if (h >= 10) {
				break;
			}
			System.out.println(h);
			h++;
		}

	}

}
