package sec01.exam01;
//자식 클래스

public class DmbCellPhone extends CellPhone { // 상속
	// 부모 클래스 : CellPhone
	// 자식 클래스 : DmbCellPhone

	// 필드
	int channel;
	// DmbCellPhone 클래스 필드 선언

	// 생성자
	DmbCellPhone(String model, String color, int channel) {
		// DmbCellPhone 클래스의 생성자
		// 매개 변수 : String model, String color, int channel
		this.model = model;
		// DmbCellPhone 클래스의 생성자로 전달된 매개 변수 값 인스턴스 필드에 저장
		// 부모 클래스로부터 상속받은 필드
		this.color = color;
		// DmbCellPhone 클래스의 생성자로 전달된 매개 변수 값 인스턴스 필드에 저장
		// 부모 클래스로부터 상속받은 필드
		this.channel = channel;
	}

	// 메소드
	void turnOnDmb() {
		// 메소드 선언
		// 리턴 타입 : void
		System.out.println("채널 " + channel + "번 DMB 방송 수신을 시작합니다.");
	}

	void changeChannelDmb(int channel) {
		// 메소드 선언
		// 리턴 타입 : void
		// 매개 변수 : int channel
		this.channel = channel;
		// DmbCellPhone 클래스의 생성자로 전달된 매개 변수 값 인스턴스 필드에 저장
		System.out.println("채널 " + channel + "번으로 바꿉니다.");
	}

	void turnOffDmb() {
		// 메소드 선언
		// 리턴 타입 void
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}
}