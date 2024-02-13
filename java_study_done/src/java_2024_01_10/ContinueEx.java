package _2024_01_10;

public class ContinueEx {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			if (i == 6) {
				continue;
			}

			System.out.println("나올까요?"); // 오류가 나는 이유는 if 블록 없었을 때 continue; 때문에 도달할 수 없는 코드가 되었기 때문임
		}

	}

}
