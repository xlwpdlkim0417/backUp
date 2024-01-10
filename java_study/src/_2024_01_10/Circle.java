package _2024_01_10;

public class Circle {

	int radius; // 원의 반지름 필드
	String name; // 원의 이름을 필드

	public int getRadius() {

		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getArea() { // 원의 넓이 구하는 메소드
		return 3.14 * radius * radius;
	}

}
