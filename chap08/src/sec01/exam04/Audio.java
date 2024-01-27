package sec01.exam04;
//구현 클래스

import sec01.exam03.RemoteControl;

public class Audio implements RemoteControl { // 인터페이스 구현

	// 필드
	private int volume;
	// Audio 클래스의 필드 선언
	// private 접근 제한자 ▷ SAME CLASS

	// turnOn() 추상 메소드의 실체 메소드
	public void turnOn() {
		// RemoteControl 인터페이스의 추상 메소드 turnOn() 실체 메소드
		System.out.println("Audio를 켭니다.");
	}

	// turnOff() 추상 메소드의 실체 메소드
	public void turnOff() {
		// RemoteControl 인터페이스의 추상 메소드 turnOff()의 실체 메소드
		System.out.println("Audio를 끕니다.");
	}

	// setVolume() 추상 메소드의 실체 메소드
	public void setVolume(int volume) { // 인터페이스 상수를 이용해서 volume 필드의 값을 제한
		// RemoteControl 인터페이스의 추상 메소드 setVolume()의 실체 메소드
		// 매개 변수 : int volume
		if (volume > RemoteControl.MAX_VOLUME) {
			// 매개 변수 int volume
			// RemoteControl 인터페이스의 상수 필드값 비교
			this.volume = RemoteControl.MAX_VOLUME;
			// Audio 클래스의 인스턴스 필드 선언
			// RemoteControl 인터페이스의 상수 필드값 비교
		} else if (volume < RemoteControl.MIN_VOLUME) {
			// 매개 변수 int volume
			// RemoteControl 인터페이스의 상수 필드값 비교
			this.volume = RemoteControl.MIN_VOLUME;
			// Audio 클래스의 인스턴스 필드 선언
			// RemoteControl 상수 필드값 비교
		} else {
			this.volume = volume;
			// Audio 클래스의 인스턴스 필드 선언
			// 메소드의 매개 변수 값 저장
		}
		System.out.println("현재 Audio 볼륨: " + this.volume);
	}
}