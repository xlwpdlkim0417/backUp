package java_2024_01_12;

class MyClass {
	void method1() {
		System.out.println(this.toString());
		System.out.println("method1");
	}

	static void method2() {
//		System.out.println(this.toString());
		System.out.println("method2");
	}
}

public class StaticClass {

	static void method3() {
		System.out.println("method3");
	}

	public static void main(String[] args) {

		StaticClass.method3();

		MyClass.method2(); // 이거 노란색 안뜨는게 이렇게 하는게 정답이라고 하는거임 이클립스가. 이거 아래 mc.method2랑 설명이 다른 점 알고있지?

		MyClass mc = new MyClass();

		mc.method1();

		mc.method2(); // 이건 앞에 static이 붙은 메소드. 도트 연산자에서 꺼낼 때도 일반 메소드랑은 달랐는데 불러도 노란줄이 생김

		MyClass mc2 = new MyClass();
		mc2.method1();
		mc2.method2();

	}

}

//static 안붙은 애들은 객체가 설정 되어야함 객체가 사라지면 메모리(자원)를 차지하지 않음
//둘 중 하나는 고정형이라서 무조건 메모리를 차지하는건데 그건 비효율적인거지 이게 static인듯 = ㅇㅋ
//그래서 사실은 StaticClass.method3(); 이렇게는 잘 안쓴다는 얘기여
//키포인트는 static 붙은 애들은 객체생성과 상관없이 메소드 실행 / this. 도 쓸 수가 없음
//static 붙은건 결국 별도의 하나임 여러개 쓸라면 여러개 만들어야함 공통으로 하나만 있는거 static이 붙은건 객체를 만들지 않아서 편하다는 장점이 있지만 효율성이 없다는거임
//메소드는 자신이 가지고 있는 필드를 위해 존재함
//메소드는 설계가 같다고 해도 결국 자기 객체의 필드를 위해 존재함
//객체를 생성하고 거기에서 접근하는 mc.method1();