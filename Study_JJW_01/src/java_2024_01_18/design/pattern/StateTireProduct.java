package java_2024_01_18.design.pattern;

//미국산 타이어 생산
public class StateTireProduct extends TireProduct {

	@Override
	public String makeAssemble() {
		return "미국산 타이어";
	}

}
