package java_2024_01_03;

public class TypeEx {

	public static void main(String[] args) {

//		byte result = 10 + 20;

		byte value1 = 10;
		int value2 = 100;
//		byte sum = value1 + value2;
		int sum = value1 + value2; // int일 때는 성립함 하지만 byte일 때는 작은 방에 억지로 넣는거라

		int intValue = 10;
		double doubleValue = 5.5;
		int result = (int) (intValue + doubleValue);
		System.out.println(result);

		int x = 1;
		int y = 2;
		double result2 = x / y; // 둘 중 하나를 double로 casting하던지 둘 다 하던지 해야함 이걸 이해하려면 L24 확인
		System.out.println(result2);
//		System.out.println(1/2); 이거 값이 제대로 안나오면 1.0으로 쓰던가 2.0으로 쓰던가 둘 다 쓰던가임

		byte var1 = 127;
		int var2 = 129;
		long var3 = 100000000L;
		float var4 = var3;

//		var1 = var2;
		var1 = (byte) var2;
		System.out.println(var1); // 큰 값을 작은 방에 넣을 수는 있으나 오류가 발생할 수 있음

//		String str1 = 10 + 2; 이거 오류남
		String str2 = 10 + 2 + ""; // 문자열로 만들기의 꼼수
//		String str4 = "" + 10 + 2; 이거 바로 위 라인하고 결과값이 다름
		String str3 = String.valueOf(10 + 2); // 문자열로 만들기의 정석

		int num1 = Integer.parseInt(str2);

		String str5 = "3.14";
		double value = Double.parseDouble(str5);

	}

}
