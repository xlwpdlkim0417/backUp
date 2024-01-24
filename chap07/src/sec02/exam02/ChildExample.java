package sec02.exam02;
//자동 타입 변환 후의 멤버 접근

public class ChildExample {

	public static void main(String[] args) {

		Child child = new Child();
		// Child 클래스의 객체를 참조하는 변수 child 선언
		// new 연산자와 Child 클래스의 생성자로 인스턴스 생성 후 메모리 주소 저장

		Parent parent = child;
		// Parent parent = new Child();
		// Parent 클래스의 객체를 참조하는 변수 parent 선언
		// Parent 클래스를 상속받은 Child 클래스에서 인스턴스 생성 후 메모리 주소 저장

		parent.method1();
		// parent.가 참조하는 Parent 클래스의 인스턴스 메소드 method1() 호출
		parent.method2();
		// method2() 메소드는 상속관계에서 재정의
		// parent.가 참조하는 Child 클래스의 인스턴스 메소드 method2() 호출
//		parent.method3();
		// The method method3() is undefined for the type Parent
		// Child 클래스가 Parent 클래스를 상속 받으면서 Parent 타입으로 자동 변환
		// 호출 불가능
	}
}
