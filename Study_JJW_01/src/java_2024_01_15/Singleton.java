package java_2024_01_15;

public class Singleton {
	// private 접근 제한은 클래스 내에서만 접근 가능

	private static Singleton singleton = new Singleton(); // 이거 static이 안붙으면 private만 남으니까 이 객체에 대해서 클래스 내부에서만 사용할 수 있음
															// 그러면 이걸 만든 의미가 없으니까 static을 붙여서 소통할 수 있는 문을 열어뒀다고 보면됨

	private Singleton() { // 생성자를 private로 하면? 클래스 외부에서 객체를 생성할 수 없음
	}

	static Singleton getInstance() { // 사용법은 오직 이 메소드만 호출해서 그 객체를 가져올 수 있게 해주는 것
		// 이 사이는 코딩이 가능한 부분
		return singleton;
	}

}
