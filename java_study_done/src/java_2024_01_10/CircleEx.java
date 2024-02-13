package _2024_01_10;

public class CircleEx { // 반지름과 이름을 가진 Circle 클래스를 작성하고, Circle 클래스의 객체를 생성하라

//	int radius; // 원의 반지름 필드
//	String name; // 원의 이름을 필드
//
//	public double getArea() { // 원의 넓이 구하는 메소드
//		return 3.14 * radius * radius;
//	}

	public static void main(String[] args) {

		Circle pizza;
		pizza = new Circle(); // Circle 객체 생성

//		pizza.radius = 10; // 피자의 반지름을 10으로 설정		
//		pizza.name = "자바피자"; // 피자의 이름 설정
		pizza.setRadius(10);
		pizza.setName("자바피자");
		double area = pizza.getArea(); // 피자의 면적 알아내기
		System.out.println(pizza.getName() + "의 면적은 " + area); // 이렇게 쓰는게 맞음?

		CircleEx donut = new CircleEx(); // Circle 객체 생성

//		donut.radius = 2; // 도넛의 반지름을 2로 설정		
//		donut.name = "자바도넛"; // 도넛의 이름 설정		
//		area = donut.getArea(); // 도넛의 면적 알아내기		
//		System.out.println(donut.name + "의 면적은 " + area);
	}

}
