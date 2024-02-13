package _2024_01_03;

public class IntegerLiteralEx {

	public static void main(String[] args) {
		byte var1 = -128;
//		byte var2 = -129; < 얘는 범위를 벗어나서 담기지가 않음
		byte var3 = 127;
//		byte var4 = 128; < 얘도 범위를 벗어나서 담기지가 않음
		short var5 = -32768;
//		short var6 = -32769; < 얘도 범위를 벗어나서 담기지가 않음

		int var7 = 0b01;
		System.out.println(var7);
		int var8 = 0xf;
		System.out.println(var8);

		long var9 = 100000000000L;
//		int var10 = 100000000000;

		char var11 = 'A'; // 여기 큰따옴표 쓰면 안됨
		char var13 = '\uac00';
		int var12 = 'A';
		System.out.println(var11);
		System.out.println(var12);
		System.out.println(var13);

		String str = "가";
		String abc = "가\"나\"다";
		String abcd = "가\\나\\다";
		System.out.println(abc);
		System.out.println(abcd);

		float var14 = 0.25F;
		double var15 = 1.8e307;
		System.out.println(var15);
	}
}