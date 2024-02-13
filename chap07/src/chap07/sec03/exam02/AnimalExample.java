package sec03.exam02;
//실행 클래스

public class AnimalExample {

	public static void main(String[] args) {

		Dog dog = new Dog();
		// Dog 클래스의 객체를 참조하는 변수 dog 선언
		// new 연산자와 Dog 클래스의 생성자로 인스턴스 생성 후 메모리 주소 저장
		Cat cat = new Cat();
		// Cat 클래스의 객체를 참조하는 변수 cat 선언
		// new 연산자와 Cat 클래스의 생성자로 인스턴스 생성 후 메모리 주소 저장

		dog.sound();
		// dog.로 Dog 클래스의 메소드 호출
		cat.sound();
		// cat.로 Cat 클래스의 메소드 호출
		System.out.println("────────────────────");

		// 변수 자동 타입 변환
		Animal animal = null;
		// Animal 클래스의 객체를 참조하는 변수 animal 선언
		// null 값 저장
		animal = new Dog();
		// Animal 클래스의 객체를 참조하는 변수 animal에
		// new 연산자와 Dog 클래스 생성자로 인스턴스 생성 후 메모리 주소 저장
		// 변수 animal이 Dog 인스턴스를 참조

		// ★ 이 과정을 통해 Dog 인스턴스가 Animal 타입으로 업캐스팅

		animal.sound();
		// animal.로 Dog 클래스의 재정의 된 추상 메소드 호출
		animal = new Cat();
		// Animal 클래스의 객체를 참조하는 변수 animal에
		// new 연산자와 Dog 클래스 생성자로 인스턴스 생성 후 메모리 주소 저장
		// 변수 animal이 Cat 인스턴스를 참조

		// ★ 이 과정을 통해 Cat 인스턴스가 Animal 타입으로 업캐스팅

		animal.sound();
		// animal.로 Cat 클래스의 재정의 된 추상 메소드 호출
		System.out.println("────────────────────");

		// 메소드의 다형성
		animalSound(new Dog());
		// AnimalExample 클래스의 정적 메소드 호출
		// 매개 변수 : new Dog()
		// Dog 클래스에서 재정의 된 추상 메소드 호출
		// 이 인스턴스는 메소드 내에서 Animal 타입으로 처리
		animalSound(new Cat());
		// AnimalExample 클래스의 정적 메소드 호출
		// 매개 변수 : new Dog()
		// Dog 클래스에서 재정의 된 추상 메소드 호출
		// 이 인스턴스는 메소드 내에서 Animal 타입으로 처리

	}

	public static void animalSound(Animal animal) {
		// AnimalExample 클래스의 메소드 선언
		// static 메소드
		// 매개 변수 : Animal animal
		animal.sound();
		// 추상 클래스 Animal의 추상 메소드 호출
		// 매개변수로 받은 Animal 타입 객체의 sound 메소드 호출
		// 실제 실행되는 메소드는 매개변수로 전달된 객체의 클래스에 따라 결정됨 (동적 바인딩)
	}
}