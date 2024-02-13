package chap07.sec01.exam02;
//부모 클래스

public class People {

	public String name;
	// People 클래스 필드 선언
	// public 접근 제한자
	public String ssn;
	// People 클래스 필드 선언
	// public 접근 제한자

	public People(String name, String ssn) {
		// People 클래스의 생성자 선언
		this.name = name;
		// People 클래스로 전달된 매개 변수 값 필드 저장
		this.ssn = ssn;
		// People 클래스로 전달된 매개 변수 값 필드 저장
	}
}