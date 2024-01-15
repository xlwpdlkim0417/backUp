package sec06.exam05.package2; //패키지가 다름

import sec06.exam05.package1.A;

public class C {

	public C() {
		A a = new A();

		a.field1 = 1; // (O)
//		a.field2 = 1;	//(X) default 필드 접근 불가
//		a.field3 = 1;	//(X) private 필드 접근 불가

		a.method1(); // (O)
//		a.method2();	//(X) default 메소드 접근 불가
//		a.method3();	//(X) private 메소드 접근 불가
	}

}
