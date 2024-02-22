package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import dto.Board;

public class BoardDao {
	private static Connection conn;
	private static BoardDao dao = new BoardDao();
	// static 키워드가 사용된 변수나 메소드는 객체 생성 없이 클래스 이름을 통해 직접 접근할 수 있습니다.
	// 이는 dao 변수가 BoardDao 클래스의 어떤 인스턴스에도 속하지 않고, 클래스 레벨에서 관리되며, 이 클래스의 모든 인스턴스가
	// 공유하는 공통 자원이 됨을 의미합니다.
	// dao 변수가 프로그램 실행 시 클래스가 메모리에 로드될 때 자동으로 생성되고, 이 클래스의 인스턴스 생성 여부와 관계없이 사용할 수
	// 있습니다.
	// BoardDao 클래스의 인스턴스를 따로 생성하지 않아도 BoardDao.dao 형태로 언제든지 접근하여 사용할 수 있습니다.

	private BoardDao() {
	}

	public static BoardDao getInstance() {
//		conn = getConnection();
		getConnection();
		return dao;
	}

//	private static Connection getConnection() {
	private static void getConnection() {
//		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project1", "root", "mysql");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		return conn;
		// 전역변수를 리턴할 필요는 없음 리턴은 지역변수나 일부분에 해당하는 걸 리턴해줄 때 의미가 있음
		// 전역 변수로 바꾸는 건 Connection getConnection() 이 메소드를 void로 바꾸고 conn =
		// getConnection(); 이 부분을 getConnection(); 이걸로 실행만 해주면 됨
	}
	
	public int selectCount() {
		String sql = "select count(*) from board";
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
				return rs.getInt(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
		
	}
	
	public ArrayList<Board> select(int startRow, int size) {
		ArrayList<Board> list = new ArrayList<Board>();
		// DB에 있는 내용을 ArrayList에 집어 넣음
		// 위에 있는 말은 아래에 나올 내용에 대한 거고 정확히는 dto를 ArrayList에 넣어주는 거임
		String sql = "SELECT * FROM board ORDER BY num DESC limit ?, ?";
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, startRow);
			pstmt.setInt(2, size);
			// this는 생략이 가능하고 .getconnection은 위에 있는 메소드임
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				// dto에 객체를 생성해서 매개변수로 rs.next(); 돌린 내용을 넣은거임
				Board board = new Board(rs.getInt("num"), rs.getString("writer"), rs.getString("title"),
						rs.getString("content"), rs.getString("regtime"), rs.getInt("hits"));
				list.add(board);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
		// ArrayList<Board>를 리턴하는 거임
	}

	public ArrayList<Board> selectList() {
		ArrayList<Board> list = new ArrayList<Board>();
		// DB에 있는 내용을 ArrayList에 집어 넣음
		// 위에 있는 말은 아래에 나올 내용에 대한 거고 정확히는 dto를 ArrayList에 넣어주는 거임
		String sql = "SELECT * FROM board ORDER BY num DESC";
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
			// this는 생략이 가능하고 .getconnection은 위에 있는 메소드임
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				// dto에 객체를 생성해서 매개변수로 rs.next(); 돌린 내용을 넣은거임
				Board board = new Board(rs.getInt("num"), rs.getString("writer"), rs.getString("title"),
						rs.getString("content"), rs.getString("regtime"), rs.getInt("hits"));
				list.add(board);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
		// ArrayList<Board>를 리턴하는 거임
	}

	public Board selectOne(int num, boolean inc) {
		// 한 개 밖에 없다는 확신이 있으니까 ArrayList를 안쓴거임
		// 왜 확신이 있지? num이 프라이머리키잖아 존재한다면 반드시 하나 / 존재하지 않는다면 값이 없거나
		Board board = null;
		String sql = "SELECT * FROM board WHERE num = ?";
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				// dto에 객체를 생성해서 매개변수로 rs.next(); 돌린 내용을 넣은거임
				board = new Board(rs.getInt("num"), rs.getString("writer"), rs.getString("title"),
						rs.getString("content"), rs.getString("regtime"), rs.getInt("hits"));

			}
			if (inc) {
				pstmt.executeUpdate("UPDATE board SET hits=hits+1 WHERE num=" + num);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return board;
	}

	public int write(int num) {
//		사실상 이 메소드는 필요한 메소드는 아님 만약에 이걸 메소드로 만들고 싶으면 일단 update와 insert를 분리해야 하고 그러면 아마 form을 각각 만들어야할 거란 말이지

		String writer = "";
		String title = "";
		String content = "";
		String result = "writer + title + content";
		String sql = "SELECT * FROM board WHERE num = ?";
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				// 읽어들인 글 데이터를 변수에 저장
				writer = rs.getString("writer");
				title = rs.getString("title");
				content = rs.getString("content");
				System.out.println("트라이 오류~");
				System.out.println(writer);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("캐치 오류~");
		}
		return 0;
	}

	public int delete(int num) {
//		int result = 0;
//		String sql = "DELETE FROM board WHERE num = ?";
//		PreparedStatement pstmt;
//		try {
//			pstmt = conn.prepareStatement(sql);
//			pstmt.setInt(1, num);
//			result = pstmt.executeUpdate();
//			if (result >= 1) {
//				System.out.println("delete 성공");
//			} else {
//				System.out.println("delete 실패");
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		return result;
		try (PreparedStatement pstmt = conn.prepareStatement("DELETE FROM board WHERE num =" + num);) {
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
		// delete 되면 pstmt.executeUpdate();가 1을 리턴하고 거기서 리턴이 안되면 catch문을 지나서 0이 리턴되는 거임
	}

	public int update(Board board) {
//		int result = 0;
//		String curTime = LocalDate.now() + " " + LocalTime.now().toString().substring(0, 8);
//		String sql = "UPDATE board SET writer = ?, title = ?, content = ?, regtime = ? WHERE num = ?";
//		PreparedStatement pstmt;
//		try {
//			pstmt = conn.prepareStatement(sql);
//			pstmt.setString(1, board.getWriter());
//			pstmt.setString(2, board.getTitle());
//			pstmt.setString(3, board.getContent());
//			pstmt.setString(4, curTime);
//			pstmt.setInt(5, num);
//			result = pstmt.executeUpdate();
//			if (result >= 1) {
//				System.out.println("update 성공");
//			} else {
//				System.out.println("update 실패");
//			}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return result;

		String sql = "UPDATE board SET writer = ?, title = ?, content = ?, regtime = now() WHERE num = ?";
		// now()는 오라클로 넘어갈 때는 sysdate로 써야함 OR CURTIME을 쓰던지
		try (PreparedStatement pstmt = conn.prepareStatement(sql);) {
			pstmt.setString(1, board.getWriter());
			pstmt.setString(2, board.getTitle());
			pstmt.setString(3, board.getContent());
			pstmt.setInt(4, board.getNum());
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	public int insert(Board board) {
//		int result = 0;
//		String curTime = LocalDate.now() + " " + LocalTime.now().toString().substring(0, 8);
//		String sql = "INSERT INTO board (writer, title, content, regtime, hits) VALUES (?, ?, ?, ?, 0)";
//		PreparedStatement pstmt;
//		try {
//			pstmt = conn.prepareStatement(sql);
//			pstmt.setString(1, board.getWriter());
//			pstmt.setString(2, board.getTitle());
//			pstmt.setString(3, board.getContent());
//			pstmt.setString(4, curTime);
//			result = pstmt.executeUpdate();
//			if (result >= 1) {
//				System.out.println("insert 성공");
//			} else {
//				System.out.println("insert 실패");
//			}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return result;

		String sql = "INSERT INTO board (writer, title, content, regtime, hits) VALUES (?, ?, ?, now(), 0)";
		// now()는 오라클로 넘어갈 때는 sysdate로 써야함 OR CURTIME을 쓰던지
		try (PreparedStatement pstmt = conn.prepareStatement(sql);) {
			pstmt.setString(1, board.getWriter());
			pstmt.setString(2, board.getTitle());
			pstmt.setString(3, board.getContent());
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	public int hits(int num) {
		String sql = "UPDATE board SET hits=hits+1 WHERE num=" + num;

		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return num;
	}
}
// ArrayList<Board>도 객체 생성해야 하고 Board board도 객체 생성을 해줘야 NPO가 발생하지 않음