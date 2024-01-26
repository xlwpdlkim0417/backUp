package sec03.exam02;
// 추상 메소드 재정의

public class Cat extends Animal { // 상속
	// 부모 클래스 : Animal
	// 자식 클래스 : Cat

	public Cat() {
		// Cat 클래스의 생성자 선언
		this.kind = "포유류";
		// 추상 클래스 Animal를 상속하는 Cat 클래스의 필드 선언
	}

	@Override
	public void sound() {
		// 추상 메소드 재정의 필수
		System.out.println("야옹");
	}
}