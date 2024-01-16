package sec02.exam02;

public class ChildExample {

	public static void main(String[] args) {

		Child child = new Child();

		Parent parent = child; // 자동타입변환 //promotion 이후 부모 클래스에서 선언된 필드와 메소드에만 접근 가능 그러나 자식 클래스에서 오버라이드 된 메소드가
								// 있다면 자식 클래스의 메소드가 호출됨

//		바로 위에 있는 걸 정리해보면 아래와 같음
//		Parent parent = new Child();

		parent.method1();
		parent.method2(); // 재정의 된 메소드 호출
//		parent.method3();	//호출 불가능

	}

}
