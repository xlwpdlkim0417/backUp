package java_2024_01_18.design.pattern;

//국산 차량 문 생산
public class KoreaDoorProduct extends DoorProduct {

	@Override
	public String makeAssemble() {
		return "문이 열립니다.";
	}

}
