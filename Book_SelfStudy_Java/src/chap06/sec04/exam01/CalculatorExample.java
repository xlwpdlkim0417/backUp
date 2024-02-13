package chap06.sec04.exam01;
//메소드 호출

public class CalculatorExample {

	public static void main(String[] args) {

		Calculator myCalc = new Calculator();
		// Calculator 클래스의 객체를 참조하는 변수 myCalc에
		// new 연산자로 인스턴스 생성 후 메모리 주소 저장

		myCalc.powerOn();
		// myCalc + 도트연산자(.)로 Calculator 클래스의 powerOn() 메소드 호출/실행

		int result1 = myCalc.plus(5, 6);
		// int 타입 변수 result1에
		// myCalc + 도트연산자(.)로 Calculator의 plus() 메소드 호출
		// 매개 변수로 메소드 실행 후 결과값 리턴해서 저장
		System.out.println("result1: " + result1);

		byte x = 10;
		byte y = 4;
		double result2 = myCalc.divide(x, y);
		// double 타입 result2에
		// myCalc + (.)로 Calculator 클래스의 divide()메소드 호출
		// 매개 변수로 메소드 실행 후 결과값 리턴해서 저장
		System.out.println("result2: " + result2);

		myCalc.powerOff();
		// myCalc + (.)로 Calculator 클래스의 powerOff() 메소드 호출/실행
	}
}