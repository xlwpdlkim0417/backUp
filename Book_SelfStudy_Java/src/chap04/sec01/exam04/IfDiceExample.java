package chap04.sec01.exam04;
//주사위의 번호 뽑기 

public class IfDiceExample {

	public static void main(String[] args) {

		int num = (int) (Math.random() * 6) + 1; // 주사위 번호 하나 뽑기
		// int 타입 변수 num에 (int 타입으로 강제 타입 변환한) {(0~5)+1 = 1~6} 범위 안의 임의의 값 저장

		if (num == 1) { // if-else문 시작
			// 조건문 : int 타입 변수 num에 저장된 임의의 값이 1일 때
			System.out.println("1번이 나왔습니다.");
		} else if (num == 2) { // if-else문 시작
			// 조건문 : int 타입 변수 num에 저장된 임의의 값이 2일 때
			System.out.println("2번이 나왔습니다.");
		} else if (num == 3) { // if-else문 시작
			// 조건문 : int 타입 변수 num에 저장된 임의의 값이 3일 때
			System.out.println("3번이 나왔습니다.");
		} else if (num == 4) { // if-else문 시작
			// 조건문 : int 타입 변수 num에 저장된 임의의 값이 4일 때
			System.out.println("4번이 나왔습니다.");
		} else if (num == 5) { // if-else문 시작
			// 조건문 : int 타입 변수 num에 저장된 임의의 값이 5일 때
			System.out.println("5번이 나왔습니다.");
		} else { // else 실행 블록
			// 조건문 : int 타입 변수 num에 저장된 임의의 값이 (1~5)가 아닐 때 ▷ 6일 때
			System.out.println("6번이 나왔습니다.");
		}
	}
}
// start부터 시작하는 n개의 정수 중에서 임의의 정수 하나를 얻기 위한 연산식
// int num = (int)(Math.random()*n)+start;