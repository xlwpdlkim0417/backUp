package spring;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

//@Component
public class MemberDao {

	private JdbcTemplate jdbcTemplate;

	public MemberDao(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public Member selectByEmail(String email) {
		List<Member> results = jdbcTemplate.query("SELECT * FROM MEMBER WHERE EMAIL = ?", new RowMapper<Member>() {
			@Override
			public Member mapRow(ResultSet rs, int rowNum) throws SQLException {
				Member member = new Member(rs.getString("EMAIL"), rs.getString("PASSWORD"), rs.getString("NAME"),
						rs.getTimestamp("REGDATE").toLocalDateTime());
				member.setId(rs.getLong("ID"));
				return member;
			}
		}, email);
		return results.isEmpty() ? null : results.get(0);
	}

	public Member selectByEmail2(String email) {
		Member results = jdbcTemplate.queryForObject("SELECT * FROM MEMBER WHERE EMAIL = ?", new RowMapper<Member>() {
			@Override
			public Member mapRow(ResultSet rs, int rowNum) throws SQLException {
				Member member = new Member(rs.getString("EMAIL"), rs.getString("PASSWORD"), rs.getString("NAME"),
						rs.getTimestamp("REGDATE").toLocalDateTime());
				member.setId(rs.getLong("ID"));
				return member;
			}
		}, email);
		return results;
	}

	public Member selectByEmail3(String email) {
		List<Member> results = jdbcTemplate.query("SELECT * FROM MEMBER WHERE EMAIL = ?",
				(ResultSet rs, int rowNum) -> {
					Member member = new Member(rs.getString("EMAIL"), rs.getString("PASSWORD"), rs.getString("NAME"),
							rs.getTimestamp("REGDATE").toLocalDateTime());
					member.setId(rs.getLong("ID"));
					return member;
				}, email);
		return results.isEmpty() ? null : results.get(0);
	}

	public void insert(Member member) {

	}

	public void update(Member member) {

	}

	public Collection<Member> selectAll() {
		return null;
	}
}
