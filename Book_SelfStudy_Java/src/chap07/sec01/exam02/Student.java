package chap07.sec01.exam02;
//자식 클래스

public class Student extends People { // 상속
	// 부모 클래스 : People

	public int studentNo;
	// Student 클래스 변수 선언
	// public 접근 제한자

	public Student(String name, String ssn, int studentNo) {
		// Student 클래스의 생성자 선언
		// public 접근 제한자
		// 매개 변수 : String name, String ssn, int studentNo
		super(name, ssn);
		// 부모 클래스 생성자 호출
		// 매개 변수 : name, ssn

		this.studentNo = studentNo;
		// Student 클래스의 생성자로 전달된 매개 변수 값 필드 저장
	}
}