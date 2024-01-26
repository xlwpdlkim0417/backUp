package sec02.exam02;

public class Anonymous {

	Remotecontrol field = new Remotecontrol() {

		@Override
		public void turnOn() {
			System.out.println("tv를 켜다");
		}

		@Override
		public void turnOff() {
			System.out.println("tv를 끄다");
		}

	};

	void method1() {
		Remotecontrol localvar = new Remotecontrol() {

			@Override
			public void turnOn() {
				System.out.println("오디오 켜다");
			}

			@Override
			public void turnOff() {
				System.out.println("오디오 끄다");
			}

		};

		localvar.turnOn();
	}

	void method2(Remotecontrol rc) {
		rc.turnOn();
		
	}
}
