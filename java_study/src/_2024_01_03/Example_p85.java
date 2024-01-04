package _2024_01_03;

public class Example_p85 {

	public static void main(String[] args) {
//		char c1 = 'a';
//		char c2 = (char) (c1 +1);

		int x = 5;
		int y = 2;
		double result1 = (double) x / y;
		System.out.println(result1);

		double var1 = 3.5;
		double var2 = 2.7;
		int result2 = (int) var1 + (int) var2; // 이거 이렇게 하지말고 (int) (var1 + var2)로 가야함
		System.out.println(result2);

		long var3 = 2L;
		float var4 = 1.8F;
		double var5 = 2.5;
		String var6 = "3.9";

		int result3 = (int) var3 + (int) (var4 + var5) + Integer.parseInt(var6); // 이거 바로 인티저로 하지말고 더블로 먼저 해야됨
		// (int)Double.parseDouble(var6) 이렇게 해야할듯
		System.out.println(result3);

	}

}
