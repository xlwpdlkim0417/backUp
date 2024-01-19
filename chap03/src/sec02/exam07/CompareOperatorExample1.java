package sec02.exam07;

public class CompareOperatorExample1 {

	public static void main(String[] args) {

		int num1 = 10; // int 타입 변수 num1에 정수 리터럴 값 10 저장
		int num2 = 10; // int 타입 변수 num2에 정수 리터럴 값 10 저장

		boolean result1 = (num1 == num2);	//boolean 타입 변수 result1에 (괄호) 내부 
		boolean result2 = (num1 != num2);
		boolean result3 = (num1 <= num2);

		System.out.println("result1=" + result1);
		System.out.println("result2=" + result2);
		System.out.println("result3=" + result3);

		char char1 = 'A';
		char char2 = 'B';
		boolean result4 = (char1 < char2);
		System.out.println("result4=" + result4);

	}

}
