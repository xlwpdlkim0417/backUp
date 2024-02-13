package java_2024_01_22.page408_2;

public class Ex {

	public static void main(String[] args) {
		A.C.field2 = 3; // 아래의 A.C c = new A.C(); 객체 생성과 상관없이 static이기 때문에 접근 가능
		A.C.method2(); // 아래의 A.C c = new A.C(); 객체 생성과 상관없이 static이기 때문에 접근 가능

		A.C c = new A.C(); // 바깥 클래스는 static 클래스라는 점을 알 수 있음 그래서 바로 A.C로 접근할 수 있는거임
		c.field1 = 3;
		c.method1();

	}

}
