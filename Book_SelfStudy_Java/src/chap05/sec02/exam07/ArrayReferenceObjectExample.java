package chap05.sec02.exam07;
//객체를 참조하는 배열

public class ArrayReferenceObjectExample {

	public static void main(String[] args) {

		String[] strArray = new String[3];
		// String 타입 배열을 참조하는 참조 변수 strArray에
		// new 연산자로 길이가 3인 배열 객체 생성 후 저장
		strArray[0] = "java"; // 참조 변수 strArray에 저장된 String 타입 배열 객체 인덱스 [0]번에 문자열 "java" 저장
		strArray[1] = "java"; // 참조 변수 strArray에 저장된 String 타입 배열 객체 인덱스 [1]번에 문자열 "java" 저장
		strArray[2] = new String("java"); // 참조 변수 strArray에 저장된 String 타입 배열 객체 인덱스 [2]번에 new 연산자로 "java"를 매개 변수로 하는 객체
											// 생성

		System.out.println(strArray[0] == strArray[1]);
		// 각각의 참조 변수가 같은 문자열(객체)을 참조 ▷ 번지 값 같음
		// true
		System.out.println(strArray[0] == strArray[2]);
		// 참조 변수 strArray[2]는 새로운 객체를 생성했으므로 참조 변수 strArray[0]과 다른 객체를 참조 ▷ 번지 값 다름
		// false
		System.out.println(strArray[0].equals(strArray[2]));
		// 각각의 참조 변수가 참조하는 배열 객체는 다르나 객체 내부의 "문자열"은 같음
		// true
	}
}