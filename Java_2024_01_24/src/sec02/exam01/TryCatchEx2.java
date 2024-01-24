package sec02.exam01;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TryCatchEx2 {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(null);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();

		}

		// catch 옆에 예외 상황 작은거부터 큰 거 순서로 쓸것
		// finally에 걸리면 무조건 실행 catch에 걸리더라도
		// throws 는 오류나면 프로그램 그냥 끝내버리는거고
		// 이건 일단 오류 발생하면 뭘 할지를 메소드로 정할 수 있음 >? 이거 정확하진 않는데 실행문 넣을 수 있는 블록있으니까 가능하지 않을까?
		

	}
}
// 예외 상황을 내가 제어
