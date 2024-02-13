package sec02.exam01;
//자동 타입 변환

class A {
}

class B extends A { // 상속
	// 부모 클래스 : A
	// 자식 클래스 : B
}

class C extends A { // 상속
	// 부모 클래스 : A
	// 자식 클래스 : C
}

class D extends B { // 상속
	// 부모 클래스 : B
	// 자식 클래스 : D
}

class E extends C { // 상속
	// 부모 클래스 : C
	// 자식 클래스 : E
}

public class PromotionExample {

	public static void main(String[] args) {

		B b = new B();
		// B 클래스의 객체를 참조하는 변수 b 선언
		// new 연산자와 B 클래스의 생성자로 인스턴스 생성 후 메모리 주소 저장
		C c = new C();
		D d = new D();
		E e = new E();

		A a1 = b;
		// A a1 = new B();
		// A 클래스의 객체를 참조하는 변수 a1 선언
		// A 클래스를 상속한 B 클래스에서 인스턴스 생성 후 메모리 주소 저장
		A a2 = c;
		A a3 = d;
		A a4 = e;

		B b1 = d;
		C c1 = e;

//		B b3 = e;
		// Type mismatch: cannot convert from E to B
		// B 클래스와 E 클래스가 상속 관계에 있지 않기 때문에 컴파일 에러 발생
//		C c2 = d;
	}
}