package sec02.exam05;

public class MainStringArrayArgument {

	public static void main(String[] args) {

		if (args.length != 2) { // 입력된 데이터 갯수가 2개가 아닐 경우
								// 실행할 때 매개값을 주지 않으면 길이 0인 String 배열이 매개값으로 전달되고 args.length는 0이 되므로 if 조건식은
								// true
			System.out.println("값의 수가 부족합니다.");
			System.exit(0); // 프로그램 강제 종료

		}

		String strNum1 = args[0]; // 첫 번째 데이터 얻기 //매개값을 임의로 설정했을 경우에 가능
		String strNum2 = args[1]; // 두 번째 데이터 얻기

		int num1 = Integer.parseInt(strNum1); // 문자열을 정수로 변환
		int num2 = Integer.parseInt(strNum2); // 문자열을 정수로 변환

		int result = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + result);

	}

}
// 우클릭 - Run As - Run Configurations - Argument - Program argument 입력란에 값을 입력 - Apply - Run