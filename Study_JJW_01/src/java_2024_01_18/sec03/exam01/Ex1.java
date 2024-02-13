package java_2024_01_18.sec03.exam01;

public class Ex1 {

	public static void main(String[] args) {

//		Phone phone = new Phone();	//인스턴스를 만들 수 없음 = 객체화가 안된다 = 추상 클래스로는 객체 생성이 안된다

//		Phone phone = new SmartPhone(10); // 자동 형변환 > 프로모션 > 부모 변수 + 자식 생성자
		Phone phone2 = new SmartPhone2(10, 20);

		// phone + 도트연산자로 메소드 호출이 안되는 이유 > 자동 형변환 됐으니까 자식 메소드 사용 불가

		System.out.println(phone2.x);

		if (phone2 instanceof SmartPhone2) {
			SmartPhone2 sp = (SmartPhone2) phone2; // 강제 형변환 > 캐스팅
			System.out.println("성공");
		} else {
			System.out.println("실패");
		}

	}

}
