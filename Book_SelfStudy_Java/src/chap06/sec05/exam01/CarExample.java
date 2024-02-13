package chap06.sec05.exam01;
//인스턴스 멤버와 this

public class CarExample {

	public static void main(String[] args) {

		Car myCar = new Car("포르쉐");
		// Car 클래스의 객체를 참조하는 myCar에
		// new 연산자로 인스턴스 생성 후 메모리 주소 저장
		// model = "포르쉐" ▷ 인스턴스 필드값 저장
		Car yourCar = new Car("벤츠");
		// Car 클래스의 객체를 참조하는 yourCar에
		// new 연산자로 인스턴스 생성 후 메모리 주소 저장
		// model = "벤츠" ▷ 인스턴스 필드값 저장

		myCar.run();
		// myCar.로 외부 Car 클래스의 인스턴스 메소드 호출
		yourCar.run();
		// yourCar.로 외부 Car 클래스의 인스턴스 메소드 호출
	}
}