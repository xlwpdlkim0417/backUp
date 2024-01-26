package anonymous;

interface Inter {

	void disp();

}

public class Ex2 {

	public static void main(String[] args) {

//		Inter it = new Inter();	//생각 잘해 이거 원래 안되는거야 인터페이스는 객체 생성이 안되잖아
		Inter it = new Inter() { // 인터페이스는 구현객체가 필요해 근데 여기 구현객체가 어딨어? 어딨긴 익명의 구현객체가 있는건데 ㅅㅂ

			int y = 100;

			public void disp2() { // 익명의 구현 객체 내부에서 선언한 오리지널 메소드
				System.out.println("disp2");
			}

			@Override
			public void disp() {

				System.out.println(y);
				disp2(); // 내부라면 불러다 쓸 수 있음
			}
		};
		it.disp();
//		it.disp2();	// 익명의 구현 객체 밖에서는 사용할 수가 없음 도트연산자로 불러낼 수가 없음

	}

}
