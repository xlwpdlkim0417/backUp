package chap02.sec02.exam03;
//long 타입 변수

public class LongExample {

	public static void main(String[] args) {

		long var1 = 10; // 롱 타입 변수 var1에 정수 리터럴 값 10 저장
		long var2 = 20L; // 롱 타입 변수 var2에 롱 타입 값 20 저장
//		long var3 = 1000000000000;	// 컴파일 에러 (The literal 1000000000000 of type int is out of range) ▷ 정수 타입 범위 벗어남
		long var4 = 1000000000000L; // 롱 타입 변수 var4에 롱 타입 값 1000000000000 저장

		System.out.println(var1); // 롱 타입 변수 var1에 저장된 값 출력
		System.out.println(var2); // 롱 타입 변수 var2에 저장된 값 출력
		System.out.println(var4); // 롱 타입 변수 var4에 저장된 값 출력
	}
}