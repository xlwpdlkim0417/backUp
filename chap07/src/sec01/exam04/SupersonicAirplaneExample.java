package sec01.exam04;
//super 변수

public class SupersonicAirplaneExample {

	public static void main(String[] args) {

		SupersonicAirplane sa = new SupersonicAirplane();
		// SupersonicAirplane 클래스의 객체를 참조하는 변수 sa 선언
		// new 연산자와 SupersonicAirplane의 생성자로 인스턴스 생성 후 메모리 주소 저장

		sa.takeOff();
		// sa.로 SupersonicAirplane의 부모 클래스에서 take off() 메소드 호출
		sa.fly();
		// sa.로 SupersonicAirplane 클래스에서 재정의 된 fly() 메소드 호출
		sa.flyMode = SupersonicAirplane.SUPERSONIC;
		// sa.로 SupersonicAirplane 클래스의 필드 값 선언
		// SupersonicAirplane.로 상수 SUPERSONIC 값 저장
		sa.fly();
		// sa.로 SupersonicAirplane 클래스에서 재정의 된 fly() 메소드 호출
		sa.flyMode = SupersonicAirplane.NORMAL;
		// sa.로 SupersonicAirplane 클래스의 필드 값 선언
		// SupersonicAirplane.로 상수 NORMAL 값 저장
		sa.fly();
		// sa.로 SupersonicAirplane 클래스에서 재정의 된 fly() 메소드 호출
		sa.land();
		// sa.로 SupersonicAirplane의 부모 클래스에서 land() 메소드 호출
	}
}