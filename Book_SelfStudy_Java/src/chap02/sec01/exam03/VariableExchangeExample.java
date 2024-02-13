package chap02.sec01.exam03;
//변수값 교환

public class VariableExchangeExample {

	public static void main(String[] args) {

		int x = 3; // 정수 타입 x 변수에 3 저장
		int y = 5; // 정수 타입 y 변수에 5 저장
		System.out.println("x:" + x + ", y:" + y);

		int temp = x; // 변수 x 값 3을 변수 temp에 저장
		x = y; // 변수 y값 5를 변수 x에 저장
		y = temp; // 변수 temp 값 3을 변수 y에 저장
		System.out.println("x:" + x + ", y:" + y);
	}
}