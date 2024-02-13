package sec03.exam02;
//객체 생성 후 필드값 출력

public class KoreanExample {

	public static void main(String[] args) {

		Korean k1 = new Korean("박자바", "011225-1234567"); // 매개변수가 있는 생성자에 임의의 매개변수를 기입
		// Korean 클래스를 참조하는 변수 k1에
		// new 연산자로 객체 생성 후 번지 저장

		System.out.println("k1.name : " + k1.name);
		// 변수 k1 + 도트연산자(.)로 Korean 클래스의 필드 name 읽기
		System.out.println("k1.ssn : " + k1.ssn);
		// 변수 k1 + 도트연산자(.)로 Korean 클래스의 필드 ssn 읽기

		Korean k2 = new Korean("김자바", "930525-0654321");
		// Korean 클래스를 참조하는 변수 k2에
		// new 연산자로 객체 생성 후 번지 저장

		System.out.println("k2.name : " + k2.name);
		// 변수 k2 + 도트연산자(.)로 Korean 클래스의 필드 name 읽기
		System.out.println("k2.ssn : " + k2.ssn);
		// 변수 k2 + 도트연산자(.)로 Korean 클래스의 필드 ssn 읽기
	}
}