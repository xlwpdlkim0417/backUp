package chap09.sec02.exam01;
//익명 자식 객체 생성

public class Anonymous {
	Person field = new Person() {
		// Person 타입 인스턴스 필드 field 선언
		// 저장하는 건 new Person()으로 시작하는 익명 자식 객체
		void work() {
			System.out.println("출근합니다.");
		}

		@Override
		void wake() {
			System.out.println("6시에 일어납니다.");
			work();
		}
	};

	void method1() {
		Person localVar = new Person() {
			// Anonymous 클래스의 method1() 메소드의 Person 타입 로컬 변수 localVar 선언
			// 저장하는 건 new Person()으로 시작하는 익명 자식 객체
			void walk() {
				System.out.println("산책합니다.");
			}

			@Override
			void wake() {
				System.out.println("7시에 일어납니다.");
				walk();
			}

		};

		localVar.wake();
		// 메소드 내부의 로컬 변수 localVar에 저장된 익명 자식 객체에서 재정의 된 wake() 메소드 실행
	}

	void method2(Person person) {
		person.wake();
		// Person 타입의 매개 변수 person의 wake() 메소드 호출
	}
}