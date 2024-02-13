package chap09.sec02.exam01;
//익명 자식 객체 생성

public class AnonymousExample {

	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		// Anonymous 클래스의 객체를 참조하는 변수 anony 선언
		// Anonymous 클래스의 생성자로 인스턴스 생성 후 메모리 주소 저장

		// 익명 객체 필드 사용
		anony.field.wake();
		// Anonymous 클래스의 인스턴스 필드에 접근
		// 익명 자식 객체의 재정의된 wake() 메소드 실행

		// 익명 객체 로컬 변수 사용
		anony.method1();
		// Anonymous 클래스의 method1() 호출
		// 로컬 변수 localVar에 저장된 익명 자식 객체 흐름 팔로우
		// 재정의된 wake() 메소드 실행

		// 익명 객체 매개값 사용
		anony.method2(new Person() {
			// Anonymous 클래스의 method2() 호출
			// 매개 변수 : new Person()으로 시작하는 익명 자식 객체
			// new Person().wake() 실행
			void study() {
				System.out.println("공부합니다.");
			}

			@Override
			void wake() {
				System.out.println("8시에 일어납니다.");
				study();
			}

		});
	}
}