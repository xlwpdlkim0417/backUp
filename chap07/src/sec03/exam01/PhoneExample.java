package sec03.exam01;

public class PhoneExample {

	public static void main(String[] args) {
		
//		Phone phone = new Phone;	//추상클래스는 객체 생성이 안됨
		
		Smartphone smartphone = new Smartphone("홍길동");
		
		smartphone.turnOn();	//Phone의 메소드
		smartphone.internetSearch();
		smartphone.turnOff();	//Phone의 메소드

	}

}
