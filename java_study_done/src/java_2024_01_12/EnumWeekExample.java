package _2024_01_12;

import java.util.Calendar;

public class EnumWeekExample {

	public static void main(String[] args) {

		Week today = null;	//열거타입 변수 선언 > 클래스처럼 생각하면 됨

		Calendar cal = Calendar.getInstance();	//로컬 시간과 날짜를 읽어오는 클래스. 객체생성 안하고 대문자로 시작하니까 이거 static 메소드임
		int week = cal.get(Calendar.DAY_OF_WEEK);	//일(1)~토(7)까지의 숫자를 리턴
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		int day = cal.get(Calendar.DATE);

		switch (week) {
		case 1:
			today = Week.SUNDAY;	//열거 상수 대입
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

		System.out.println("오늘 요일: " + year + " " + month + " "+ day + " "+ today);

		if (today == Week.SUNDAY) {
			System.out.println("일요일에는 축구를 합니다.");
		} else {
			System.out.println("열심히 자바 공부합니다.");
		}

	}

}
