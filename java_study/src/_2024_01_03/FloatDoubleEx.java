package _2024_01_03;

public class FloatDoubleEx {

	public static void main(String[] args) {
		float num1 = 123.45678901234567890F;
		double num2 = 123.45678901234567890;

		System.out.println("float형   변수 num1 : " + num1);
		System.out.println("double형  변수 num2 : " + num2);

		double var = 0.1;
		for (int i = 0; i < 10; i++) { // 10회 반복의 용도
			var += 0.1;
		}
		System.out.println(var);

//		int v2 = 1e2;

	}
}