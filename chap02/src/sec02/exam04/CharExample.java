package sec02.exam04;
//char 타입

public class CharExample {

	public static void main(String[] args) {

		char c1 = 'A'; // 문자를 직접 저장 //char 타입 변수 c1에 문자 리터럴 'A' 저장
		char c2 = 65; // 10진수로 저장 //char 타입 변수 c2에 정수 리터럴 값 65 저장
		char c3 = '\u0041'; // 16진수로 저장 //char 타입 변수 c3에 16진수 값 저장

		char c4 = '가'; // 문자를 직접 저장 //char 타입 변수 c4에 문자 리터럴 '가' 저장
		char c5 = 44032; // 10진수로 저장 //char 타입 변수 c5에 정수 리터럴 44032 저장
		char c6 = '\uac00'; // 16진수로 저장 //char 타입 변수 c6에 16진수 값 저장

		System.out.println(c1); // char 타입 변수 c1에 저장된 값 출력
		System.out.println(c2); // char 타입 변수 c2에 저장된 값 출력
		System.out.println(c3); // char 타입 변수 c3에 저장된 값 출력
		System.out.println(c4); // char 타입 변수 c4에 저장된 값 출력
		System.out.println(c5); // char 타입 변수 c5에 저장된 값 출력
		System.out.println(c6); // char 타입 변수 c6에 저장된 값 출력
	}
}