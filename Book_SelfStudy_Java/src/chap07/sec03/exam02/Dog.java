package chap07.sec03.exam02;
//추상 메소드 재정의

public class Dog extends Animal { // 상속
	// 부모 클래스 : Animal
	// 자식 클래스 : Dog

	public Dog() {
		// Dog 클래스의 생성자 선언
		this.kind = "포유류";
		// 추상 클래스 Animal를 상속하는 Dog 클래스의 필드 선언
	}

	@Override
	public void sound() {
		// 추상 메소드 재정의 필수
		System.out.println("멍멍");
	}
}