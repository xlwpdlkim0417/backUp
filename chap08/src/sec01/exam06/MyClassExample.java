package sec01.exam06;

import sec01.exam04.Audio;
import sec01.exam04.Television;

public class MyClassExample {

	public static void main(String[] args) {

		System.out.println("1)──────────");

		MyClass myClass1 = new MyClass(); // 이거 구현 객체인거지? MyClass가 구현 클래스고?
		myClass1.rc.turnOn();
		myClass1.rc.setVolume(5);

		System.out.println("2)──────────");

		MyClass myClass2 = new MyClass(new Audio());

		System.out.println("3)──────────");

		MyClass myClass3 = new MyClass();
		myClass3.methodA();

		System.out.println("4)──────────");

		MyClass myClass4 = new MyClass();
		myClass4.methodB(new Television());

	}

}