package java_2024_01_23.page415;

public class Outter {

	public void method2(int arg) {
		int localVar = 1;
//		arg = 100;	// 메소드 내에 클래스가 있는 경우 지역변수는 초기에 저장된 값으로만 이용해라 = final 처리해라
//		localVar = 100;

		class Inner {
			public void method() {
				int result = arg + localVar;
			}
		}
	}

}
// 백그라운드에 살려둘 수 있음
// 메소드2가 실행되면 안에 있는 arg / loaclvar 로컹 변수는 지워짐
