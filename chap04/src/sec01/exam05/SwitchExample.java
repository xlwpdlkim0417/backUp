package sec01.exam05;
//switch문

public class SwitchExample {

	public static void main(String[] args) {

		int num = (int) (Math.random() * 6) + 1; // 주사위 번호 하나 뽑기
		// int 타입 변수 num에 (int 타입으로 강제 타입 변환한) {(0~5)+1 = 1~6} 범위 안의 임의의 값 저장

		switch (num) { // switch문 시작
		case 1: // int 타입 변수 num에 저장된 임의의 값이 1일 때
			System.out.println("1번이 나왔습니다.");
			break; // 다음 케이스를 실행하지 않고 switch문 종료
		case 2: // int 타입 변수 num에 저장된 임의의 값이 2일 때
			System.out.println("2번이 나왔습니다.");
			break; // 다음 케이스를 실행하지 않고 switch문 종료
		case 3: // int 타입 변수 num에 저장된 임의의 값이 3일 때
			System.out.println("3번이 나왔습니다.");
			break; // 다음 케이스를 실행하지 않고 switch문 종료
		case 4: // int 타입 변수 num에 저장된 임의의 값이 4일 때
			System.out.println("4번이 나왔습니다.");
			break; // 다음 케이스를 실행하지 않고 switch문 종료
		case 5: // int 타입 변수 num에 저장된 임의의 값이 5일 때
			System.out.println("5번이 나왔습니다.");
			break; // 다음 케이스를 실행하지 않고 switch문 종료
		default: // int 타입 변수 num에 저장된 임의의 값이 (1~5)가 아닐 때
			System.out.println("6번이 나왔습니다.");
			break;
		} // switch문 종료
	}
}