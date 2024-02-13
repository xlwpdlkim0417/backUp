package chap06.sec04.exam05;
//클래스 외부에서 메소드 호출

public class CarExample {

	public static void main(String[] args) {

		Car myCar = new Car();
		// Car 클래스의 객체를 참조하는 myCar에
		// new 연산자로 인스턴스 생성 후 메모리 주소 저장

		myCar.keyTurnOn();
		// myCar.로 Car 클래스의 keyTurnOn() 메소드 호출
		myCar.run();
		// myCar.로 Car 클래스의 run() 메소드 호출
		int speed = myCar.getSpeed();
		// int 타입 speed에 myCar.로 Car 클래스의 getSpeed() 메소드 호출
		// 리턴값이 있는 메소드 ▷ 리턴값 speed에 저장
		System.out.println("현재 속도: " + speed + "km/h");
	}
}