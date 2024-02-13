package java_2024_01_18.design.pattern;

public class KoreaCarFactory extends CarFactory {

	@Override
	public TireProduct createTire() {
		return new KoreaTireProduct();
	}

	@Override
	public DoorProduct createDoor() {
		return new KoreaDoorProduct();
	}

}
