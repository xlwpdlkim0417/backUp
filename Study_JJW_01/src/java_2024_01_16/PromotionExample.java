package java_2024_01_16;

class A {

}

class B extends A {

}

class C extends A {

}

class D extends B {

}

class E extends C {

}

public class PromotionExample {

	public static void main(String[] args) { // 다형성의 시작 = 부모로 변수선언, 자식으로 객체생성

		Object obj = new A(); // A자리에 B C D E 다 들어갈 수 있음

		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();

		A a1 = b; // A a1 = B(); 이렇게 적을 수 있음 부로모 변수 선언을 하고 자식으로 객체 생성을 할 수가 있다 // 작은 타입이 큰 타입으로
					// 자동으로 형변환되는 것처럼

		A a2 = c;
		A a3 = d;
		A a4 = e; // A a4 = new E();

		B b1 = d;
		C c1 = e;

//		B b3 = e;/
//		C C2 = d;

	}

}
