package sec02.exam02;
//byte 타입 변수

public class ByteExample {

	public static void main(String[] args) {

		byte var1 = -128; // 바이트 타입 변수 var1에 값 -128 저장
		byte var2 = -30; // 바이트 타입 변수 var2에 값 -30 저장
		byte var3 = 0; // 바이트 타입 변수 var3에 값 0 저장
		byte var4 = 30; // 바이트 타입 변수 var4에 값 30 저장
		byte var5 = 127; // 바이트 타입 변수 var5에 값 127 저장
//		byte var6 = 128; // 컴파일 에러(Type mismatch: cannot convert from int to byte) ▷ byte 타입 허용 범위 : -128~127

		System.out.println(var1); // 바이트 타입 변수 var1에 저장된 값 출력
		System.out.println(var2); // 바이트 타입 변수 var2에 저장된 값 출력
		System.out.println(var3); // 바이트 타입 변수 var3에 저장된 값 출력
		System.out.println(var4); // 바이트 타입 변수 var4에 저장된 값 출력
		System.out.println(var5); // 바이트 타입 변수 var5에 저장된 값 출력
	}
}