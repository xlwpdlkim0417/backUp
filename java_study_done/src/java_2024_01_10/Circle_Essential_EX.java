package _2024_01_10;

public class Circle_Essential_EX {

	public static void main(String[] args) {

		Circle_Essential[] c; // Circle_Essential 배열의 변수 c

		c = new Circle_Essential[5]; // 원 다섯 개를 넣을 수 있는 방이 생김

		for (int i = 0; i < c.length; i++) { // 방에 원 다섯개를 넣음
			c[i] = new Circle_Essential(i);
		}

		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i].getArea());
		}

	}

}
