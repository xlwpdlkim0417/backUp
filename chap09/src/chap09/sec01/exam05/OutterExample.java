package sec01.exam05;
//실행 클래스

public class OutterExample {

	public static void main(String[] args) {
		Outter outter = new Outter();
		// Outter 클래스의 객체를 참조하는 변수 outter 선언
		// Outter 클래스의 생성자로 인스턴스 생성 후 메모리 주소 저장
		Outter.Nested nested = outter.new Nested();
		// Outter 클래스의 내부 인스턴스 멤버 클래스 Nested 클래스의 객체를 참조하는 변수 nested 선언
		// Outter.Nested nested = new Outter().new Nested();
		// Outter 클래스 내부의 인스턴스 멤버 클래스 Nested 클래스의 생성자로 인스턴스 생성 후 메모리 주소 저장

		nested.print();
	}
}