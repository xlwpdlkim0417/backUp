package sec01.exam02;
//변수 사용

public class VariableUseExample {

	public static void main(String[] args) {

		int hour = 3; // 정수 타입 hour 변수에 3 저장
		int minute = 5; // 정수 타입 minute 변수에 5 저장
		System.out.println(hour + "시간 " + minute + "분");

		int totalMinute = (hour * 60) + minute; // 정수 타입 변수에 저장된 값을 새로운 변수에 저장
		System.out.println("총 " + totalMinute + "분");
	}
}