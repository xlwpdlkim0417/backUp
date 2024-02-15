package ramda;

public class MyfuncEx {

	public static void main(String[] args) {
		MyFunc mf, mf2;

		mf = new MyFunc() {
			@Override
			public void method(int x) {
				System.out.println("method");
			}
		};
//		mf.method(x);

		mf2 = (x) -> {
			// 놀라운게 화살표 옆에 있는 괄호는 매개변수 자리네
			System.out.println("method");
			System.out.println("method" + 100);
			// 몸체는 2개 이상 쓸 수 있음 하나의 메소드 안의 하나의 몸체니까
		};
//		mf2.method(x);
		// 람다식은 메소드를 하나만 허락합니다
		// 이게 ㅅㅂ 인터페이스에 메소드 2개 정의되어 있으면 못쓰네
		// 메소드가 하나니까 어차피 재정의 할 게 하나네?
		// 몸체만 써보자! 가 된겁니다
		// 메소드 이름은 어차피 인터페이스에 있으니까
		// 물론 if처럼 문장이 하나만 중괄호 생략도 가능하긴 합니다
	}
}