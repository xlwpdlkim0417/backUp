package chap07.sec01.exam01;
//자식 클래스 사용

public class DmbCellPhoneExample {

	public static void main(String[] args) {

		// DmbCellPhone 객체 생성
		DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰", "검정", 10);
		// DmbCellPhone 클래스의 객체를 참조하는 변수 dmbCellPhone 선언
		// new 연산자와 DmbCellPhone 클래스의 생성자로 인스턴스 생성 후 메모리 주소 저장
		// 매개 변수로 전달된 값으로 인스턴스 생성

		// CellPhone 클래스로부터 상속받은 필드
		System.out.println("모델: " + dmbCellPhone.model);
		// dmbCellPhone.로 필드값 읽기
		// 부모 클래스로부터 상속받은 필드
		System.out.println("색상: " + dmbCellPhone.color);
		// dmbCellPhone.로 필드값 읽기
		// 부모 클래스로부터 상속받은 필드

		// DmbCellPhone 클래스의 필드
		System.out.println("채널: " + dmbCellPhone.channel);
		// dmbCellPhone.로 필드값 읽기
		// DmbCellPhone 클래스의 필드

		// CellPhone 클래스로부터 상속받은 메소드 호출
		dmbCellPhone.powerOn();
		// dmbCellPhone.로 메소드 호출
		// 부모 클래스로부터 상속받은 메소드
		dmbCellPhone.bell();
		// dmbCellPhone.로 메소드 호출
		// 부모 클래스로부터 상속받은 메소드
		dmbCellPhone.sendVoice("여보세요.");
		// dmbCellPhone.로 메소드 호출
		// 부모 클래스로부터 상속받은 메소드
		dmbCellPhone.receiveVoice("안녕하세요! 저는 홍길동인데요.");
		// dmbCellPhone.로 메소드 호출
		// 부모 클래스로부터 상속받은 메소드
		dmbCellPhone.sendVoice("아~ 예 반갑습니다.");
		// dmbCellPhone.로 메소드 호출
		// 부모 클래스로부터 상속받은 메소드
		dmbCellPhone.hangUp();
		// dmbCellPhone.로 메소드 호출
		// 부모 클래스로부터 상속받은 메소드

		// DmbCellPhone 클래스의 메소드 호출
		dmbCellPhone.turnOnDmb();
		// dmbCellPhone.로 메소드 호출
		// DmbCellPhone 클래스의 메소드
		dmbCellPhone.changeChannelDmb(12);
		// dmbCellPhone.로 메소드 호출
		// DmbCellPhone 클래스의 메소드
		dmbCellPhone.turnOffDmb();
		// dmbCellPhone.로 메소드 호출
		// DmbCellPhone 클래스의 메소드
	}
}