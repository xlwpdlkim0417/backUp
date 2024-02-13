package java_2024_01_16;

class Aa {

	final int x;
	private int y;

	void method() {

	}

	Aa() {
		this.x = 0;
	}

	Aa(int x) {
		this.x = x;
	}

}

public class Bb extends Aa {
	void method() { // 부모클래스의 메소드에서 정의된 접근제한자보다 더 강한 제한자를 앞에 붙이면 오류남
//		System.out.println(x);

//		x = 40; // final 필드 값 변경 안됨

//		System.out.println(y);	// private 접근 안됨

	}
}
