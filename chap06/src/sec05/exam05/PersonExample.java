package sec05.exam05;

public class PersonExample {

	public static void main(String[] args) {

		Person p1 = new Person("123456-1234567", "홍길동");

		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);

//		p1.nation = "usa";
//		p1.ssn = "654321-7654321";
		p1.name = "홍삼원"; // Person 클래스에서 nation과 ssn은 final 필드여서 선언 후 초기화가 불가
							// name은 인스턴스 필드이기 때문에 초기화 가능

	}

}
