package java_2024_01_05;

public class BreakEx {

	public static void main(String[] args) {
		for (int i=0; i<100; i++) {
			if (i == 55) {
//				System.out.println(i);
//				break;		//루프를 빠져나감
				continue;	//break는 
			}
			System.out.println(i);	//문제? 마지막 숫자는?
		}
		System.out.println("종료");

	}

}
