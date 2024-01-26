package sec01.exam02;

public interface RemoteControl { // 인터페이스에서는 변수 선언이 안됨

	int x = 100; // 이거 변수 아니고 그냥 고정형으로 100으로 정해지는 거임 // 상수임

	public static final int MAX_VOLUME = 10; // 상수
	int MIN_VOLUME = 0; // 위랑 이거랑 똑같은 형식임 [public static final] 생략 가능

	public abstract void turnOn(); // 추상 메소드 활용이 인터페이스의 목적임 > 사용하는 애가 재정의해서 사용할 수 있도록

	void turnOff(); // 위랑 이거랑 똑같은 형식임 [public abstract] 생략 가능

	public void setVolume(int volume);

}
// 매개변수에 클래스타입이 들어가거나 리턴타입에 클래스타입이 들어가는 설계가 어려운거임 지금은 void라서 안들어가는 거일 뿐임