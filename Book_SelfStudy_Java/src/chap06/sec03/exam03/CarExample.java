package chap06.sec03.exam03;
//객체 생성 시 생성자 선택

public class CarExample {

	public static void main(String[] args) {

		Car car1 = new Car();
		// Car 클래스를 참조하는 car1에
		// new 연산자로 객체 생성 후 메모리 주소 저장
		System.out.println("car1.company: " + car1.company);
		// 변수 car1 + 도트연산자(.)로 Car 클래스의 필드 company 읽기
		System.out.println();

		Car car2 = new Car("자가용");
		// Car 클래스를 참조하는 변수 car2에
		// new 연산자로 객체 생성 후 메모리 주소 저장
		// 생성자의 매개변수 전달
		System.out.println("car2.company: " + car2.company);
		// 변수 car2 + 도트연산자(.)로 Car 클래스의 필드 company 읽기
		System.out.println("car2.model: " + car2.model);
		// 변수 car2 + 도트연산자(.)로 Car 클래스의 필드 model 읽기
		System.out.println();

		Car car3 = new Car("자가용", "빨강");
		// Car 클래스를 참조하는 변수 car3에
		// new 연산자로 객체 생성 후 메모리 주소 저장
		// 생성자의 매개변수 전달
		System.out.println("car3.company: " + car3.company);
		// 변수 car3 + 도트연산자(.)로 Car 클래스의 필드 company 읽기
		System.out.println("car3.model: " + car3.model);
		// 변수 car3 + 도트연산자(.)로 Car 클래스의 필드 model 읽기
		System.out.println("car3.color: " + car3.color);
		// 변수 car3 + 도트연산자(.)로 Car 클래스의 필드 color 읽기
		System.out.println();

		Car car4 = new Car("택시", "검정", 200);
		// Car 클래스를 참조하는 변수 car4에
		// new 연산자로 객체 생성 후 번지 저장
		// 생성자의 매개변수 전달
		System.out.println("car4.company: " + car4.company);
		// 변수 car4 + 도트연산자(.)로 Car 클래스의 필드 company 읽기
		System.out.println("car4.model: " + car4.model);
		// 변수 car4 + 도트연산자(.)로 Car 클래스의 필드 model 읽기
		System.out.println("car4.color: " + car4.color);
		// 변수 car4 + 도트연산자(.)로 Car 클래스의 필드 color 읽기
		System.out.println("car4.maxSpeed: " + car4.maxSpeed);
		// 변수 car4 + 도트연산자(.)로 Car 클래스의 필드 maxSpeed 읽기
	}
}