package sec01.exam01;
//클래스로부터 객체 생성

public class StudentExample {

	public static void main(String[] args) {

		Student s1 = new Student();
		// 참조 타입 Student 클래스를 참조하는 변수 s1에
		// new 연산자로 객체 생성 후 번지 저장
		System.out.println("s1 변수가 Student 객체를 참조합니다.");

		Student s2 = new Student();
		// 참조 타입 Student 클래스를 참조하는 변수 s2에
		// new 연산자로 객체 생성 후 번지 저장
		System.out.println("s2 변수가 또 다른 Student 객체를 참조합니다."); // 같은 클래스를 통해서 만들어진 인스턴스지만 서로 다른 객체
	}
}