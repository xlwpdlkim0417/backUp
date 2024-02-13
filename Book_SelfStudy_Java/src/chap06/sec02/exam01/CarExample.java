package chap06.sec02.exam01;
//외부 클래스에서 Car 필드값 읽기와 변경

public class CarExample {

	public static void main(String[] args) {

		// 객체 생성
		Car myCar = new Car();
		// 참조 타입 Car 클래스를 참조하는 변수 myCar에
		// new 연산자로 객체 생성 후 번지 저장

		// 필드값 읽기
		System.out.println("제작회사: " + myCar.company);
		// 참조 타입 Car 클래스의 인스턴스 myCar를 통해 참조 타입 Car 클래스의 필드값 읽기
		System.out.println("모델명: " + myCar.model);
		// 참조 타입 Car 클래스의 인스턴스 myCar를 통해 참조 타입 Car 클래스의 필드값 읽기
		System.out.println("색깔: " + myCar.color);
		// 참조 타입 Car 클래스의 인스턴스 myCar를 통해 참조 타입 Car 클래스의 필드값 읽기
		System.out.println("최고속도: " + myCar.maxSpeed);
		// 참조 타입 Car 클래스의 인스턴스 myCar를 통해 참조 타입 Car 클래스의 필드값 읽기
		System.out.println("현재속도: " + myCar.speed);
		// 참조 타입 Car 클래스의 인스턴스 myCar를 통해 참조 타입 Car 클래스의 필드값 읽기
		// (초기화 X ▷ 초기값=0)

		// 필드값 변경
		myCar.speed = 60; // main() 메소드 실행 中 기존 필드값 변경 가능
		// 참조 타입 Car 클래스의 인스턴스 myCar를 통해 참조 타입 Car 클래스의 필드값 변경
		System.out.println("수정된 속도: " + myCar.speed);
		// 참조 타입 Car 클래스의 인스턴스 myCar를 통해 참조 타입 Car 클래스의 필드값 읽기
	}
}