package java_2024_01_10;

public class Circle2 {

	int radius;

	public Circle2(int radius) { // 생성할 때 주는 초기값
		this.radius = radius;
	}

	void set(int radius) { // 메소드 부를 때 변수 설정하는 것 몇 번이든 상관없음
		this.radius = radius;
	}

	public static void main(String[] args) {

		Circle2 cir1 = new Circle2(2); // 괄호 안의 값을 반지름으로 하는 객체를 생성하는 거임

//		Circle2 cir2 = cir1;

		cir1.set(4);
		System.out.println(cir1.radius);
		cir1.set(5);
		System.out.println(cir1.radius);
		cir1.set(6);
		System.out.println(cir1.radius);

	}

}
