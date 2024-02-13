package sec01.exam03;
// 자식 클래스

public class Computer extends Calculator { // 상속
	// 부모 클래스 : Calculator
	// 자식 클래스 : Computer

	@Override // Override 어노테이션은 생략 가능하지만 컴파일러가 정확하게 재정의 됐는지 확인할 때 필요
	double areaCircle(double r) {
		// 메소드 재정의
		// 리턴 타입 : double
		// 매개 변수 : double r
		// 부모 클래스의 메소드를 자식 클래스에서 재정의 ▷ 메소드 리턴값 정밀화 위해
		// 부모 클래스의 메소드 호출될 때 자식 클래스의 재정의 메소드 대신 호출

		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI * r * r;
	}
}