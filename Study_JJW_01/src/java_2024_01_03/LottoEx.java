package java_2024_01_03;

import java.util.Random;

public class LottoEx {

	public static void main(String[] args) {
//		System.out.println(Math.PI);

		for (int i = 0; i < 6; i++) {
//			int num = Math.random()*45 +1; //오류발생 부분은
			int num = (int) (Math.random() * 45 + 1);
//			System.out.println(Math.random());	//난수발생 방법1
			System.out.println(num);
		}
//여기서 중복을 제거하려면 어떻게 해야할까?
		System.out.println("────────────────────");

		// 난수발생 방법2
		Random rd = new Random();
		for (int i = 0; i < 6; i++) {
//			System.out.println(rd.nextInt(10)); //0~9
//			System.out.println(rd.nextInt(10)+1); //1~10
			System.out.println(rd.nextInt(45) + 1); // 1~45

			// 중복 제거를 위한 방안 강구는 여전히 필요
		}
	}
}