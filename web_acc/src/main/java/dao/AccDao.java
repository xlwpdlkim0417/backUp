package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import dto.Acc;

public class AccDao {
	private static Connection conn;
	private static AccDao dao = new AccDao();

	public static AccDao getInstance() {
		getConnection();
		return dao;
	}

	private static void getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/acc", "root", "mysql");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public ArrayList<Acc> selectByMonth(int year, int month) {
		ArrayList<Acc> list = new ArrayList<Acc>();
		// 월 값을 데이터베이스와 맞추기 위해 +1을 해줍니다.
		// SQL 쿼리 수정: 특정 년도와 월에 해당하는 데이터 선택
		String sql = "SELECT * FROM acc WHERE year = ? AND month = ? ORDER BY day ASC";
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, year);
			pstmt.setInt(2, month + 1); // Java에서 month는 0부터 시작하지만, SQL에서는 1부터 시작합니다.
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				Acc acc = new Acc(rs.getInt("num"), rs.getInt("day"), rs.getInt("month") - 1, rs.getInt("year"),
						rs.getString("trname"), rs.getString("dlname"), rs.getString("mulname"));
				list.add(acc);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	public int insert(Acc acc) {
		String sql = "INSERT INTO acc (year, month, day, trname, dlname, mulname) VALUES (?,?,?,?,?,?)";
		try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setInt(1, acc.getYear());
			pstmt.setInt(2, acc.getMonth());
			pstmt.setInt(3, acc.getDay());
			pstmt.setString(4, acc.getTrname());
			pstmt.setString(5, acc.getDlname());
			pstmt.setString(6, acc.getMulname());
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	public int delete(int num) {
		try (PreparedStatement pstmt = conn.prepareStatement("DELETE FROM acc WHERE num =" + num);) {
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	public List<Acc> selectByDateRange(int startYear, int startMonth, int startDay, int endYear, int endMonth,
			int endDay) {
		List<Acc> list = new ArrayList<>();
		String sql = "SELECT TRNAME, MULNAME, COUNT(*) AS count\r\n" + "FROM acc\r\n"
				+ "WHERE (year > ? OR (year = ? AND month > ?) OR (year = ? AND month = ? AND day >= ?))\r\n"
				+ "      AND (year < ? OR (year = ? AND month < ?) OR (year = ? AND month = ? AND day <= ?))\r\n"
				+ "GROUP BY TRNAME, MULNAME\r\n" + "ORDER BY TRNAME, MULNAME;";

		try (PreparedStatement pstmt = conn.prepareStatement(sql)) {

			// 시작 날짜
			pstmt.setInt(1, startYear);
			pstmt.setInt(2, startYear);
			pstmt.setInt(3, startMonth);
			pstmt.setInt(4, startYear);
			pstmt.setInt(5, startMonth);
			pstmt.setInt(6, startDay);
			// 종료 날짜
			pstmt.setInt(7, endYear);
			pstmt.setInt(8, endYear);
			pstmt.setInt(9, endMonth);
			pstmt.setInt(10, endYear);
			pstmt.setInt(11, endMonth);
			pstmt.setInt(12, endDay);

			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				Acc acc = new Acc(rs.getString("trname"), rs.getString("mulname"), rs.getInt("count"));

				list.add(acc);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return list;
	}

	public List<Acc> getStatistics(String startDate, String endDate) {
		List<Acc> resultList = new ArrayList<>();
		String sql = "SELECT TRNAME, MULNAME, COUNT(*) AS COUNT FROM acc WHERE DATE(CONCAT(year, '-', LPAD(month, 2, '0'), '-', LPAD(day, 2, '0'))) BETWEEN ? AND ? GROUP BY TRNAME, MULNAME ORDER BY COUNT DESC;";

		try (PreparedStatement pstmt = conn.prepareStatement(sql)) {

			pstmt.setString(1, startDate);
			pstmt.setString(2, endDate);

			try (ResultSet rs = pstmt.executeQuery()) {
				while (rs.next()) {
					String trName = rs.getString("TRNAME");
					String mulName = rs.getString("MULNAME");
					int count = rs.getInt("COUNT");

					Acc acc = new Acc();
					acc.setTrname(trName);
					acc.setMulname(mulName);
					acc.setCount(count); // 가정: Acc 클래스에 count 필드와 관련 메서드가 존재
					resultList.add(acc);
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return resultList;
	}

}
