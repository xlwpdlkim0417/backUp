package sec02.exam03;
//Tire 클래스

public class Tire {

	// 필드
	public int maxRotation; // 최대 회전수(타이어 수명)
	// public 접근 제한자
	// Tire 클래스의 필드 선언
	public int accumulatedRotation; // 누적 회전수
	public String location; // 타이어의 위치

	// 생성자
	public Tire(String location, int maxRotation) {
		// Tire 클래스의 생성자 선언
		// public 접근 제한자
		// 매개 변수 : String location, int maxRotation
		this.location = location; // 필드값 초기화
		// Tire 클래스의 필드에 매개 변수 값 저장
		this.maxRotation = maxRotation; // 필드값 초기화
	}

	// 메소드
	public boolean roll() {
		// public 접근 제한자
		// 리턴 타입 : boolean
		++accumulatedRotation; // 누적 회전수 1 증가
		// 증가 연산자
		if (accumulatedRotation < maxRotation) { // 정상 회전(누적<최대)일 경우 실행
			// 조건식
			System.out.println(location + " Tire 수명: " + (maxRotation - accumulatedRotation) + "회");
			return true;
		} else { // 펑크(누적=최대)일 경우 실행
			System.out.println("***" + location + " Tire 펑크 ***");
			return false;
		}
	}
}