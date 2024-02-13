package java_2024_01_22.page408_1;

public class Ex {

	public static void main(String[] args) {
		A a = new A(); // 클래스 A가 가지고 있는 멤버를 쓰기 위해서 별도로 객체 생성한 거임
		A.B b = a.new B();
		/* = */ A.B b1 = new A().new B();
		b.field1 = 3;
		b.method1();
	}
}