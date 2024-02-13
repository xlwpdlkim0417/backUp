package java_2024_01_16;

class AAA {
	public AAA() {
		System.out.println("생성자A");
	}
}

class BBB extends AAA {
	public BBB() {
		super();
		System.out.println("생성자B");
	}
}

class CCC extends BBB {
	public CCC() {
		super();
		System.out.println("생성자C");
	}
}

public class ConstructorEx {

	public static void main(String[] args) {

		CCC c = new CCC();

	}

}
