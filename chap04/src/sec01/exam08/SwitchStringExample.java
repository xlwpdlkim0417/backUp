package sec01.exam08;
//String 타입의 switch문

public class SwitchStringExample {

	public static void main(String[] args) {

		String position = "과장"; // String 타입 변수 position에 문자열 "과장" 저장

		switch (position) { // switch문 시작
		case "부장": // String 타입 변수 position에 저장된 문자열이 "부장"일 때
			System.out.println("700만원");
			break; // 다음 케이스를 실행하지 않고 switch문 종료
		case "과장": // String 타입 변수 position에 저장된 문자열이 "과장"일 때
			System.out.println("500만원");
			break; // 다음 케이스를 실행하지 않고 switch문 종료
		default: // String 타입 변수 position에 저장된 문자열이 ("부장", "과장")이 아닐 때
			System.out.println("300만원");
		} // switch문 종료
	}
}