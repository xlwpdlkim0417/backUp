package chap06.sec05.exam05;
//final 필드 테스트

public class PersonExample {

	public static void main(String[] args) {

		Person p1 = new Person("123456-1234567", "홍길동");
		// Person 클래스를 참조하는 변수 p1 선언
		// new 연산자와 Person 생성자로 인스턴스 생성 후 메모리 주소 저장
		// 매개 변수로 전달된 값 인스턴스 필드에 저장

		System.out.println(p1.nation);
		// p1.로 인스턴스 필드 값 읽기
		System.out.println(p1.ssn);
		System.out.println(p1.name);

//		p1.nation = "usa";
		// final 필드 선언+초기화 완료 ▷ 수정 불가
//		p1.ssn = "654321-7654321";
		// final 필드 선언
		// 생성자를 통해 초기화 완료 ▷ 수정 불가
		p1.name = "홍삼원";
	}
}