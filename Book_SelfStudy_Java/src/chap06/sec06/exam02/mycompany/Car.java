package chap06.sec06.exam02.mycompany;
//import문

import chap06.sec06.exam02.hankook.*;
import chap06.sec06.exam02.hyundai.Engine;
import chap06.sec06.exam02.kumho.*;

public class Car {

	// 필드

//	Tire tire = new Tire();

	Engine engine = new Engine();
	// Engine 클래스의 객체를 참조하는 필드 선언
	// new 연산자와 Engine 클래스의 생성자로 인스턴스 생성 후 메모리 주소 저장
	SnowTire tire1 = new SnowTire();
	BigWidthTire tire2 = new BigWidthTire();

	chap06.sec06.exam02.hankook.Tire tire3 = new chap06.sec06.exam02.hankook.Tire(); // 이렇게 쓸 수 있다는 것도 알아두면 될 거 같음
	chap06.sec06.exam02.kumho.Tire tire4 = new chap06.sec06.exam02.kumho.Tire();
}