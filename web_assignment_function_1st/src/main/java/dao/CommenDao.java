package dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.Board;
import dto.Commen;
import dto.Member;
import util.Cookies;

public class CommenDao {
	private static Connection conn;
	private static CommenDao dao = new CommenDao();

	private CommenDao() {
	}

	public static CommenDao getInstance() {
		getConnection();
		return dao;
	}

	private static void getConnection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	public ArrayList<Commen> selectList() {
		ArrayList<Commen> list = new ArrayList<Commen>();
		String sql = "SELECT * FROM commen ORDER BY num DESC";
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				Commen commen = new Commen(rs.getInt("num"), rs.getString("writer"), rs.getString("content"),
						rs.getString("regtime"), rs.getInt("hits"), rs.getInt("likes"));
				list.add(commen);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	public ArrayList<Commen> selectListOne(int num) {
		ArrayList<Commen> list = new ArrayList<Commen>();
		String sql = "SELECT * FROM commen Where num = ? ORDER BY num DESC";
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				Commen commen = new Commen(rs.getInt("num"), rs.getString("writer"), rs.getString("content"),
						rs.getString("regtime"), rs.getInt("hits"), rs.getInt("likes"));
				list.add(commen);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public ArrayList<Commen> selectListOne(String writer) {
		ArrayList<Commen> list = new ArrayList<Commen>();
		String sql = "SELECT * FROM commen Where writer = ? ORDER BY num DESC";
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, writer);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				Commen commen = new Commen(rs.getInt("num"), rs.getString("writer"), rs.getString("content"),
						rs.getString("regtime"), rs.getInt("hits"), rs.getInt("likes"));
				list.add(commen);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	public Commen selectOne(int num, boolean inc) {
		Commen commen = null;
		String sql = "SELECT * FROM commen WHERE num = ?";
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				commen = new Commen(rs.getInt("num"), rs.getString("writer"), rs.getString("content"),
						rs.getString("regtime"), rs.getInt("hits"), rs.getInt("likes"));
			}
			if (inc) {
				pstmt.executeUpdate("UPDATE commen SET hits=hits+1 WHERE num=" + num);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return commen;
	}

	public Commen selectOneDelete(int num) {
		Commen commen = null;
		String sql = "SELECT * FROM commen WHERE num = ?";
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				commen = new Commen(rs.getInt("num"), rs.getString("writer"), rs.getString("content"),
						rs.getString("regtime"), rs.getInt("hits"), rs.getInt("likes"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return commen;
	}

	public int delete(int num) {
		try (PreparedStatement pstmt = conn.prepareStatement("DELETE FROM commen WHERE num =" + num);) {
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	public int update(Commen commen, boolean inc) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String formattedDateTime = LocalDateTime.now().format(formatter);

		String sql = "UPDATE commen SET writer = ?, content = ?, regtime = ? WHERE num = ?";
		try (PreparedStatement pstmt = conn.prepareStatement(sql);) {
			pstmt.setString(1, commen.getWriter());
			pstmt.setString(2, commen.getContent());
			pstmt.setInt(4, commen.getNum());
			pstmt.setString(3, formattedDateTime);
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	public int insert(Commen commen) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String formattedDateTime = LocalDateTime.now().format(formatter);

		String sql = "INSERT INTO commen (num, writer, content, regtime, hits, likes) VALUES (?, ?, ?, ?, 0, 0)";
		try (PreparedStatement pstmt = conn.prepareStatement(sql);) {
			pstmt.setString(2, commen.getWriter());
			pstmt.setString(3, commen.getContent());
			pstmt.setString(4, formattedDateTime);
			pstmt.setInt(1, commen.getNum());
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	public int like(int num, Member member) {
		String sql = "UPDATE commen SET likes=likes+1 WHERE num=" + num;
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return num;
	}
}