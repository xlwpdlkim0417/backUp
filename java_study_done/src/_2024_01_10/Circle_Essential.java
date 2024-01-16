package _2024_01_10;

public class Circle_Essential {

	int radius; // 원의 반지름 필드
	String name; // 원의 이름을 필드

	public double getArea() { // 멤버 메소드

		return 3.14 * radius * radius;
	}

	public Circle_Essential() {

	}

	public Circle_Essential(int radius) { // 이렇게 this()로 생성자 축약해서 표현하려면 이 매개변수를 포함한 필드값을 초기화하는 아래의 this.=가 필요함
		this(radius, "어떤 원");
	}

	public Circle_Essential(int radius, String name) {
//			super();
		this.radius = radius;
		this.name = name;
	}

}
