package java_2024_01_18.design.pattern;

//자동차 생산 공정 규격
public abstract class CarFactory {

	public abstract TireProduct createTire();	//리턴 타입은 TireProduct 추상 클래스로 리턴한 거임 왜? 한국 자동차일 때는 KoreaTireProduct로 리턴하려고

	public abstract DoorProduct createDoor();

}
