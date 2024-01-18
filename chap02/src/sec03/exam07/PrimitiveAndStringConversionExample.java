package sec03.exam07;
//기본 타입과 문자열 간의 변환

public class PrimitiveAndStringConversionExample {

	public static void main(String[] args) {

		int value1 = Integer.parseInt("10"); // int 타입 변수 Value1에 문자열 "10"을 int 타입으로 강제 타입 변환한 값 저장
		double value2 = Double.parseDouble("3.14"); // double 타입 변수 value2에 문자열 "3.14"를 double 타입으로 강제 타입 변환한 값 저장
		boolean value3 = Boolean.parseBoolean("true"); // boolean 타입 변수 value3에 문자열 "true"를 boolean 타입으로 강제 타입 변환한 값 저장

		System.out.println("value1: " + value1); // int 타입 변수 value1에 저장된 값 출력
		System.out.println("value2: " + value2); // double 타입 변수 value2에 저장된 값 출력
		System.out.println("value3: " + value3); // boolean 타입 변수 value3에 저장된 값 출력

		String str1 = String.valueOf(10); // String 타입 변수 str1에 정수 리터럴 값 10을 String 타입으로 강제 타입 변환한 값 저장
		String str2 = String.valueOf(3.14); // String 타입 변수 str2에 실수 리터럴 값 3.14를 String 타입으로 강제 타입 변환한 값 저장
		String str3 = String.valueOf(true); // String 타입 변수 str3에 boolean 타입값 true를 String 타입으로 강제 타입 변환한 값 저장

		System.out.println("str1: " + str1); // String 타입 변수 str1에 저장된 값 출력
		System.out.println("str2: " + str2); // String 타입 변수 str2에 저장된 값 출력
		System.out.println("str3: " + str3); // String 타입 변수 str3에 저장된 값 출력
	}
}