package java_2024_01_18.design.pattern;

//미국산 도어 생산
public class StateDoorProduct extends DoorProduct {

	@Override
	public String makeAssemble() {
		return "Door is open";
	}

}
