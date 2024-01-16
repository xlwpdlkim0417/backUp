package _2024_01_09;

public class Cal {

	static int sx;

	int x;

	void power() { // stactic은 붙이면 안되고 public은 붙일 수 있음
		System.out.println("전원을 켭니다.");
		System.out.println("sx:" + sx); // 초기값을 저장하지 않고 선언만 하면 초기값은 0 (왜? 저거 변수 아니고 필드라서 그런거임 초기값이 설정되지 않은 필드는 객체 생성 시
										// 자동으로 기본 초기값이 설정됨)
	}

	void printx() {
		System.out.println(x);
	}

}