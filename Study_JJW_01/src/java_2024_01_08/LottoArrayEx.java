package java_2024_01_08;

import java.util.Random;

public class LottoArrayEx {

	public static void main(String[] args) {

		int[] lotto = new int[6]; // 인덱스는 0~5번까지 개수는 6개

		Random rand = new Random();

//		lotto[0] = rand.nextInt();
//		lotto[0] = rand.nextInt();
//		lotto[0] = rand.nextInt();
//		lotto[0] = rand.nextInt();
//		lotto[0] = rand.nextInt();
//		lotto[0] = rand.nextInt(); //일일이 쓰지말고 반복문으로 써보십쇼

		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = rand.nextInt(45) + 1; // 45를 넣으면 0부터 44까지 나오고 +1해서 1부터 45까지 나옴
			System.out.println(lotto[i]);
		}

		System.out.println("────────────────────");

		for (int val : lotto) {
			System.out.println(val);
		}

	}

}
