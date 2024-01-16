package _2024_01_16;

public class People {
	String name;

	public People() {

	}

	public People(String name) { // 변수생성자를 만들었더니 자식클래스에 만들어진 기본생성자와 달라서 오류가 생김
//		super();
		this.name = name;
	}

	void method1() {

	}

}
