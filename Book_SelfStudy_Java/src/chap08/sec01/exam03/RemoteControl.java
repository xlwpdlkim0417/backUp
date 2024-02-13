package chap08.sec01.exam03;
//추상 메소드 선언

public interface RemoteControl {

	// 상수
	public int MAX_VOLUME = 10;
	//인터페이스 상수 필드 선언 & 초기화
	// public static final
	public int MIN_VOLUME = 0;
	// 인터페이스 상수 필드 선언 & 초기화
	// public static final

	// 추상 메소드 // 메소드 선언부만 작성
	public void turnOn();
	// 인터페이스 추상 메소드 선언
	// public absract

	public void turnOff();
	// 인터페이스 추상 메소드 선언
	// public abstract

	public void setVolume(int volume);
	// 인터페이스 추상 메소드 선언
	// public abstract
	// 매개 변수 : int volume
}