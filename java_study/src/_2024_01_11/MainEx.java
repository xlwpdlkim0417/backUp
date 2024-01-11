package _2024_01_11;

public class MainEx {

	public static void main(String[] args) {

		if (args.length != 2) {
			System.out.println("값의 수가 부족합니다.");
			System.exit(0); // 괄호 안에 0은 일반적으로 정상종료를 뜻함
		}
		String str = args[0];
		System.out.println(str);

	}

}
