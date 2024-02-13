package chap10.sec01.exam02;
//ArrayIndexOutOfBoundsException

public class ArrayIndexOutOfBoundsExceptionExample {

	public static void main(String[] args) {
		String data1 = args[0];
		// String 타입 로컬 변수 data1 선언
		// String 타입 배열 args의 [0]번 인덱스 값 저장
		String data2 = args[1];

		System.out.println("args[0]: " + data1);
		System.out.println("args[1]: " + data2);
	}
}
// 2개의 실행 매개값을 주지 않았기 때문에 인덱스 사용 불가능