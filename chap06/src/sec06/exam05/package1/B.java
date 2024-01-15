package sec06.exam05.package1; //패키지가 동일

public class B {

	public B() {
		A a = new A(); // 여기에 있는 a는 지역변수입니다 필드 아닙니다
		a.field1 = 1; // (O)
		a.field2 = 1; // (O)
//		a.field3 = 1;	//(X) private 필드 접근 불가

		a.method1(); // (O)
		a.method2(); // (O)
//		a.method3();	//(X) private 메소드 접근 불가
	}

}