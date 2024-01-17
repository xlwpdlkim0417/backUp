package sec03.exam02;
//강제 타입 변환

public class CastingExample {

	public static void main(String[] args) {
		int intValue = 44032; // int 타입 변수 intValue에 정수 리터럴 값 44032 저장
		char charValue = (char) intValue; // char 타입 변수 charValue에 char 타입으로 캐스팅 된 int 타입 변수 intValue의 값 저장
											// int 타입 → char 타입 캐스팅
		System.out.println(charValue); // chat 타입 변수 charValue에 저장된 값 출력

		long longValue = 500; // long 타입 변수 longValue에 정수 리터럴 값 500 저장
		intValue = (int) longValue; // int 타입 변수 intValue에 int 타입으로 캐스팅 된 long 타입 변수 longValue의 값 저장
		System.out.println(intValue); // int 타입 변수 intValue에 저장된 값 출력

		double doubleValue = 3.14; // double 타입 변수 doubleValue에 실수 리터럴 값 3.14 저장
		intValue = (int) doubleValue; // int 타입 변수 intValue에 int 타입으로 캐스팅 된 double 타입 변수 doubleValue 값 저장
		System.out.println(intValue); // int 타입 변수 intValue에 저장된 값 출력
	}
}