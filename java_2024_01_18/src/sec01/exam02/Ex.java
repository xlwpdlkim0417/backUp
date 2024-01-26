package sec01.exam02;

public class Ex {

	public static void main(String[] args) {

		RemoteControl rc = new Audio();
		rc.turnOn();
		System.out.println(rc.MAX_VOLUME);
//		rc.MAX_VOLUME = 100; // 이미 인터페이스에서 상수값을 지정했으므로 여기서 뭐 지정하고 이런거 불가능함

	}

}
