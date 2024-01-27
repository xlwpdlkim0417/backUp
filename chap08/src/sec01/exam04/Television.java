package sec01.exam04;
//구현 클래스

import sec01.exam03.RemoteControl;

public class Television implements RemoteControl { // 인터페이스 구현

	// 필드
	private int volume;
	// Television 클래스 필드 선언
	// private 접근 제한자 ▷ SAME CLASS

	// turnOn() 추상 메소드의 실체 메소드
	public void turnOn() {
		// RemoteControl 인터페이스의 추상 메소드 trunOn()의 실체 메소드
		System.out.println("TV를 켭니다.");
	}

	// turnOff() 추상 메소드의 실체 메소드
	public void turnOff() {
		// RemoteControl 인터페이스의 추상 메소드 turnOff()의 실체 메소드
		System.out.println("TV를 끕니다.");
	}

	// setVolume() 추상 메소드의 실체 메소드
	public void setVolume(int volume) { // 인터페이스 상수를 이용해서 volume 필드의 값을 제한
		// RemoteControl 인터페이스의 추상 메소드 setVolume()의 실체 메소드
		// 매개 변수 : int volume
		if (volume > RemoteControl.MAX_VOLUME) {
			// RemoteControl 인터페이스의 상수 필드와 매개 변수와 값 비교
			this.volume = RemoteControl.MAX_VOLUME;
			// Television 클래스의 volume 필드 값 설정
			// RemoteControl 인터페이스의 상수 필드 값으로
		} else if (volume < RemoteControl.MIN_VOLUME) {
			// RemoteControl 인터페이스의 상수 필드와 매개 변수와 값 비교
			this.volume = RemoteControl.MIN_VOLUME;
			// Television 클래스의 volume 필드 값 설정
			// RemoteControl 인터페이스의 상수 필드 값으로
		} else {
			this.volume = volume;
			// Television 클래스의 인스턴스 필드 선언
			// 메소드의 매개 변수 int volume 값을 저장
		}
		System.out.println("현재 TV 볼륨: " + this.volume);
	}
}
// this를 사용하여 객체가 자신을 참조하거나, 자신의 인스턴스를 다른 메소드에 전달할 수 있습니다.
// this 키워드는 현재 객체(여기서는 Television 객체)의 volume 필드를 가리키며