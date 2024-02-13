package chap08.sec02.exam05;
//하위 인터페이스 구현

public class ImplementationC implements InterfaceC {

	@Override
	public void methodA() { // InterfaceA의 실체 메소드 있어야 함
		System.out.println("ImplementationC-methodA() 실행");
	}

	@Override
	public void methodB() { // InterfaceB의 실체 메소드 있어야 함
		System.out.println("ImplementationC-methodB() 실행");
	}

	@Override
	public void methodC() {
		System.out.println("ImplementationC-methodC() 실행");
	}
}