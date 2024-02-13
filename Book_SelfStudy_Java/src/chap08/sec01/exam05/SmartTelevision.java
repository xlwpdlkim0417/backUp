package chap08.sec01.exam05;
//다중 인터페이스 구현 클래스

import chap08.sec01.exam03.RemoteControl;

public class SmartTelevision implements RemoteControl, Searchable {

	// 필드
	private int volume;
	// SmartTelevision 클래스의 필드 선언
	// private 접근 제한자

	// turnOn() 추상 메소드의 실체 메소드
	public void turnOn() {
		// RemoteControl 인터페이스의 추상 메소드 turnOn()의 실체 메소드
		System.out.println("TV를 켭니다.");
	}

	// turnOff() 추상 메소드의 실체 메소드
	public void turnOff() {
		// RemoteControl 인터페이스의 추상 메소드 turnOff()의 실체 메소드
		System.out.println("TV를 끕니다.");
	}

	// setVolume() 추상 메소드의 실체 메소드
	public void setVolume(int volume) {
		// RemoteControl 인터페이스의 추상 메소드 setVolume()의 실체 메소드
		// 매개 변수 : int volume
		if (volume > RemoteControl.MAX_VOLUME) {
			// 매개 변수 int volume
			// RemoteControl 인터페이스의 상수 필드값 비교
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
			// SmartTelevision 클래스의 인스턴스 필드 선언
			// setVolume() 메소드의 매개 변수 int volume 값 저장
		}
		System.out.println("현재 TV 볼륨: " + this.volume);
	}

	public void search(String url) { // Searchable의 추상 메소드에 대한 실체 메소드
		// Searchable 인터페이스의 추상 메소드 search()의 실체 메소드
		// 매개 변수 : String url
		System.out.println(url + "을 검색합니다.");
	}

}
