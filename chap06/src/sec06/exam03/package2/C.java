package sec06.exam03.package2; //패키지가 다름

import sec06.exam03.package1.*;

public class C {

//	A a;	//다른 패키지에서 default A클래스에 접근 불가능
	B b; // public이라서 접근 가능(필드 선언 + 생성자/메소드 내부에서 변수 선언)

}
