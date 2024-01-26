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
		animal.sound();
		// animal.로 Dog 클래스의 재정의 된 추상 메소드 호출
		animal = new Cat();
		// Animal 클래스의 객체를 참조하는 변수 animal에
		// new 연산자와 Dog 클래스 생성자로 인스턴스 생성 후 메모리 주소 저장
		// 변수 animal이 Cat 인스턴스를 참조
		animal.sound();
		// animal.로 Dog 클래스의 재정의 된 추상 메소드 호출
		System.out.println("────────────────────");

		// 메소드의 다형성
		animalSound(new Dog());
		// 추상 클래스 Animal의 추상 메소드 호출 ▷
		// 매개 변수 : new Dog()
		// Dog 클래스에서 재정의 된 추상 메소드 호출
		animalSound(new Cat());

	}

	public static void animalSound(Animal animal) {
		// AnimalExample 클래스의 메소드 선언
		// static 메소드
		// 매개 변수 : Animal animal
		animal.sound();
		// 추상 클래스 Animal의 추상 메소드 호출
	}

}
