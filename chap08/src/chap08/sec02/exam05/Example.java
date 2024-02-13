package sec02.exam05;
//호출 가능 메소드

public class Example {

	public static void main(String[] args) {
		ImplementationC impl = new ImplementationC();
		// ImplementationC 클래스의 객체를 참조하는 변수 impl 선언
		// ImplementationC 클래스의 생성자로 인스턴스 생성 후 메모리 주소 저장

		InterfaceA ia = impl;
		// 인터페이스 InterfaceA의 구현 객체를 참조하는 변수 ia 선언
		// impl = new ImplementationC(); 저장
		// InterfaceA ia = new ImplementationC();

		ia.methodA(); // InterfaceA 변수는 methodA()만 호출 가능
		// 변수 ia.를 통해 InterfaceA의 추상 메소드를 재정의한 ImplementationC 클래스의 methodA() 메소드 호출
		System.out.println();

		InterfaceB ib = impl;
		ib.methodB(); // InterfaceB 변수는 methodB()만 호출 가능
		System.out.println();

		InterfaceC ic = impl; // InterfaceC 변수는 methodA(), methodB(), methodC() 모두 호출 가능
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}
}