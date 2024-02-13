package chap05.sec01.exam01;
//문자열 비교

public class StringEqualsExample {

	public static void main(String[] args) {

		String strVar1 = "신민철"; // String 타입 변수 strVar1에 문자열 리터럴 "신민철" 저장
		String strVar2 = "신민철"; // String 타입 변수 strVar2에 문자열 리터럴 "신민철" 저장

		if (strVar1 == strVar2) { // if-else문 시작
			// 조건식 : String 타입 변수 strVar1와 String 타입 변수 strVar2는 동일한 객체를 참조한다
			System.out.println("strVar1과 strVar2는 참조가 같음");
		} else { // else 실행 블록
			System.out.println("strVar1과 strVar2는 참조가 다름");
		} // if-else문 종료

		if (strVar1.equals(strVar2)) { // if문 시작
			// 조건식 : String 타입 변수 strVar1와 String 타입 변수 strVar2는 객체의 내용(문자열 리터럴)이 동일하다
			System.out.println("strVar1과 strVar2는 문자열이 같음");
		} // if문 종료

		String strVar3 = new String("신민철"); // String 타입 변수 strVar3에 새로운 String 객체를 생성하여 저
		String strVar4 = new String("신민철"); // String 타입 변수 strVar4에 새로운 String 객체를 생성하여 저

		if (strVar3 == strVar4) { // if-else문 시작
			// 조건식 : String 타입 변수 strVar3과 String 타입 변수 strVar4는 동일한 객체를 참조한다
			System.out.println("strVar3과 strVar4는 참조가 같음");
		} else { // else 실행 블록
			System.out.println("strVar3과 strVar4는 참조가 다름");
		} // if-else문 종료

		if (strVar3.equals(strVar4)) { // if문 시작
			// 조건식 : String 타입 변수 strVar3와 String 타입 변수 strVar2는 객체의 내용(문자열 리터럴)이 동일하다
			System.out.println("strVar3과 strVar4는 문자열이 같음");
		} // if문 종료
	}
}