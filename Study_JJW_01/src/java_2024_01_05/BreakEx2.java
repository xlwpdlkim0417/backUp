package java_2024_01_05;

public class BreakEx2 {

	public static void main(String[] args) {

		aaa: for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (i == 3 && j == 3) {
					break aaa; //이거 aaa 없는 거랑 있는거랑 차이 직접 돌려봐
				}
				System.out.printf("(%d, %d)\n", i, j);
			}
		}

	}

}
