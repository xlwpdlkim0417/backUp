package sec06.exam02.mycompany;

import sec06.exam02.hankook.SnowTire;
import sec06.exam02.hyundai.Engine;
import sec06.exam02.kumho.BigWidthTire;

public class Car {

	// 필드

//	Tire tire = new Tire();	//이거 import하려면 같은 이름의 클래스가 2개 있기 때문에 고르라고 나옴

	Engine engine = new Engine();
	SnowTire tire1 = new SnowTire();
	BigWidthTire tire2 = new BigWidthTire();

	sec06.exam02.hankook.Tire tire3 = new sec06.exam02.hankook.Tire();
	sec06.exam02.kumho.Tire tire4 = new sec06.exam02.kumho.Tire();

}
