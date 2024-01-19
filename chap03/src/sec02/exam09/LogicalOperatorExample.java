package sec02.exam09;
//논리 연산자

public class LogicalOperatorExample {

	public static void main(String[] args) {

		int charCode = 'A'; // int 타입 변수 charCode에 문자 리터럴 'A' 저장 ▷ 65

		if ((charCode >= 65) & (charCode <= 90)) { // if문 시작
			// int 타입 변수 charCode의 값이 65보다 크거나 같다
			// int 타입 변수 charCode의 값이 90보다 작거나 같다
			// 앞 조건과 뒤 조건 모두 true/false 여부 확인 ▷ true / true
			// 두 조건 모두 true일 때 결과 true

			System.out.println("대문자군요");
		}

		if ((charCode >= 97) && (charCode <= 122)) { // if문 시작
			// int 타입 변수 charCode의 값이 97보다 크거나 같다
			// int 타입 변수 charCode의 값이 122보다 작거나 같다
			// 앞 조건 true일 때 뒤 조건 true 여부 확인 ▷ 앞 조건 false
			// 두 조건 모두 true일 때 결과 true

			System.out.println("소문자군요");
		}

		if (!(charCode < 48) && !(charCode > 57)) { // if문 시작
			// int 타입 변수 charCode의 값이 48보다 작지 않다
			// int 타입 변수 charCode의 값이 57보다 크지 않다
			// 앞 조건 true일 때 뒤 조건 true 여부 확인 ▷ true / false
			// 두 조건 모두 true일 때 결과 true

			System.out.println("0~9 숫자군요");
		}

		int value = 6; // int 타입 변수 value에 정수 리터럴 값 6 저장

		if ((value % 2 == 0) | (value % 3 == 0)) { // if문 시작
			// int 타입 변수 value를 2로 나눈 나머지가 0 ▷ true
			// int 타입 변수 value를 3으로 나눈 나머지가 0 ▷ true
			// 앞 조건과 뒤 조건 모두 true/false 여부 확인 ▷ true / true
			// 두 조건 중 하나라도 true일 때 결과 true

			System.out.println("2 또는 3의 배수군요");
		}

		if ((value % 2 == 0) || (value % 3 == 0)) { // if문 시작
			// int 타입 변수 value를 2로 나눈 나머지가 0 ▷ true
			// int 타입 변수 value를 3으로 나눈 나머지가 0 ▷ true
			// 앞 조건 true일 때 뒤 조건 true 여부 확인 ▷ 앞 조건 true / 뒤 조건 true
			// 두 조건 중 하나라도 true일 때 결과 true

			System.out.println("2 또는 3의 배수군요");
		}
	}
}