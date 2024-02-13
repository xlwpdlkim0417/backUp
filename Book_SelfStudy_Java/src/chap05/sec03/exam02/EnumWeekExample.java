package chap05.sec03.exam02;

import java.util.Calendar;

public class EnumWeekExample {

	public static void main(String[] args) {

		Week today = null;
		// 열거 타입 Week를 참조하는 참조 변수 today 선언 & null 값으로 초기화

		Calendar cal = Calendar.getInstance();
		// 참조 타입 Calendar 클래스를 참조하는 참조 변수 cal에 getInstance 메소드를 호출
		// static 메소드는 클래스이름.메소드이름()으로 호출 가능
		// getInstance()는 Calendar 클래스 내부에 있는 static 메소드

		// [ChatGPT]
		// Calendar 클래스의 getInstance() 메서드를 사용하여 Calendar 객체를 생성 후 cal 변수에 할당
		// cal 변수에 저장된 객체를 사용하여 Calendar 클래스의 get(int field) 메소드를 호출
		// Calendar 클래스의 get(int field) 메소드는 정적 메소드가 아님

		int week = cal.get(Calendar.DAY_OF_WEEK); // 일(1)~토(7)까지의 숫자를 리턴
		// int 타입 변수 week에 참조 변수 cal가 참조하는 객체를 사용해 Calendar 클래스의 get(int field) 메소드를 호출

		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DATE);

		switch (week) { // int 타입 변수 week가 숫자를 리턴하기 때문에 (변수) 자리에 들어갈 수 있음
		case 1:
			today = Week.SUNDAY; // 열거 상수 대입
			break;
		case 2:
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.TUESDAY;
			break;
		case 4:
			today = Week.WEDNESDAY;
			break;
		case 5:
			today = Week.THURSDAY;
			break;
		case 6:
			today = Week.FRIDAY;
			break;
		case 7:
			today = Week.SATURDAY;
			break;
		}

		System.out.println("오늘 요일: " + year + " " + month + " " + day + " " + today);

		if (today == Week.SUNDAY) {
			System.out.println("일요일에는 축구를 합니다.");
		} else {
			System.out.println("열심히 자바 공부합니다.");
		}
	}
}