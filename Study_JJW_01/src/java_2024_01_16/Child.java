package java_2024_01_16;

class Parent2 extends Child { // 조부모클래스 : Parent 부모클래스 : Child 자식클래스 : Parent2 / 자식클래스 입장에서 생성자를 호출할때는 자신의 부모인
								// Child만 신경쓰면 됨

}

class Parent3 { // 부모클래스
	int money = 100;

	void disp() {
		System.out.println(money);

	}

}

public class Child extends Parent3 { // 자식클래스

	Child() { // 생성자
		this.money += 300;

	}

	public static void main(String[] arge) {

		Child ch = new Child();

		ch.disp(); // 부모의 메소드 실행
//		System.out.println(ch.money);

	}

}
