package java_2024_01_24.sec02.exam01;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TryCatchEx {

	public static void main(String[] args) {
		java.lang.String str;
		try {

			Class.forName("com.mysql.cj.jdbc.Driver"); // 이거 실행했을 때

		} catch (ClassNotFoundException e) { // 예외 잡기
			System.out.println("클래스가 존재하지 않음");
			e.printStackTrace(); // 개발할 때만 써보고 프로그램 출시할 때는 삭제 ㄱㄱ 오류 알려주는 구문임
		} finally {
			System.out.println("반드시 실행");
		}

		try {
			Connection conn = DriverManager.getConnection(null);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
// 예외 상황을 내가 제어
