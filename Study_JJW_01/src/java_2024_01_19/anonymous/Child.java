package java_2024_01_19.anonymous;

class Parent {

	void method() {

	}

}

public class Child extends Parent {

	@Override
	void method() { // 얜 뭐냐면 우리가 지금까지 맨날 보던거임 슈퍼클래스에 있는 메소드 서브클래스에서 재정의하는거임
		super.method();
	}

	public static void main(String[] args) {
		
		Parent parent3 = new Child();	// 이건 인정함? ㅇㅈ 얘는 얘만의 타입이 존재함
		
		//new Child()의 진짜 이름은 Child child 임
		
		Child child = (Child) parent3;	// 이름이 있으면 강제형변환이 가능함
		
		

		new Child(); // 익명 객체

		Parent parent1 = new Parent();	// parent1 이랑 parent 이건 근본이 다름 위에는 그냥 객체 생성한거고 아래는 다형성임 슈퍼클래스 변수 = new 자식
		Parent parent = new Parent() { // 상속관계가 있을 때 가능한거임 ▷ 이거 자식 객체임 ▷ 증거? 아래 봐봐 메소드 오버라이드 가능함

			@Override
			void method() { // 이건 new Parent() {} 중괄호 안에 오버라이드 하는거임
				super.method();
			}

		}; // 여기 세미콜론(;)으로 닫아주면 오류 사라짐 ▷ new Parent() 부터 여기까지 객체 하나임 근데 익명의 객체라고요

	}

}
