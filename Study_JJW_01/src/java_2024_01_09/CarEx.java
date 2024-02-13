package java_2024_01_09;

public class CarEx {

	public static void main(String[] args) {

		String str = "가나다"; // 이건 지역(로컬) 변수임

		Car car4 = new Car("현대", "코나", "ver.1", 150);
		System.out.println(car4);

		Car car3 = new Car("현대자동차");
		System.out.println(car3);

		Car car2 = new Car(); // 이건 기본생성자를 "호출"하는 거임 기본생성자를 설정하지 않으면 컴파일러가 임의로 가지고 있다고 생각하면됨 근데 Car.java처럼 괄호
								// 안에 뭐라도 집어넣어서 기본생성자가 아니게 되면 거기서 불러오는거임
		System.out.println(car2);

		Car car = new Car();
		car.company = "KIA";
		car.color = "red";
		car.model = "K7";
		car.maxspeed = 200;

		System.out.println(car);

	}

}
