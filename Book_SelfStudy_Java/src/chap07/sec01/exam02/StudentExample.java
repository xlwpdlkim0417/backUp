package chap07.sec01.exam02;
// 자식 객체 이용

public class StudentExample {

	public static void main(String[] args) {

		Student student = new Student("홍길동", "123456-1234567", 1);
		// 객체 생성
		// Student 클래스의 객체를 참조하는 변수 student 선언
		// new 연산자와 student 생성자로 인스턴스 생성 후 메모리 주소 저장
		// 매개 변수 : "홍길동", "123456-1234567", 1

		System.out.println("name : " + student.name);
		// student.로 상속받은 부모 클래스의 필드 읽기
		System.out.println("ssn : " + student.ssn);
		// student.로 상속받은 부모 클래스의 필드 읽기
		System.out.println("studentNo : " + student.studentNo);
		// student.로 Student 클래스의 필드 읽기
	}
}