package sec02.exam09;

public class LogicalOperatorExample {

	public static void main(String[] args) {

		int charCode = 'A';

		if ((charCode >= 65) & (charCode <= 90)) { // A&B = A도 실행 B도 실행
													// A&&B = A가 참이면 B와 상관없이 실행, 만약에 A가 거짓이면서 B가 참이면 실행? 맞음?
			System.out.println("대문자군요");
		}

		if ((charCode >= 97) && (charCode <= 122)) {
			System.out.println("소문자군요");
		}

		if (!(charCode < 48) && !(charCode > 57)) {
			System.out.println("0~9 숫자군요");
		}

		int value = 6;

		if ((value % 2 == 0) | (value % 3 == 0)) {
			System.out.println("2 또는 3의 배수군요");
		}

		if ((value % 2 == 0) || (value % 3 == 0)) {
			System.out.println("2 또는 3의 배수군요");
		}
	}

}
