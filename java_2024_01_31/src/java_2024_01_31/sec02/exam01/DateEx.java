package sec02.exam01;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class DateEx {

	public static void main(String[] args) {

		Date now = new Date();
		System.out.println(now);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh:mm:ss");
		System.out.println(sdf);
		System.out.println(sdf.format(now));

		LocalDate date = LocalDate.now();
		System.out.println(date);
		LocalDateTime datetime = LocalDateTime.now();
		System.out.println(datetime);
		// 이걸 잘 기억해두고 이거 위주로 써 나가는 연습을 하십쇼 휴먼

		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
		
		
	}

}
