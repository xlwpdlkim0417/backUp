package _2024_01_09;

public class CalEx {

	public static void main(String[] args) {

		Cal.sx = 500; // Cal. 이거 클래스 이름임

		Cal cal = new Cal();
		cal.power(); // 메소드를 사용하려면 객체를 생성해야하함

		cal.x = 100; // Cal.java에서 정의했던 거 그걸 실행하는 과정에서 100이라는 값으로 정의해 준거임
		cal.printx();

		Cal cal2 = new Cal();
		System.out.println(cal2.x);
		cal2.power();

	}

}
