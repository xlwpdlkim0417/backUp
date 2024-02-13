package chap06.sec03.exam02;
//생성자에서 필드 초기화

public class Korean {

	// 필드
	String nation = "대한민국"; // String 타입 필드 nation에 문자 리터럴 "대한민국" 저장
	String name; // String 타입 필드 name 선언
	String ssn; // String 타입 필드 ssn 선언

	// 생성자
	public Korean(String n, String s) {
		// 매개변수
		// Korean 클래스의 생성자 선언
		name = n; // Korean 클래스의 필드 name를 매개변수 로 초기화
		ssn = s; // Korean 클래스의 필드 ssn를 매개변수로 초기화
	}
}