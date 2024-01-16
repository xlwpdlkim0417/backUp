package sec02.exam03;

public class KumhoTire extends Tire {

	// 필드

	// 생성자

	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}

	// 메소드

	@Override
	public boolean roll() {
		++accumulatedRotation; // 누적 회전수 1 증가
		if (accumulatedRotation < maxRotation) { // 정상 회전(누적<최대)일 경우 실행
			System.out.println(location + " KumhoTire 수명: " + (maxRotation - accumulatedRotation) + "회");
			return true;
		} else { // 펑크(누적=최대)일 경우 실행
			System.out.println("***" + location + " KumhoTire 펑크 ***");
			return false;
		}
	}

}
