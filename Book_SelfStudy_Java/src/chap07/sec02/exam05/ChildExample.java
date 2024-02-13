package chap07.sec02.exam05;
//강제 타입 변환

public class ChildExample {

	public static void main(String[] args) {
		Parent parent = new Child();
		// Parent 클래스의 객체를 참조하는 변수 parent 선언
		// new 연산자와 Child 클래스의 생성자로 인스턴스 생성 후 메모리주소 저장
		// 상속 관계 자동 타입 변환 ▷ Child 클래스는 Parent 클래스의 필드/메소드 접근 가능

		parent.field1 = "data1";
		// parent.로 Parent 클래스의 인스턴스 필드에 접근
		parent.method1();
		// parent.로 Parent 클래스의 인스턴스 메소드 method1() 호출
		parent.method2();
		// parent.로 Parent 클래스의 인스턴스 메소드 method2() 호출

//		 parent.field2 = "data2";
		// field2 cannot be resolved or is not a field
		// parent.로 Parent 클래스의 인스턴스 필드에 접근은 가능하나
		// field2는 Child 클래스의 필드이기 때문에 컴파일 에러 ▷ 상속 관계 자동 타입 변환
//		parent.method3();
		// The method method3() is undefined for the type Parent
		// parent.로 Parent 클래스의 인스턴스 메소드에 접근은 가능하나
		// method3()는 Child 클래스의 메소드이기 때문에 컴파일 에러 ▷ 상속 관계 자동 타입 변환

		Child child = (Child) parent;
		// Child 클래스의 객체를 참조하는 변수 child 선언
		// (Child 클래스 타입으로 강제 타입 변환) new Child()
		// 자동 타입 변환되어 부모 타입이 되었던 자식 클래스를 다시 자식 타입으로 강제 타입 변환

		child.field2 = "yyy";
		// child.로 Child 클래스의 인스턴스 필드 접근
		child.method3();
		// child.로 Child 클래스의 method3() 호출
	}
}