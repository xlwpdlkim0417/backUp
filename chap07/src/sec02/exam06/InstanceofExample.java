package sec02.exam06;
//객체 타입 확인

public class InstanceofExample {

	public static void method1(Parent parent) {
		// public 접근 제한자
		// static
		// 리턴 타입 : void
		// 매개 변수 : Parent parent

		if (parent instanceof Child) { // Child 타입으로 변환이 가능한지 확인
			// 조건식: 좌항 객체와 우항 타입이 동일한지 확인
			// 리턴값 : true/false
			Child child = (Child) parent;
			// Child 클래스의 객체를 참조하는 변수 child 선언
			// (Child 클래스 타입으로 강제 타입 변환) new Child()

			System.out.println("method1 - Child 변환 성공");
		} else {
			System.out.println("method1 - Child로 변환되지 않음");
		}
	}

	public static void method2(Parent parent) {
		// public 접근 제한자
		// static
		// 리턴 타입 void
		// 매개 변수 : Parent parent
		Child child = (Child) parent; // ClassCastException이 발생할 가능성 있음
		// Child 클래스의 객체를 참조하는 변수 child 선언
		// (Child 클래스 타입으로 강제 타입 변환) new Child()
		System.out.println("method2 - Child 변환 성공");
	}

	public static void main(String[] args) {

		Parent parentA = new Child();
		// Parent 클래스의 객체를 참조하는 변수 parentA 선언
		// new 연산자와 Child 클래스의 생성자로 인스턴스 생성 후 메모리 주소 저장
		// 부모 타입으로 자동 타입 변환 발생
		method1(parentA); // Child 객체를 매개값으로 전달
		// static 메소드라서 객체 생성 없이 곧바로 호출 가능
		// 매개 변수 : parentA ▷ Parent parentA ▷ new Child() ▷ Child child
		// ※ 이거 되는지 확인 좀
		method2(parentA);
		// static 메소드라서 객체 생성 없이 곧바로 호출 가능
		// 매개 변수 : parentA

		Parent parentB = new Parent();
		// Parent 클래스의 객체를 참조하는 변수 parentB 선언
		// new 연산자와 Parent 클래스의 생성자로 인스턴스 생성 후 메모리 주소 저장
		method1(parentB);
		// static 메소드라서 객체 생성 없이 곧바로 호출 가능
		// 매개 변수 : parentB
		method2(parentB); // 예외 발생
		// ClassCastException

	}

}
