package sec06.exam02.mycompany;
//import문

import sec06.exam02.hankook.*; //tire 종류는 전부 import해서 사용할 수 있도록
import sec06.exam02.kumho.*;
import sec06.exam02.hyundai.Engine;

public class Car {

	// 필드

//	Tire tire = new Tire();

	Engine engine = new Engine();
	// Engine 클래스의 객체를 참조하는 필드 선언
	// new 연산자와 Engine 클래스의 생성자로 인스턴스 생성 후 메모리 주소 저장
	SnowTire tire1 = new SnowTire();
	BigWidthTire tire2 = new BigWidthTire();

	sec06.exam02.hankook.Tire tire3 = new sec06.exam02.hankook.Tire(); // 이렇게 쓸 수 있다는 것도 알아두면 될 거 같음
	sec06.exam02.kumho.Tire tire4 = new sec06.exam02.kumho.Tire();
}