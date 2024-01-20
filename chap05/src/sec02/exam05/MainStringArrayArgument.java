package sec02.exam05;
//main() 메소드의 매개 변수

public class MainStringArrayArgument {

	public static void main(String[] args) {

		if (args.length != 2) { // if문 시작
			// 조건식 : 참조 타입 변수 args가 참조하는 String 타입 배열의 길이가 2가 아닐 때
			// true

			System.out.println("값의 수가 부족합니다.");
			System.exit(0); // JVM 종료 메소드 (매가 변수 0일 때 정상 종료)

		} // if문 종료

		String strNum1 = args[0];
		// String 타입 변수 strNum1에 String 타입 배열 객체 인덱스 [0] 값 저장
		String strNum2 = args[1];
		// String 타입 변수 strNum2에 String 타입 배열 객체 인덱스 [1] 값 저장

		int num1 = Integer.parseInt(strNum1);
		// int 타입 변수 num1에 (Integer.parseInt)로 강제 타입 변환한 String 타입 변수 strNum1에 저장된 값 저장
		int num2 = Integer.parseInt(strNum2);
		// int 타입 변수 num1에 (Integer.parseInt)로 강제 타입 변환한 String 타입 변수 strNum1에 저장된 값 저장

		int result = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + result);
	}
}
// 우클릭 - Run As - Run Configurations - Argument - Program argument 입력란에 값을 입력 - Apply - Run