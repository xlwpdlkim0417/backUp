package sec05.exam05;
//final 필드 선언과 초기화

public class Person {

	final String nation = "korea";
	// Person 클래스의 final 필드 nation 선언
	// 문자 리터럴 "korea"로 초기화
	final String ssn; // ssn은 Person 객체가 생성될 때 부여
	// Person 클래스의 final 필드 ssn 선언
	String name;

	public Person(String ssn, String name) {
		this.ssn = ssn;
		// Person 클래스의 인스턴스 필드값
		// 생성자의 매개 변수
		this.name = name;
	}
}