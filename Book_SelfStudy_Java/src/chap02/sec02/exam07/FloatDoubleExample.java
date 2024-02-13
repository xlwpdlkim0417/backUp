package chap02.sec02.exam07;
//folat과 double 타입

public class FloatDoubleExample {

	public static void main(String[] args) {

		// 실수값 저장
//		float var1 = 3.14; // float 타입 변수 var1에 실수 리터럴 값 저장
		// ▷ 실수 리터럴은 기본적으로 double 타입으로 해석하므로 오류 (Type mismatch: cannot convert from
		// double to float)
		float var2 = 3.14F; // float 타입 변수 var2에 실수 리터럴 값 저장 ▷ F 첨가로 float 타입임을 명시
		double var3 = 3.14; // double 타입 변수 var3에 실수 리터럴 값 저장 ▷ 실수 리터럴은 기본적으로 double 타입

		// 정밀도 테스트
		float var4 = 0.1234567890123456789f; // float 타입 변수 var4에 실수 리터럴F 값 저장
		double var5 = 0.1234567890123456789; // double 타입 변수 var5에 실수 리터럴 값 저장

		System.out.println("var2: " + var2); // float 타입 변수 var2에 저장된 값 출력
		System.out.println("var3: " + var3); // double 타입 변수 var3에 저장된 값 출력
		System.out.println("var4: " + var4); // float 타입 변수 var4에 저장된 값 출력
		System.out.println("var5: " + var5); // double 타입 변수 var5에 저장된 값 출력

		// e 사용하기 // □e■ = □ * 10의 ■승
		double var6 = 3e6; // double 타입 변수 var6에 실수 리터럴 값 저장
		float var7 = 3e6F; // float 타입 변수 var7에 실수 리터럴F 값 저장
		double var8 = 2e-3; // double 타입 변수 var8에 실수 리처럴 값 저장

		System.out.println("var6: " + var6); // double 타입 변수 var6에 저장된 값 출력
		System.out.println("var7: " + var7); // float 타입 변수 var7에 저장된 값 출력
		System.out.println("var8: " + var8); // double 타입 변수 var8에 저장된 값 출력
	}
}