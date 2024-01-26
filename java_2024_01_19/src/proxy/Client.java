package proxy;
//04

public class Client {

	public static void main(String[] args) {

		ISubject sub = new Proxy(new RealSubject()); // new RealSubject()를 돌려주는데 그 전에 본인 것도 new Proxy() 돌림
		sub.action(); // 프록시의 액션 메소드

	}

}
