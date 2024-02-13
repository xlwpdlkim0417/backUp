package proxy;
//03

public class Proxy implements ISubject {

	private RealSubject realSubject; // private 보다 그 옆을 주목 // 1. 클래스 타입을 여기다 쓰고

	public Proxy(RealSubject realSubject) { // 2. 클래스 타입을 매개변수로 주입
		this.realSubject = realSubject; // 주입이라고 함 생성자를 만들 때 괄호 안에 저걸 집어넣는 것
	}

	@Override
	public void action() {
		System.out.println("로깅...");
		System.out.println("프록시 객체 실행");
		realSubject.action(); // 프록시는 본인이 직접 이 action() 메소드를 돌림
		System.out.println("로깅...");
	}

}