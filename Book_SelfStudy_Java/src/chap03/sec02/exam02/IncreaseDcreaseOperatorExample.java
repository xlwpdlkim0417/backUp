package chap03.sec02.exam02;
//증감 연산자

public class IncreaseDcreaseOperatorExample {

	public static void main(String[] args) {

		int x = 10; // int 타입 변수 x에 정수 리터럴 값 10 저장
		int y = 10; // int 타입 변수 y에 정수 리터럴 값 10 저장
		int z; // int 타입 변수 z 선언

		System.out.println("──────────");
		x++; // int 타입 변수 x에 저장된 값 1 증가 ▷ 11
		++x; // int 타입 변수 x에 저장된 값 1 증가 ▷ 12
		System.out.println("x=" + x); // int 타입 변수 x에 저장된 값 출력 ▷ 12

		System.out.println("──────────");
		y--; // int 타입 변수 y에 저장된 값 1 감소 ▷ 9
		--y; // int 타입 변수 y에 저장된 값 1 감소 ▷ 8
		System.out.println("y=" + y); // int 타입 변수 y에 저장된 값 출력 ▷ 8

		System.out.println("──────────");
		z = x++; // int 타입 변수 z에 (int 타입 변수 x에 저장된 값) 저장 후 int 타입 변수 x 값 1 증가
		System.out.println("z=" + z); // int 타입 변수 z에 저장된 값 출력 ▷ 12
		System.out.println("x=" + x); // int 타입 변수 x에 저장된 값 출력 ▷ 13

		System.out.println("──────────");
		z = ++x; // int 타입 변수 z에 (int 타입 변수 x에 저장된 값 1 증가 후) 저장
		System.out.println("z=" + z); // int 타입 변수 z에 저장된 값 출력 ▷ 14
		System.out.println("x=" + x); // int 타입 변수 z에 저장된 값 출력 ▷ 14

		System.out.println("──────────");
		z = ++x + y++;
		// 1. int 타입 변수 x 값 1 증가 ▷ 15
		// 2. 증가한 int 타입 변수 x + int 타입 변수 y ▷ 15 + 8 = 23
		// 3. int 타입 변수 z에 (15 + 8) 값 저장
		// 4. int 타입 변수 y 값 1 증가 ▷ 9
		System.out.println("z=" + z); // int 타입 변수 z에 저장된 값 출력
		System.out.println("x=" + x); // int 타입 변수 x에 저장된 값 출력
		System.out.println("y=" + y); // int 타입 변수 y에 저장된 값 출력
	}
}