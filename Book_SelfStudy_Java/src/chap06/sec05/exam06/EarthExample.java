package chap06.sec05.exam06;
//상수 사용

public class EarthExample {

	public static void main(String[] args) {

		System.out.println("지구의 반지름: " + Earth.EARTH_RADIUS + " km");
		// 상수 EARTH_RADIUS는 static 속성을 가지고 있으므로 클래스이름.으로 호출 가능
		System.out.println("지구의 표면적: " + Earth.EARTH_AREA + " km^2");
	}
}