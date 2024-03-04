package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import dto.newBoard;

public class BoardDao {

	private static Connection conn;
	private static BoardDao dao = new BoardDao();

	private BoardDao() {
	} // 생성자

	public static BoardDao getInstance() {
		BoardDao.getConnection();
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
	
	public ArrayList<newBoard> selectList(int pagenow, int pageSize) {
		ArrayList<newBoard> list = new ArrayList<newBoard>();
		int startRow = (pagenow - 1) * pageSize;
		String sql = "SELECT * FROM (\n"
				+ "  SELECT a.*, ROWNUM rnum FROM (\n"
				+ "    SELECT b.num, b.title, b.content, b.regtime, b.hits, b.memberno, m.id, m.email, m.name\n"
				+ "    FROM newboard b\n"
				+ "    JOIN newmember m ON b.memberno = m.memberno\n"
				+ "    ORDER BY b.num DESC\n"
				+ "  ) a\n"
				+ "  WHERE ROWNUM <= ?\n"
				+ ") WHERE rnum > ?";
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, startRow + pageSize);
			pstmt.setInt(2, startRow); 
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				newBoard newboard = new newBoard(rs.getInt("num"), rs.getString("title"), rs.getString("content"),
						rs.getString("regtime"), rs.getInt("hits"), rs.getInt("memberno"), rs.getString("name"));
				list.add(newboard);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public int selectListNum() {
		int totalPosts = 0;
		String sql = "SELECT COUNT(*) FROM newboard";
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

	// 페이징 할 때 필요한 총 게시글 수
	public int selectCount() {
		String sql = "select count(*) from newboard";
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();

			if (rs.next()) {
				return rs.getInt(1);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;

	}

	// BoardList 페이징

	public ArrayList<newBoard> selectPage(int startRow, int size) {
		ArrayList<newBoard> list = new ArrayList<>();
		String sql = "SELECT * FROM (SELECT rownum as rnum, b.num, b.title, b.content, b.regtime, b.hits, b.memberno, m.id, m.email, m.name"
				+ "FROM (SELECT * FROM newboard ORDER BY num DESC) b JOIN newmember m ON b.memberno = m.memberno) WHERE rnum BETWEEN 1 AND 5";
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, startRow);
			pstmt.setInt(2, size);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				newBoard newboard = new newBoard(rs.getInt("num"), rs.getString("title"), rs.getString("content"),
						rs.getString("regtime"), rs.getInt("hits"), rs.getInt("memberno"), rs.getString("name"));
				list.add(newboard);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	//
	public ArrayList<newBoard> selectList() {
		ArrayList<newBoard> list = new ArrayList<>();
		String sql = "select b.*, m.name from newboard b left join newmember m on b.memberno = m.memberno order by num desc";
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				newBoard newboard = new newBoard(rs.getInt("num"), rs.getString("title"), rs.getString("content"),
						rs.getString("regtime"), rs.getInt("hits"), rs.getInt("memberno"), rs.getString("name"));
				list.add(newboard);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	// 게시글을 조회하기 위해 불러오기
	public newBoard selectOne(int num, boolean inc) {
		newBoard board = null;
		String sql = "select b.*, m.name from board b left join member m on b.memberno = m.memberno where num = ? order by num desc";
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			ResultSet rs = pstmt.executeQuery();

			if (rs.next()) {
				board = new newBoard(rs.getInt("num"), rs.getString("title"), rs.getString("content"),
						rs.getString("regtime"), rs.getInt("hits"), rs.getInt("memberno"), rs.getString("name"));

			}
			if (inc) {
				pstmt.executeUpdate("update board set hits=hits+1 where num=" + num);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return board;

	}

	// 게시글 삭제
	public int delete(int num) {
		int result = 0;
		try (PreparedStatement pstmt = conn.prepareStatement("delete from board where num=" + num);) {
			// 쿼리 실행
			result = pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	// 게시글 작성
	public int insert(newBoard newboard) {
		String sql = "insert into newboard(num, title, content, regtime, hits, memberno) values (board_seq.nextval,?,?,sysdate,0,?)";
		try (PreparedStatement pstmt = conn.prepareStatement(sql);) {
			pstmt.setString(1, newboard.getTitle());
			pstmt.setString(2, newboard.getContent());
			pstmt.setInt(3, newboard.getMemberno());
			return pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	public int update(newBoard board) {
		String sql = "update board set title=?, content=?, regtime=TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS') where num=?";
		try (PreparedStatement pstmt = conn.prepareStatement(sql);) {

			pstmt.setString(1, board.getTitle());
			pstmt.setString(2, board.getContent());
			pstmt.setInt(3, board.getNum());
			return pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

}