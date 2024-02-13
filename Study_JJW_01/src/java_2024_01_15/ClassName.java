package java_2024_01_15;

public class ClassName {

	int field1;

	void method1() {
	}

	static int field2; // 사용가능

	static void method2() { // 사용가능
	}

	static void method3() { // 사용가능

		ClassName cn = new ClassName();

		cn.field1 = 10; // 즉시 사용 불가능 왜? 객체 생성 후 사용 가능 그래서 오류임 그러면 올바르게 쓰려면?
						// 객체 생성해주면됨 객체 생성할 때 변수는 필드 변수와 달라야함

		field2 = 10; // 왜 위는 안되고 아래는 될까? 이거 위에는 정적 멤버 아니고 인스턴스 멤버라 객체가 없어서 안되는 거임
	}

	void method4() { // 인스턴스 메소드라서 객체 생성 후에 사용 가능하기 때문에 아직 객체를 만들지 않은 시점에서는 인스턴스 필드나 정적 필드 다 사용 가능임
						// 그래서 오류없이 일단은 적을 수 있는거임
		field1 = 10; // this.field1 = 10;
		field2 = 10; // ClassName.field2 = 10; 정확히는 이렇게 써야하는 거라 둘이 다른거임
	}

}
// static 붙은 애들은 저장하면(컴파일하면) 메모리에 올라감(바로 실행할 수 있음)