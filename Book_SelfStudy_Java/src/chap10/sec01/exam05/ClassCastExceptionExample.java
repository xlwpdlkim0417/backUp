package chap10.sec01.exam05;
//ClassCastException

public class ClassCastExceptionExample {

	public static void main(String[] args) {
		Dog dog = new Dog();
		changeDog(dog);

		Cat cat = new Cat();
		changeDog(cat);
	}

	public static void changeDog(Animal animal) {
//		if (animal instanceof Dog) {
		Dog dog = (Dog) animal; // ClassCastException 발생 가능
		// instanceof 연산자로 확인할 경우 예외 발생하지 않음
//		}
	}

}

class Animal {
}

class Dog extends Animal {
}

class Cat extends Animal {
}