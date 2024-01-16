package sec01.exam06;

public class SportsCar extends Car {

	@Override
	public void speedUp() {
		speed += 10;
	}

//	@Override
//	public void stop() { // Cannot override the final method from Car
//		System.out.println("스포츠카를 멈춤");
//		speed = 0;
//	}

}
