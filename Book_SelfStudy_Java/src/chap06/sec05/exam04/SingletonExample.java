package chap06.sec05.exam04;
//싱글톤 객체

public class SingletonExample {

	public static void main(String[] args) {

		/*
		 * Singleton obj1 = new Singleton(); Singleton obj2 = new Singleton();
		 */
		// Singleton 클래스의 객체를 참조하는 변수 obj1/obj2 선언
		// new 연산자와 Singleton 클래스의 생성자로 인스턴스 생성 후 메모리 주소 저장
		// Singleton 클래스의 생성자는 private 접근 제한자 ▷ 객체 생성 불가능

		Singleton obj1 = Singleton.getInstance();
		// Singleton 클래스의 객체를 참조하는 변수 obj1 선언
		// 클래스이름 + (.) + Singleton 클래스의 정적 메소드 getInstance() 호출
		// 리턴값 : Singleton 클래스의 정적 필드값 singleton
		Singleton obj2 = Singleton.getInstance();

		if (obj1 == obj2) {
			// 변수 obj1과 변수 obj2가 같은 객체를 참조하는가
			// 메모리 주소 값이 같은가
			System.out.println("같은 Singleton 객체입니다.");
		} else {
			System.out.println("다른 Singleton 객체입니다.");
		}
	}
}