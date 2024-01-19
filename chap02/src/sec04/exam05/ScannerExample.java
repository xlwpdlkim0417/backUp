package sec04.exam05;
//키보드에 입력된 내용을 문자열로 얻기

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) throws Exception { // 예외 처리

		Scanner scanner = new Scanner(System.in); // Scanner 타입 변수 scanner에 시스템의 입력 장치로부터 값을 읽는 Scanner를 생성하여 저장
		String inputData; // String 타입 변수 inputData 선언

		while (true) { // while 반복문 시작
			inputData = scanner.nextLine(); // scanner.nextLine() 메소드는 엔터키가 입력되기 전까지 대기 상태가 되며, 엔터키가 입력되면 입력된 모든 내용을
											// 문자열로 읽음 ▷ 읽어온 문자열을 String 타입 변수 inputData에 저장
			System.out.println("입력된 문자열: \"" + inputData + "\""); // String 타입 변수 inputData에 저장된 문자열 출력
			if (inputData.equals("q")) { // if문 시작 ▷ Sting 타입 변수 inputData가 문자열 q와 동일할 때
				break; // while 반복문 종료
			}
		}
		System.out.println("종료"); // 문자열 "종료" 출력
	}
}