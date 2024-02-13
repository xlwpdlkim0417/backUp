package java_2024_01_25.sec02.verify.exam01;
//익명 구현 클래스와 객체 생성

public class Anonymous {
	Worker field = new Worker() {

		@Override
		public void start() {
			System.out.println("디자인을 합니다.");
		}

	};

	void method1() {
		Worker localvar = new Worker() {

			@Override
			public void start() {
				System.out.println("개발을 합니다.");
			}

		};
		localvar.start();

	}

	void method2(Worker worker) {
		worker.start();
	}

}
