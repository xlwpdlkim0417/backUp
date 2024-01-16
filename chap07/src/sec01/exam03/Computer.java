package sec01.exam03;

public class Computer extends Calculator {

	@Override // Override 어노테이션은 생략 가능하지만 컴파일러가 정확하게 재정의 됐는지 확인할 때 필요하니까 넣어주자
	double areaCircle(double r) { // 부모 클래스의 메소드를 재정의 for 정밀한 계산

		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI * r * r;

	}

}
