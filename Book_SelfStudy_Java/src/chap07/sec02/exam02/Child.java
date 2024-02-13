package chap07.sec02.exam02;
//자동 타입 변환 후의 멤버 접근

public class Child extends Parent { // 상속
	// 부모 클래스 : Parent
	// 자식 클래스 : Child

	@Override
	public void method2() {
		// 부모 클래스의 메소드를 재정의 ▷ 이 시점에서 부모 클래스의 method2() 메소드 호출 불가
		// public 접근 제한자
		// 리턴 타입 : void
//		super.method2();
		System.out.println("Child-method2()");
	}

	public void method3() {
		// public 접근 제한자
		// 리턴 타입 : void
		System.out.println("Child-method3()");
	}
}