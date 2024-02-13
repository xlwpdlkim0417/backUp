package chap04.sec01.exam06;
//break문이 없는 case

public class SwitchNoBreakCaseExample {

	public static void main(String[] args) {

		int time = (int) (Math.random() * 4) + 8; // 8<= ... <=11 사이의 정수 뽑기
		// int 타입 변수 time에 (int 타입으로 강제 타입 변환한) {(0~3)+8 = 8~11} 범위 안의 임의의 값 저장
		System.out.println("[현재 시각: " + time + " 시]");

		switch (time) { // switch문 시작

		case 8: // int 타입 변수 time에 저장된 임의의 값이 8일 때
			System.out.println("출근합니다.");
		case 9: // int 타입 변수 time에 저장된 임의의 값이 9일 때
			System.out.println("회의를 합니다.");
		case 10: // int 타입 변수 time에 저장된 임의의 값이 10일 때
			System.out.println("업무를 봅니다.");
		default: // int 타입 변수 time에 저장된 임의의 값이 (8~10)가 아닐 때
			System.out.println("외근을 나갑니다.");
		} // switch문 종료
	}
}
//break; 가 없으므로 임의의 숫자가 저장되면 해당 case부터 switch문 종료까지 무조건 실행