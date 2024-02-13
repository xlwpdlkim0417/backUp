package chap06.sec03.exam04;
//다른 생성자를 호출해서 중복 코드 줄이기

public class Car {

	// 필드
	String company = "현대자동차";
	// String 타입 필드 company에 문자열 리터럴 "현대자동차" 저장
	String model;
	// String 타입 필드 model 선언
	String color;
	// String 타입 필드 color 선언
	int maxSpeed;
	// int 타입 필드 maxSpeed 선언

	// 생성자

	Car() { // Car 클래스 기본 생성자 선언

	}

	Car(String model) { // Car 클래스 매개 변수 생성자 선언
		this(model, "은색", 250);
		// 중복을 피하기 위해 this()를 통해 다른 생성자 호출
	}

	Car(String model, String color) { // Car 클래스 매개 변수 생성자 선언
		this(model, color, 250);
		// 중복을 피하기 위해 this()를 통해 다른 생성자 호출
	}

	Car(String model, String color, int maxSpeed) {// Car 클래스 매개 변수 생성자 선언
		this.model = model;
		// Car 클래스의 인스턴스 필드 model에
		// Car 클래스의 생성자로 전달된 매개 변수 model 저장
		// this 키워드를 통해 Car 클래스의 필드 model과 매개 변수 model 구별
		this.color = color;
		// Car 클래스의 인스턴스 필드 color에
		// Car 클래스의 생성자로 전달된 매개 변수 color 저장
		// this 키워드를 통해 Car 클래스의 필드 color와 매개 변수 color 구별
		this.maxSpeed = maxSpeed;
		// Car 클래스의 인스턴스 필드 maxSpeed에
		// Car 클래스의 생성자로 전달된 매개 변수 maxSpeed 저장
		// this 키워드를 통해 Car 클래스의 필드 maxSpeed와 매개 변수 maxSpeed 구별
	}
}