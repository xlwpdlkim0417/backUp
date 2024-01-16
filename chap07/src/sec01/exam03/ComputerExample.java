package sec01.exam03;

public class ComputerExample {

	public static void main(String[] args) {

		int r = 10;

		Calculator calculator = new Calculator();

		System.out.println("원면적 : " + calculator.areaCircle(r)); // 이거 재정의하면서 숨겨지는거 아닌가? 부모 클래스에 대한 객체를 만들어서 부모 클래스의
																	// 메소드가 숨겨지지 않고 드러난거임?
		System.out.println();

		Computer computer = new Computer();
		System.out.println("원면적 : " + computer.areaCircle(r)); // 재정의 된 메소드 호출

	}

}
