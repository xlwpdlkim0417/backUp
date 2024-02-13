package chap02.sec02.exam01;
//정수 리터럴

public class IntegerLiteralExample {

	public static void main(String[] args) {

		int var1 = 0b1011; // 2진수 //정수 타입 변수 var1에 리터럴 값을 저장
		int var2 = 2026; // 8진수 //정수 타입 변수 var2에 리터럴 값을 저장
		int var3 = 365; // 10진수 //정수 타입 변수 var2에 리터럴 값을 저장
		int var4 = 0xB3; // 16진수 //정수 타입 변수 var2에 리터럴 값을 저장

		System.out.println("var1: " + var1); // 정수 타입 변수 var1에 저장된 값을 출력
		System.out.println("var2: " + var2); // 정수 타입 변수 var2에 저장된 값을 출력
		System.out.println("var3: " + var3); // 정수 타입 변수 var3에 저장된 값을 출력
		System.out.println("var4: " + var4); // 정수 타입 변수 var4에 저장된 값을 출력
	}
}