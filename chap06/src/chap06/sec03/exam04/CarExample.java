package sec03.exam04;
//객체 생성 시 생성자 선택

public class CarExample {

	public static void main(String[] args) {

		Car car1 = new Car();
		// Car 클래스의 객체를 참조하는 변수 car1에
		// new 연산자로 인스턴스 생성 후 메모리 주소 저장
		System.out.println("car1.company : " + car1.company);
		System.out.println();

		Car car2 = new Car("자가용");
		System.out.println("car2.company : " + car2.company);
		System.out.println("car2.model : " + car2.model);
		System.out.println();

		Car car3 = new Car("자가용", "빨강");
		System.out.println("car3.company : " + car3.company);
		System.out.println("car3.model : " + car3.model);
		System.out.println("car3.color : " + car3.color);
		System.out.println();

		Car car4 = new Car("택시", "검정", 200);
		// Car 클래스의 객체를 참조하는 변수 car4에
		// new 연산자로 인스턴스 생성 후 메모리 주소 저장
		System.out.println("car4.company : " + car4.company);
		// 변수 car4 + 도트연산자(.)로 Car 클래스의 필드 company 읽기
		System.out.println("car4.model : " + car4.model);
		// 변수 car4 + 도트연산자(.)로 Car 클래스의 필드 model 읽기
		System.out.println("car4.color : " + car4.color);
		// 변수 car4 + 도트연산자(.)로 Car 클래스의 필드 color 읽기
		System.out.println("car4.maxSpeed : " + car4.maxSpeed);
		// 변수 car4 + 도트연산자(.)로 Car 클래스의 필드 maxSpeed 읽기
	}
}