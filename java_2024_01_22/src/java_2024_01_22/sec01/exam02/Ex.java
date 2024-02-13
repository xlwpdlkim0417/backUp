package sec01.exam02;

public class Ex {

	public static void main(String[] args) {

		A.method2();
		A.B b = A.field3; // 변수선언
		A.C c = A.field4;

		A a = new A();
		a.method();

		A.B b1 = a.field1;
		A.C c1 = a.field2;

	}

}
