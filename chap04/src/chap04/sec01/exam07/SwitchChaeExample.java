package sec01.exam07;
//char 타입의 switch문

public class SwitchChaeExample {

	public static void main(String[] args) {

		char grade = 'B'; // char 타입 변수 grade에 문자 리터럴 'B' 저장

		switch (grade) { // switch문 시작
		case 'A': // int 타입 변수 grade에 저장된 값이 'A'일 때
		case 'a': // int 타입 변수 grade에 저장된 값이 'a'일 때
			System.out.println("우수 회원입니다");
			break; // 다음 케이스를 실행하지 않고 switch문 종료
		case 'B': // int 타입 변수 grade에 저장된 값이 'B'일 때
		case 'b': // int 타입 변수 grade에 저장된 값이 'b'일 때
			System.out.println("일반 회원입니다.");
			break; // 다음 케이스를 실행하지 않고 switch문 종료
		default: // int 타입 변수 grade에 저장된 값이 ('A', 'a', 'B', 'b')가 아닐 때
			System.out.println("손님입니다.");

		} // switch문 종료
	}
}