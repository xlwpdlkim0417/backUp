package sec01.exam02;

public class StudentExample {

	public static void main(String[] args) {

		Student student = new Student("홍길동", "123456-1234567", 1);

		System.out.println("name : " + student.name); // 부모에게 상속받은 필드 출력
		System.out.println("ssn : " + student.ssn); // 부모에게 상속받은 필드 추력
		System.out.println("studentNo : " + student.studentNo);

	}

}
