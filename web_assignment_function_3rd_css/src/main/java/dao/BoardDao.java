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
import dto.Member;
import util.Cookies;

public class BoardDao {
	private static Connection conn;
	private static BoardDao dao = new BoardDao();

	private BoardDao() {
	}

	public static BoardDao getInstance() {
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

	public ArrayList<Board> selectList() {
		ArrayList<Board> list = new ArrayList<Board>();
		String sql = "SELECT * FROM board ORDER BY num DESC";
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				Board board = new Board(rs.getInt("num"), rs.getString("writer"), rs.getString("title"),
						rs.getString("content"), rs.getString("regtime"), rs.getInt("hits"), rs.getInt("likes"));
				list.add(board);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	

	public ArrayList<Board> selectList(int pagenow, int pageSize) {
		ArrayList<Board> list = new ArrayList<Board>();
		int startRow = (pagenow - 1) * pageSize;
		String sql = "SELECT * FROM ( SELECT a.*, ROWNUM rnum FROM (SELECT * FROM board ORDER BY num DESC) a WHERE ROWNUM <= ? ) WHERE rnum > ?";
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, startRow + pageSize);
			pstmt.setInt(2, startRow); 
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				Board board = new Board(rs.getInt("num"), rs.getString("writer"), rs.getString("title"),
						rs.getString("content"), rs.getString("regtime"), rs.getInt("hits"), rs.getInt("likes"));
				list.add(board);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public ArrayList<Board> selectListHot(int pagenow, int pageSize) {
		ArrayList<Board> list = new ArrayList<Board>();
		int startRow = (pagenow - 1) * pageSize;
		String sql = "SELECT * FROM ( SELECT a.*, ROWNUM rnum FROM (SELECT * FROM board WHERE likes > 10) a WHERE ROWNUM <= ? ) WHERE rnum > ?";
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, startRow + pageSize);
			pstmt.setInt(2, startRow); 
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				Board board = new Board(rs.getInt("num"), rs.getString("writer"), rs.getString("title"),
						rs.getString("content"), rs.getString("regtime"), rs.getInt("hits"), rs.getInt("likes"));
				list.add(board);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public ArrayList<Board> selectList(int pagenow, int pageSize, String writer) {
		ArrayList<Board> list = new ArrayList<Board>();
		int startRow = (pagenow - 1) * pageSize;
		String sql = "SELECT * FROM ( SELECT a.*, ROWNUM rnum FROM (SELECT * FROM board WHERE writer = ? ORDER BY num DESC) a WHERE ROWNUM <= ? ) WHERE rnum > ?";
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(2, startRow + pageSize);
			pstmt.setInt(3, startRow);
			pstmt.setString(1, writer); 
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				Board board = new Board(rs.getInt("num"), rs.getString("writer"), rs.getString("title"),
						rs.getString("content"), rs.getString("regtime"), rs.getInt("hits"), rs.getInt("likes"));
				list.add(board);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	public int selectListNum() {
		int totalPosts = 0;
		String sql = "SELECT COUNT(*) FROM board";
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				totalPosts = rs.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return totalPosts;
	}
	
	public int selectListNumHot() {
		int totalPosts = 0;
		String sql = "SELECT COUNT(*) FROM board WHERE likes > 10";
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				totalPosts = rs.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return totalPosts;
	}
	
	public int selectListNum(String writer) {
		int totalPosts = 0;
		String sql = "SELECT COUNT(*) FROM board WHERE writer = ?";
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, writer);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				totalPosts = rs.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return totalPosts;
	}

	public ArrayList<Board> selectListOne(String writer) {
		ArrayList<Board> list = new ArrayList<Board>();
		String sql = "SELECT * FROM board Where writer = ? ORDER BY num DESC";
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, writer);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				Board board = new Board(rs.getInt("num"), rs.getString("writer"), rs.getString("title"),
						rs.getString("content"), rs.getString("regtime"), rs.getInt("hits"), rs.getInt("likes"));
				list.add(board);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	

	public Board selectOne(int num, boolean inc) {
		Board board = null;
		String sql = "SELECT * FROM board WHERE num = ?";
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				board = new Board(rs.getInt("num"), rs.getString("writer"), rs.getString("title"),
						rs.getString("content"), rs.getString("regtime"), rs.getInt("hits"), rs.getInt("likes"));
			}
			if (inc) {
				pstmt.executeUpdate("UPDATE board SET hits=hits+1 WHERE num=" + num);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return board;
	}

	public Board selectOneDelete(int num) {
		Board board = null;
		String sql = "SELECT * FROM board WHERE num = ?";
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				board = new Board(rs.getInt("num"), rs.getString("writer"), rs.getString("title"),
						rs.getString("content"), rs.getString("regtime"), rs.getInt("hits"), rs.getInt("likes"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return board;
	}

	public int delete(int num) {
		try (PreparedStatement pstmt = conn.prepareStatement("DELETE FROM board WHERE num =" + num);) {
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	public int update(Board board, boolean inc) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String formattedDateTime = LocalDateTime.now().format(formatter);

		String sql = "UPDATE board SET writer = ?, title = ?, content = ?, regtime = ? WHERE num = ?";
		try (PreparedStatement pstmt = conn.prepareStatement(sql);) {
			pstmt.setString(1, board.getWriter());
			pstmt.setString(2, board.getTitle());
			pstmt.setString(3, board.getContent());
			pstmt.setInt(5, board.getNum());
			pstmt.setString(4, formattedDateTime);
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	public int insert(Board board) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String formattedDateTime = LocalDateTime.now().format(formatter);

		String sql = "INSERT INTO board (num, writer, title, content, regtime, hits, likes) VALUES (SEQ_COMMEN.nextval, ?, ?, ?, ?, 0, 0)";
		try (PreparedStatement pstmt = conn.prepareStatement(sql);) {
			
			pstmt.setString(1, board.getWriter());
			pstmt.setString(2, board.getTitle());
			pstmt.setString(3, board.getContent());
			pstmt.setString(4, formattedDateTime);
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	public int insertComment(Board board) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String formattedDateTime = LocalDateTime.now().format(formatter);

		String sql = "INSERT INTO board (writer, content, regtime) VALUES (?, ?, ?)";
		try (PreparedStatement pstmt = conn.prepareStatement(sql);) {
			pstmt.setString(1, board.getWriter());
			pstmt.setString(2, board.getContent());
			pstmt.setString(3, formattedDateTime);
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	public int like(int num, Member member) {
		String sql = "UPDATE board SET likes=likes+1 WHERE num=" + num;
		try {

			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return num;
	}

}