package chap07.sec01.exam03;
// 메소드 재정의 테스트

public class ComputerExample {

	public static void main(String[] args) {

		int r = 10;
		// ComputerExample의 로컬 변수

		Calculator calculator = new Calculator();
		// Calculator 클래스의 객체를 참조하는 변수 calculator 선언
		// new 연산자와 Calculator 클래스의 생산자로 인스턴스 생성 후 메모리 주소 저장

		System.out.println("원면적 : " + calculator.areaCircle(r));
		// ??
		System.out.println();

		Computer computer = new Computer();
		// Computer 클래스의 객체를 참조하는 변수 computer 선언
		// new 연산자와 Computer 클래스의 생성자로 인스턴스 생성 후 메모리 주소 저장
		System.out.println("원면적 : " + computer.areaCircle(r)); // 재정의 된 메소드 호출
		// computer.로 재정의 된 메소드 areaCircle() 호출
		// 매개 변수 : r
	}
}