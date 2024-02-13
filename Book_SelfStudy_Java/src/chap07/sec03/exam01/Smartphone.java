package chap07.sec03.exam01;
//실체 클래스

public class Smartphone extends Phone { // 상속
	// 부모 클래스 : Phone
	// 자식 클래스 : SmartPhone

	// 생성자

	public Smartphone(String owner) {
		// Smartphone 클래스의 생성자 선언
		// 매개 변수 : String owner
		super(owner);
		// super()로 부모 클래스의 생성자 호출
		// 매개 변수 : owner
	}

	// 메소드
	public void internetSearch() {
		// SmartPhone 클래스의 메소드 선언
		// 리턴 타입 : void
		System.out.println("인터넷 검색을 합니다.");
	}
}
//Phone 생성자를 호출해서 객체를 생성할 수 없음
//자식 클래스인 Smartphone으로 객체를 생성해서 Phone의 메소드 사용 가능