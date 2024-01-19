package proxy;
//02

public class RealSubject implements ISubject {

	@Override
	public void action() {

		System.out.println("원본 객체 실행");

	}

}
