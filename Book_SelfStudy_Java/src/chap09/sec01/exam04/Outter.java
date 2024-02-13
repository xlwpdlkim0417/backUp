package chap09.sec01.exam04;
//로컬 클래스에서 사용 제한

public class Outter {

	// 자바7 이전
	public void method1(final int arg) {
		final int localVariable = 1;
//		arg = 100;
		// The final local variable arg cannot be assigned. It must be blank and not
		// using a compound assignment
//		localVariable = 100;
		// The final local variable localVariable cannot be assigned. It must be blank
		// and not using a compound assignment

		class Inner {
			public void method() {
				int result = arg + localVariable;
			}
		}
	}

	// 자바8 이후
	public void method2(int arg) {
		int localVariable = 1;
		arg = 100;
		localVariable = 100;
		class Inner {
			public void method() {
//				int result = arg + localVariable; // 여기가 오류나는 것도 이해가 안감
			}
		}
	}

}
// 책 내용이 의미하는 바는 알겠는데 자바8 이후에는 final 선언하지 않아도 특성을 부여한다며?
// 근데 왜 위의 예제에서는 오류가 안나는거지?