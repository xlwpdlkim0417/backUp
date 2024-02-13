package java_2024_01_18.design.pattern;

public class StateCarFactory extends CarFactory {

	@Override
	public TireProduct createTire() {
		return new StateTireProduct();
	}

	@Override
	public DoorProduct createDoor() {
		return new StateDoorProduct();
	}

}
