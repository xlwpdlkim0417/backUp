package sec01.exam03;

import java.util.Scanner;

public class IfElseIfElseExample {

	public static void main(String[] args) {

//		Scanner scanner = new Scanner(System.in);
//
//		System.out.println("점수를 입력하세요.");
//		System.out.print("입력> ");
//		int score = scanner.nextInt();
//		int grade = score / 10;
//
//		switch (grade) {
//
//		case 10:
////			System.out.println("등급은 A입니다.");
////			break;
//		case 9:
//			System.out.println("등급은 A입니다.");
//			break;
//		case 8:
//			System.out.println("등급은 B입니다.");
//			break;
//		case 7:
//			System.out.println("등급은 C입니다.");
//			break;
//		default:
//			System.out.println("등급은 D입니다");
//			break;
//
//		}

		int score = 75;

		if (score >= 90) {
			System.out.println("점수가 100~90입니다.");
			System.out.println("등급은 A입니다.");
		} else if (score >= 80) {
			System.out.println("점수가 80~89입니다.");
			System.out.println("등급은 B입니다.");
		} else if (score >= 70) {
			System.out.println("점수가 70~79입니다.");
			System.out.println("등급은 C입니다.");
		} else {
			System.out.println("점수가 70 미만입니다.");
			System.out.println("등급은 D입니다.");
		}
//		System.out.println("올바른 숫자를 입력해주세요.");

	}

}
//수업시간에 직접 해보고 스위치문으로 바꾸는 연습함