package sec01.exam06;
// 인터페이스 사용

import sec01.exam04.Audio;
import sec01.exam04.Television;

public class MyClassExample {

	public static void main(String[] args) {

		System.out.println("1)──────────");

		MyClass myClass1 = new MyClass(); // 이거 구현 객체인거지? MyClass가 구현 클래스고?
		// MyClass 클래스의 객체를 참조하는 변수 myClass1 선언
		// MyClass 클래스의 생성자로 인스턴스 생성 후 메모리 주소 저장
		myClass1.rc.turnOn();
		// myClass1.로 MyClass 클래스의 필드 rc에 접근
		// MyClass 클래스 필드 rc에 저장된 Television() 구현 객체의 turnOn() 메소드 실행
		myClass1.rc.setVolume(5);
		// myClass1.로 MyClass 클래스의 필드 rc에 접근
		// MyClass 클래스 필드 rc에 저장된 Television() 구현 객체의 setVolume() 메소드 실행

		System.out.println("2)──────────");

		MyClass myClass2 = new MyClass(new Audio());
		// MyClass 클래스의 객체를 참조하는 변수 myClass2 선언
		// MyClass 클래스의 생성자로 인스턴스 생성 후 메모리 주소 저장
		// 매개 변수 : new Audio()
		// MyClass 클래스의 생성자 중에서 매개 변수로 인터페이스 변수를 가지고 있는 생성자 소환

		// 매개 변수로 받은 RemoteControl 인터페이스 구현 객체의 turnOn 메소드 호출 (MyClass)
		// 매개 변수로 받은 RemoteControl 인터페이스 구현 객체의 turnOn 메소드 호출 (MyClass)

		System.out.println("3)──────────");

		MyClass myClass3 = new MyClass();
		// MyClass 클래스의 객체를 참조하는 변수 myClass3 선언
		// MyClass 클래스의 생성자로 인스턴스 생성 후 메모리 주소 저장
		myClass3.methodA();
		// myClass1.로 MyClass 클래스의 메소드 methodA() 호출

		// RemoteControl 인터페이스의 구현 객체를 참조하는 변수 rc 선언
		// Audio 클래스의 생성자로 RemoteControl 인터페이스를 구현한 Audio 클래스의 구현 객체를 생성하고 메모리 주소 저장
		// rc가 Audio 클래스의 구현 객체를 참조하고 있으므로 Audio 클래스의 turnOn() 메소드 실행
		// rc가 Audio 클래스의 구현 객체를 참조하고 있으므로 Audio 클래스의 setVolume() 메소드 실행

		System.out.println("4)──────────");

		MyClass myClass4 = new MyClass();
		// MyClass 클래스의 객체를 참조하는 변수 myClass4 선언
		// MyClass 클래스의 생성자로 인스턴스 생성 후 메모리 주소 저장

		myClass4.methodB(new Television());
		// myClass4.로 MyClass 클래스의 메소드 methodB() 호출
		// 매개 변수 : new Television()

		// 매개 변수로 받은 RemoteControl 인터페이스의 구현 객체의 turnOn() 메소드 호출
		// 매개 변수로 받은 RemoteControl 인터페이스의 구현 객체의 setVolume() 메소드 호출
	}
}