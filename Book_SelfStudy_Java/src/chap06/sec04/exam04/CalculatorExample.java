package chap06.sec04.exam04;
//Calculator의 execute 실행

public class CalculatorExample {

	public static void main(String[] args) {

		Calculator myCalc = new Calculator();
		// Calculator 클래스의 객체를 참조하는 myCalc에
		// new 연산자로 인스턴스 생성 후 메모리 주소 저장

		myCalc.execute();
		// myCalc.로 Calculator 클래스의 execute() 메소드 호출 / 실행
	}
}