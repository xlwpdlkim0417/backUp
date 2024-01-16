package sec03.exam01;

public class Smartphone extends Phone {

	// 생성자

	public Smartphone(String owner) { // Phone 생성자를 호출해서 객체를 생성할 수 없음
		super(owner); // 자식 클래스인 Smartphone으로 객체를 생성해서 Phone의 메소드 사용 가능
	}

	// 메소드
	public void internetSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}

}
