package sec03.exam01;
//실행 클래스

public class PhoneExample {

	public static void main(String[] args) {

//		Phone phone = new Phone;
		// Cannot instantiate the type Phone
		// 추상 클래스는 객체 생성 불가능

		Smartphone smartphone = new Smartphone("홍길동");
		// Smartphone 클래스의 객체를 참조하는 변수 smartphone 선언
		// new 연산자와 Smartphone 클래스의 생성자로 인스턴스 생성 후 메모리 주소 저장
		// 매개 변수 : "홍길동"

		smartphone.turnOn();
		// smartphone.로 smartphone 클래스가 상속받은 Phone 클래스의 메소드 호출
		smartphone.internetSearch();
		// smartphone.로 smartphone 클래스의 메소드 호출
		smartphone.turnOff();
		// smartphone.로 smartphone 클래스가 상속받은 Phone 클래스의 메소드 호출
	}
}