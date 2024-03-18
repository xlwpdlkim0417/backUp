package dao;

import java.sql.ResultSet;
import java.util.List;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

import dto.Board;

public class BoardDao {

	private JdbcTemplate jdbcTemplate;

	public BoardDao(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public List<Board> selectAll() {
		List<Board> results = jdbcTemplate.query("SELECT * FROM Board", (ResultSet rs, int rowNum) -> {
			Board dto = new Board(rs.getInt("num"), rs.getString("writer"), rs.getString("title"),
					rs.getString("content"), rs.getString("regtime"), rs.getInt("hits"));
			return dto;
		});
		return results;
	}
}