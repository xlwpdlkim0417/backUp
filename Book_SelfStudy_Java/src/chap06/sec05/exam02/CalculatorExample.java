package chap06.sec05.exam02;
//정적 멤버 사용

public class CalculatorExample {

	public static void main(String[] args) {

		double result1 = 10 * 10 * Calculator.pi;
		// double 타입 result1에
		// (10 * 10 * Calculator 클래스의 정적 필드 pi) 연산식 값 저장

		int result2 = Calculator.plus(10, 5);
		// int 타입 result2에
		// Calculator 클래스의 정적 메소드 plus() 호출
		// 매개 변수로 전달된 값으로 메소드 실행 후 리턴값 저장
		int result3 = Calculator.minus(10, 5);
		// int 타입 result3에
		// Calculator 클래스의 정적 메소드 minus() 호출
		// 매개 변수로 전달된 값으로 메소드 실행 후 리턴값 저장

		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
	}
}